package ust.gui.latihan;
import java.net.URL;
import javax.swing.*;
public class FrameB extends javax.swing.JFrame {
    public FrameB() {
        super("Frame dan Button");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
        FrameB fb = new FrameB();
        JPanel panel = new JPanel();
        URL img = FrameB.class.getResource("frame.png");
        JButton jbtOK = new JButton("OK");
        JButton jbtImg = new JButton(new ImageIcon(img));
        panel.add(jbtOK);
        panel.add(jbtImg);
        fb.add(panel);
        fb.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
