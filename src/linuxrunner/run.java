/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linuxrunner;

import java.awt.Dimension;
import static java.awt.PageAttributes.MediaType.B;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author obissick
 */
public class run {
    public static void main(String[] args){
    SwingUtilities.invokeLater(new Runnable(){
        @Override
        public void run(){
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            double width = screenSize.getWidth();
            double height = screenSize.getHeight();
            JFrame frame = new JFrame("Linux Runner");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            //frame.setResizable(false);
            
            frame.getContentPane().add(new ui());
            frame.pack();
            frame.setVisible(true);
        }
    });
}
}
