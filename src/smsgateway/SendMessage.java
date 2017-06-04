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
import java.util.Properties;


public class SendMessage
{
        public void doIt(String nomor, String pesan) throws Exception
        {
//            Properties prop = new Properties();
//            InputStream input = null;
//
//            try{
//                input = new FileInputStream("settingmodem.properties");
//		// load a properties file
//		prop.load(input);
//		// get the property value and print it out
//		System.out.println(prop.getProperty("comPort"));
//		System.out.println(prop.getProperty("baudRate"));
//            }catch (IOException ex) {
//		ex.printStackTrace();
//            }finally {
//                if (input != null) {
//                    try {
//                        input.close();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
            
            OutboundNotification outboundNotification = new OutboundNotification();
//                System.out.println("Example: Send message from a serial gsm modem.");
//                System.out.println(Library.getLibraryDescription());
//                System.out.println("Version: " + Library.getLibraryVersion());
                SerialModemGateway gateway = new SerialModemGateway("", "COM9", 9600, "", "AirCard 312U");
                gateway.setInbound(true);
                gateway.setOutbound(true);
                Service.getInstance().setOutboundMessageNotification(outboundNotification);
                Service.getInstance().addGateway(gateway);
                Service.getInstance().startService();
//                System.out.println();
//                System.out.println("Modem Information:");
//                System.out.println("  Manufacturer: " + gateway.getManufacturer());
//                System.out.println("  Model: " + gateway.getModel());
//                System.out.println("  Serial No: " + gateway.getSerialNo());
//                System.out.println("  SIM IMSI: " + gateway.getImsi());
//                System.out.println("  Signal Level: " + gateway.getSignalLevel() + " dBm");
//                System.out.println("  Battery Level: " + gateway.getBatteryLevel() + "%");
//                System.out.println();
                OutboundMessage msg = new OutboundMessage(nomor, pesan);
                Service.getInstance().sendMessage(msg);
                System.out.println(msg);
//                System.in.read();
                Service.getInstance().stopService();
        }

        public class OutboundNotification implements IOutboundMessageNotification
        {
                public void process(AGateway gateway, OutboundMessage msg)
                {
                        System.out.println("Outbound handler called from Gateway: " + gateway.getGatewayId());
                        System.out.println(msg);
                }
        }
}
