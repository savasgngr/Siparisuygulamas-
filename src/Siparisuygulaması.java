
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAVAS
 */
public class Siparisuygulaması extends javax.swing.JFrame {
Map<String,Integer> siparis=new LinkedHashMap<String,Integer>();
    /**
     * Creates new form Siparisuygulaması
     */
    public Siparisuygulaması() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        iskender = new javax.swing.JCheckBox();
        beyti = new javax.swing.JCheckBox();
        salata = new javax.swing.JCheckBox();
        ayran = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sipariş uygulaması");

        jLabel1.setText("MENÜ");

        iskender.setText("İskender 15tl");

        beyti.setText("Beyti 20 tl");

        salata.setText("salata 5 tl");

        ayran.setText("ayran 3 tl");

        jButton1.setText("Sipariş ver ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(ayran)
                    .addComponent(salata)
                    .addComponent(beyti)
                    .addComponent(iskender)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(iskender)
                .addGap(28, 28, 28)
                .addComponent(beyti)
                .addGap(18, 18, 18)
                .addComponent(salata)
                .addGap(18, 18, 18)
                .addComponent(ayran)
                .addGap(55, 55, 55)
                .addComponent(jButton1)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (iskender.isSelected()) {
            siparis.put("iskender", 15);
        }else{
            siparis.remove("iskender");
        }
        if (beyti.isSelected()) {
            siparis.put("beyti", 20);
        }else{
            siparis.remove("beyti");
        }
        if (salata.isSelected()) {
            siparis.put("salata", 5);
        }else{
            siparis.remove("salata");
        }if (ayran.isSelected()) {
            siparis.put("ayran", 3);
        }else{
            siparis.remove("ayran");
        }
        siparislerigoster();
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Siparisuygulaması.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Siparisuygulaması.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Siparisuygulaması.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Siparisuygulaması.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Siparisuygulaması().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ayran;
    private javax.swing.JCheckBox beyti;
    private javax.swing.JCheckBox iskender;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox salata;
    // End of variables declaration//GEN-END:variables

    public void siparislerigoster() {
       String mesaj="";
        int tutar=0;
        if (siparis.isEmpty()) {
            mesaj="siparişiniz bulunmamaktadır.";
        }else{
            for(Map.Entry<String,Integer> entry: siparis.entrySet()){
            mesaj+=entry.getKey()+"\n";
            tutar+=entry.getValue();
                    }
            mesaj+="toplam tutar:"+tutar;
                    }
        JOptionPane.showMessageDialog(this, mesaj); 
    }
}
