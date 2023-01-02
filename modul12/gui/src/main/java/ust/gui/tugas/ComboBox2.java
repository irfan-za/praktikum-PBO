/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ust.gui.tugas;

import java.awt.event.ItemEvent;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;

/**
 *
 * @author irfan
 */
public class ComboBox2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tugas 2");
        JMenuBar menubar = new JMenuBar();
        JMenu menu = new JMenu("Ubah Warna");
        
        ButtonGroup bg = new ButtonGroup();
        JRadioButtonMenuItem btnMerah = new JRadioButtonMenuItem("Merah");        
        JRadioButtonMenuItem btnKuning = new JRadioButtonMenuItem("Kuning");
        JRadioButtonMenuItem btnHijau = new JRadioButtonMenuItem("Hijau");
        
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 250, 250);
        btnMerah.addItemListener((e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                panel.setBackground(new java.awt.Color(255,0,0));
            }
        });
        btnKuning.addItemListener((e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                panel.setBackground(new java.awt.Color(255,255,0));
            }
        });
        btnHijau.addItemListener((e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                panel.setBackground(new java.awt.Color(0,255,0));
            }
        });
        bg.add(btnMerah);
        bg.add(btnKuning);
        bg.add(btnHijau);
        menu.add(btnMerah);
        menu.add(btnKuning);
        menu.add(btnHijau);
        menubar.add(menu);
        frame.setJMenuBar(menubar);
        frame.add(panel);
        frame.setSize(300, 350);
        frame.setVisible(true);         
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
}