/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smsgateway;
/**
 *
 * @author risnawan
 */
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

public class lokasi {
    
   public static void main(String[] args) {
       final Browser browser = new Browser();
       BrowserView browserView = new BrowserView(browser);

       JFrame frame = new JFrame("Google Maps");
       frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
       frame.add(browserView, BorderLayout.CENTER);
       frame.setSize(900, 500);
       frame.setLocationRelativeTo(null);
       frame.setVisible(true);
       frame.setLocationRelativeTo(null);
       frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
       
       browser.loadURL("https://www.google.co.id/maps/");

   }
   
}
