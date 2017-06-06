/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smsgateway;

import java.util.Properties;
import org.smslib.AGateway;
import org.smslib.IOutboundMessageNotification;
import org.smslib.Library;
import org.smslib.OutboundMessage;
import org.smslib.Service;
import org.smslib.modem.SerialModemGateway;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.swing.JOptionPane;


public class SendMessage
{
    private koneksi kon;
    private String sta;
//    private String kueri;
    
        public void doIt(String nomor, String pesan) throws Exception
        {
            Properties prop = new Properties();
            InputStream input = null;
            try {
		input = new FileInputStream("src/settingmodem.properties");
		// load a properties file
		prop.load(input);
		// get the property value and print it out
		System.out.println(prop.getProperty("baudRate"));
		System.out.println(prop.getProperty("comPort"));
		System.out.println(prop.getProperty("model")); 
        } catch (IOException ex) {
		ex.printStackTrace();
	} finally {
		if (input != null) {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
            
            OutboundNotification outboundNotification = new OutboundNotification();
                SerialModemGateway gateway = new SerialModemGateway("", prop.getProperty("comPort", "com9"), Integer.parseInt(prop.getProperty("baudRate", "9600")), "", prop.getProperty("model", "AirCard 312U"));
                gateway.setInbound(true);
                gateway.setOutbound(true);
                Service.getInstance().setOutboundMessageNotification(outboundNotification);
                Service.getInstance().addGateway(gateway);
                Service.getInstance().startService();
                OutboundMessage msg = new OutboundMessage(nomor, pesan);
                Service.getInstance().sendMessage(msg);
                System.out.println(msg);
                if(String.valueOf(msg.getMessageStatus()).equals("FAILED")){
                    sta = "tidak terkirim";
                    System.out.println(nomor + " gagal terkirim");
                    
                }else if(String.valueOf(msg.getMessageStatus()).equals("SENT")){
                    System.out.println(nomor + " berhasil terkirim");
                    sta = "terkirim";
                }
                simpanPesan(nomor, pesan, sta);
//                System.out.print(msg.getMessageStatus());
                Service.getInstance().stopService();
                Service.getInstance().removeGateway(gateway);
        }

        public class OutboundNotification implements IOutboundMessageNotification
        {
                public void process(AGateway gateway, OutboundMessage msg)
                {
                        System.out.println("Outbound handler called from Gateway: " + gateway.getGatewayId());
                        System.out.println(msg);
                }
        }
        
        public void simpanPesan (String nomor, String pesan, String status) throws ClassNotFoundException {
        kon = new koneksi();
//        notujuan = txt_notujuan.getText(); //VARIABEL UNTUK SENDMESSAGE
//        isipesan = txt_isipesan.getText(); //VARIABEL UNTUK SENDMESSAGE
        
        try {
            Statement stasql = (Statement)kon.Connect().createStatement();
            int runkueri = stasql.executeUpdate("insert into pesan (id_pesan, no_tujuan, isi_pesan, waktu, status) VALUES (NULL, '"+nomor+"','"+pesan+"', now(),'"+status+"')"); //Database pesan, field no_tujuan dan isi_pesan
//            JOptionPane.showMessageDialog(null,"Pesan berhasil disimpan");
            stasql.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
}
