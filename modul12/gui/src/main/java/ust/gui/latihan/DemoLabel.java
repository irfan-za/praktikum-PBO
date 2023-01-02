
package ust.gui.latihan;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class DemoLabel {
    public static void main(String[] args) {
        URL img = FrameB.class.getResource("tani.png");
        ImageIcon ikon = new ImageIcon(img);
        JLabel label = new JLabel("Label", ikon, SwingConstants.CENTER);
        JPanel panel = new JPanel();
        panel.add(label); 
        Utama u = new Utama();
        u.setSize(500,500);
        u.add(panel);   
        }
    }

