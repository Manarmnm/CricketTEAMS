/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import java.util.Calendar;
import java.util.GregorianCalendar;
import MODEL.*;
import DATA.*;
/**
 *
 * @author MASS MNM
 */
public class MAIN_Frm extends javax.swing.JFrame {
   Login ll;
    /**
     * Creates new form MAIN_Frm
     */
    public MAIN_Frm() {
         initComponents();
        // l= new Login();
//         
//       if(AdminStatus.type.equals("Admin")){  
//           
//           
//            mnuregister.setVisible(true);
//           
//          lblstatus.setText("Welcome "+ l.getUName()+"!");
//          // this.l=l;
//             
//             
//             
//        }else if(AdminStatus.type.equals("Manager")){
//            mnuregister.setVisible(false);
//            
//        }else if(AdminStatus.type.equals("Players")){
//              mnuregister.setVisible(false);
//              mnuchngepwd.setVisible(false);
//        }
//        Calendar cal = new GregorianCalendar();
//        int month = cal.get(Calendar.MONTH);
//        int year = cal.get(Calendar.YEAR);
//        int day = cal.get(Calendar.DAY_OF_MONTH);
        //txtSyDate.setText(year + "/" + (month + 1) + "/" + day);
        
    }
//   
      public MAIN_Frm(Login e) {
         initComponents();
        
           lblstatus.setText("Welcome "+ e.getUName()+"!");
            this.ll=e;
         
       
    }
   
   
         
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        lbluname = new javax.swing.JLabel();
        lblstatus = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmnuBatsamn = new javax.swing.JMenuItem();
        mnubowler = new javax.swing.JMenuItem();
        mnuAllrounder = new javax.swing.JMenuItem();
        mnuWkeeper = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuregister = new javax.swing.JMenuItem();
        mnuchngepwd = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenuItem2.setText("jMenuItem2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jLabel1.setIcon(new javax.swing.ImageIcon("F:\\Final Project\\CricketTeam_PlayerSelection\\src\\com\\player\\Images\\Pallekele-Cricket-Stadium-001.jpg")); // NOI18N
        jLabel1.setText("jLabel1");

        jMenu1.setText("File");

        jmnuBatsamn.setText("BATSMAN FORM");
        jmnuBatsamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuBatsamnActionPerformed(evt);
            }
        });
        jMenu1.add(jmnuBatsamn);

        mnubowler.setText("BOWLER FORM");
        mnubowler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnubowlerActionPerformed(evt);
            }
        });
        jMenu1.add(mnubowler);

        mnuAllrounder.setText("ALL ROUNDER FORM");
        mnuAllrounder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAllrounderActionPerformed(evt);
            }
        });
        jMenu1.add(mnuAllrounder);

        mnuWkeeper.setText("WICKETKEEPER FORM");
        mnuWkeeper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuWkeeperActionPerformed(evt);
            }
        });
        jMenu1.add(mnuWkeeper);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        mnuregister.setText("REGISTER FORM");
        mnuregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuregisterActionPerformed(evt);
            }
        });
        jMenu2.add(mnuregister);

        mnuchngepwd.setText("CHANGE PASSWORD");
        mnuchngepwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuchngepwdActionPerformed(evt);
            }
        });
        jMenu2.add(mnuchngepwd);

        jMenuBar1.add(jMenu2);

        jMenu7.setText("Help");
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbluname)
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 939, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lbluname))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmnuBatsamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuBatsamnActionPerformed
        // TODO add your handling code here:
        Batsman_Frm BatFrm=new  Batsman_Frm(); //click the the Employee get the Employee frame
        BatFrm.setVisible(true);
    }//GEN-LAST:event_jmnuBatsamnActionPerformed

    private void mnubowlerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnubowlerActionPerformed
        // TODO add your handling code here:
        Bowler_Frm BowlFrm=new  Bowler_Frm(); 
        BowlFrm.setVisible(true);
    }//GEN-LAST:event_mnubowlerActionPerformed

    private void mnuAllrounderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAllrounderActionPerformed
        // TODO add your handling code here:
       Allrounder_Frm AllrFrm=new  Allrounder_Frm(); 
        AllrFrm.setVisible(true);
    }//GEN-LAST:event_mnuAllrounderActionPerformed

    private void mnuWkeeperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuWkeeperActionPerformed
        // TODO add your handling code here:
        WicketKeeper_Frm WkFrm=new  WicketKeeper_Frm(); 
        WkFrm.setVisible(true);
    }//GEN-LAST:event_mnuWkeeperActionPerformed

    private void mnuregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuregisterActionPerformed
        // TODO add your handling code here:
       Register_Frm RgFrm=new  Register_Frm(); 
        RgFrm.setVisible(true);
    }//GEN-LAST:event_mnuregisterActionPerformed

    private void mnuchngepwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuchngepwdActionPerformed
        // TODO add your handling code here:
        ChangePwd_Frm chg_Frm= new ChangePwd_Frm();
        chg_Frm.setVisible(true);
    }//GEN-LAST:event_mnuchngepwdActionPerformed

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
            java.util.logging.Logger.getLogger(MAIN_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAIN_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAIN_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAIN_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAIN_Frm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jmnuBatsamn;
    private javax.swing.JLabel lblstatus;
    private javax.swing.JLabel lbluname;
    private javax.swing.JMenuItem mnuAllrounder;
    private javax.swing.JMenuItem mnuWkeeper;
    private javax.swing.JMenuItem mnubowler;
    private javax.swing.JMenuItem mnuchngepwd;
    private javax.swing.JMenuItem mnuregister;
    // End of variables declaration//GEN-END:variables
}
