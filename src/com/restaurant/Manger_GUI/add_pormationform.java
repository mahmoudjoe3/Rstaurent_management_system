/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.Manger_GUI;

import AppPackage.AnimationClass;
import com.restaurant.Manger_Calsses.Pormotion;
import javax.swing.JFrame;
 

public class add_pormationform extends javax.swing.JFrame {
public Pormotion a(){
       Pormotion pp=new Pormotion(Integer.valueOf(por_idTX.getText()) ,Integer.valueOf(por_discountTX.getText()), por_releasedDateTX.getText(), por_expiredDateTX.getText());
return pp;
}
    AnimationClass ac = new AnimationClass();
    public add_pormationform() {
        initComponents();
        this.setLocationRelativeTo(null);
        //SlideShow();
        por_idTX.setBackground(new java.awt.Color(0,0,0,1));
        por_discountTX.setBackground(new java.awt.Color(0,0,0,1));
        por_releasedDateTX.setBackground(new java.awt.Color(0,0,0,1));
        por_expiredDateTX.setBackground(new java.awt.Color(0,0,0,1));
    }
    public void SlideShow()
{
    new Thread(new Runnable() {
            int count = 0;
            @Override
            public void run() {
                try{
                    while(true){
                        switch(count){
                            
                            case 0:
                                Thread.sleep(3000);
                                ac.jLabelXLeft(0, -1080, 20, 10, jLabel3);
                                count++;
                                break;
                        }
                    }
                }
                catch(Exception e){
                    
                }
            }
        }).start();
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        por_idTX = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        por_discountTX = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        por_releasedDateTX = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        por_expiredDateTX = new javax.swing.JTextField();
        conferm_por = new keeptoo.KButton();
        backtoitemB = new keeptoo.KButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 620));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1080, 620));
        setSize(new java.awt.Dimension(1080, 620));
        getContentPane().setLayout(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 70, 19, 22);

        por_idTX.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        por_idTX.setForeground(new java.awt.Color(255, 255, 255));
        por_idTX.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        por_idTX.setOpaque(false);
        getContentPane().add(por_idTX);
        por_idTX.setBounds(200, 65, 250, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Discount");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(60, 160, 68, 22);

        por_discountTX.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        por_discountTX.setForeground(new java.awt.Color(255, 255, 255));
        por_discountTX.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        por_discountTX.setOpaque(false);
        getContentPane().add(por_discountTX);
        por_discountTX.setBounds(200, 155, 250, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Released Date");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(60, 250, 111, 22);

        por_releasedDateTX.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        por_releasedDateTX.setForeground(new java.awt.Color(255, 255, 255));
        por_releasedDateTX.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        por_releasedDateTX.setOpaque(false);
        getContentPane().add(por_releasedDateTX);
        por_releasedDateTX.setBounds(200, 245, 250, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Expired date");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(60, 330, 98, 22);

        por_expiredDateTX.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        por_expiredDateTX.setForeground(new java.awt.Color(255, 255, 255));
        por_expiredDateTX.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        por_expiredDateTX.setOpaque(false);
        por_expiredDateTX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                por_expiredDateTXActionPerformed(evt);
            }
        });
        getContentPane().add(por_expiredDateTX);
        por_expiredDateTX.setBounds(200, 335, 250, 30);

        conferm_por.setText("Confirm");
        conferm_por.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        conferm_por.setkBackGroundColor(new java.awt.Color(51, 51, 51));
        conferm_por.setkBorderRadius(50);
        conferm_por.setkEndColor(new java.awt.Color(51, 51, 0));
        conferm_por.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        conferm_por.setkHoverForeGround(new java.awt.Color(0, 153, 153));
        conferm_por.setkHoverStartColor(new java.awt.Color(0, 102, 102));
        conferm_por.setkIndicatorThickness(0);
        conferm_por.setkSelectedColor(new java.awt.Color(204, 0, 0));
        conferm_por.setkStartColor(new java.awt.Color(0, 102, 102));
        conferm_por.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conferm_porActionPerformed(evt);
            }
        });
        getContentPane().add(conferm_por);
        conferm_por.setBounds(160, 480, 185, 45);

        backtoitemB.setBorder(null);
        backtoitemB.setText("BACK");
        backtoitemB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backtoitemB.setkBackGroundColor(new java.awt.Color(51, 51, 51));
        backtoitemB.setkBorderRadius(0);
        backtoitemB.setkEndColor(new java.awt.Color(51, 51, 0));
        backtoitemB.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        backtoitemB.setkHoverForeGround(new java.awt.Color(0, 153, 153));
        backtoitemB.setkHoverStartColor(new java.awt.Color(0, 102, 102));
        backtoitemB.setkIndicatorThickness(0);
        backtoitemB.setkSelectedColor(new java.awt.Color(204, 0, 0));
        backtoitemB.setkStartColor(new java.awt.Color(0, 102, 102));
        backtoitemB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtoitemBActionPerformed(evt);
            }
        });
        getContentPane().add(backtoitemB);
        backtoitemB.setBounds(0, 0, 40, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/restaurant-food-01.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1080, 620);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resumen-degradado-negro-lujo-fondo-negro-vignette-backgr_1258-275.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 540, 620);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Dark-and-moody-food-photography-3.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(540, 0, 540, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void conferm_porActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conferm_porActionPerformed
     Pormotion  p=new Pormotion(Integer.valueOf(por_idTX.getText()) ,Integer.valueOf(por_discountTX.getText()), por_releasedDateTX.getText(), por_expiredDateTX.getText());
        
        additemform.getpo(p);  
        additemform.setstat("withpormotion");
         this.hide();
    }//GEN-LAST:event_conferm_porActionPerformed

    private void backtoitemBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtoitemBActionPerformed

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_backtoitemBActionPerformed

    private void por_expiredDateTXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_por_expiredDateTXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_por_expiredDateTXActionPerformed

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
            java.util.logging.Logger.getLogger(add_pormationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_pormationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_pormationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_pormationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_pormationform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton backtoitemB;
    private keeptoo.KButton conferm_por;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField por_discountTX;
    private javax.swing.JTextField por_expiredDateTX;
    private javax.swing.JTextField por_idTX;
    private javax.swing.JTextField por_releasedDateTX;
    // End of variables declaration//GEN-END:variables
}