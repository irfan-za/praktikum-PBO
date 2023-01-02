package ust.gui.latihan;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class DemoTextField {
    public static void main(String[] args) {
        JLabel nama = new JLabel("Nama :");
        JLabel password = new JLabel("Password :");
        JTextField inputNama = new JTextField(15);
        JPasswordField inputPsw =  new JPasswordField(15);
        JPanel panel = new JPanel();
        panel.setSize(250, 200);
        panel.add(nama);
        panel.add(inputNama);
        panel.add(password);
        panel.add(inputPsw);
        Utama u = new Utama();
        u.add(panel);
    }
    
}
