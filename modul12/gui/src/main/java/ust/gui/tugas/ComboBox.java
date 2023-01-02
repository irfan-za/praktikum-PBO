
package ust.gui.tugas;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author irfan
 */
public class ComboBox {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tugas 1");
        JLabel judul = new JLabel("Modul Praktikum Pemrograman Beriorientasi Objek Jelas dan Mudah");
        
        String[] list = {"Sangat tidak setuju", "tidak setuju", "kurang setuju",
            "kurang setuju", "Setuju", "Sangat Setuju",};
        JComboBox comboBoxOption = new JComboBox(list);
        
        judul.setBounds(30, 50, 400, 25);
        comboBoxOption.setBounds(125, 80, 200, 25);
        frame.setSize(500, 150);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(comboBoxOption);
        frame.add(judul);
    }
}
