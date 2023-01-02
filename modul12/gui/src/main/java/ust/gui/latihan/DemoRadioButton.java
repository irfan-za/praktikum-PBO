package ust.gui.latihan;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
public class DemoRadioButton {
    public static void main(String[] args) {
        
        Utama u = new Utama();
        u.setSize(500,100);
        JRadioButton[] teams = new JRadioButton[4];
        teams [0] = new JRadioButton("Sangat tidak setuju");
        teams [1] = new JRadioButton("tidak setuju");
        teams [2] = new JRadioButton("kurang setuju");
        teams [3] = new JRadioButton("Setuju", true);
        teams [3] = new JRadioButton("Sangat Setuju");
        JPanel panel = new JPanel();
        JLabel Pernyataan = new JLabel("Modul Praktikum Pemrograman Beriorientasi Objek Jelas dan Mudah");
        panel.add(Pernyataan);
        ButtonGroup group = new ButtonGroup();
        for (int i = 0; i < teams.length; i++) {
            group.add(teams[i]);
            panel.add(teams[i]);
        }
        
        u.add(panel);
        u.setVisible(true);
    }
    
}
