/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import CONTROLLER.*;
import MODEL.*;

/**
 *
 * @author MASS MNM
 */
public class Main_Frm extends javax.swing.JFrame {

    /**
     * Creates new form Main_Frm
     */
    public Main_Frm() {
        initComponents();
        
               if(AdminStatus.type.equals("Super Admin")){  
                   
               }else if(AdminStatus.type.equals("Manager")){
                    mnuPCategory.setVisible(false);   
                    mnuAllrounder.setVisible(false);
                    mnuBatsman.setVisible(false);
                    mnuBowler.setVisible(false);
                    mnuWicketKeeper.setVisible(false);
               }else if(AdminStatus.type.equals("Players")){
                    mnuChangePassword.setVisible(false);
                    mnuPCategory.setVisible(false);
                    mnuAllrounder.setVisible(false);
                    mnuBatsman.setVisible(false);
                    mnuBowler.setVisible(false);
                    mnuWicketKeeper.setVisible(false);
                    mnuNewAllrounder.setVisible(false);
                    mnunewbatsman.setVisible(false);
                    mnunewbowler.setVisible(false);
                    mnuNewkeeper.setVisible(false);
               }
               
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
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        lblDate = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuBatsmans = new javax.swing.JMenu();
        mnuBatsman = new javax.swing.JMenuItem();
        mnunewbatsman = new javax.swing.JMenuItem();
        mnuBowlers = new javax.swing.JMenu();
        mnuBowler = new javax.swing.JMenuItem();
        mnunewbowler = new javax.swing.JMenuItem();
        mnuAllrouders = new javax.swing.JMenu();
        mnuAllrounder = new javax.swing.JMenuItem();
        mnuNewAllrounder = new javax.swing.JMenuItem();
        mnuKeepers = new javax.swing.JMenu();
        mnuWicketKeeper = new javax.swing.JMenuItem();
        mnuNewkeeper = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuViewBatsman = new javax.swing.JMenuItem();
        mnuViewBowler = new javax.swing.JMenuItem();
        mnuViewAllrounder = new javax.swing.JMenuItem();
        mnuViewWicketKeeper = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuChangePassword = new javax.swing.JMenuItem();
        mnuResgister = new javax.swing.JMenuItem();
        mnuPCategory = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenu7.setText("jMenu7");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(703, 455));
        getContentPane().setLayout(null);

        lblDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/main.jpg"))); // NOI18N
        getContentPane().add(lblDate);
        lblDate.setBounds(0, 0, 700, 400);

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenu1.setText("File");

        mnuBatsmans.setText("BATSMAN FORM");

        mnuBatsman.setText("Training Batsman");
        mnuBatsman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBatsmanActionPerformed(evt);
            }
        });
        mnuBatsmans.add(mnuBatsman);

        mnunewbatsman.setText("New Batsman");
        mnunewbatsman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnunewbatsmanActionPerformed(evt);
            }
        });
        mnuBatsmans.add(mnunewbatsman);

        jMenu1.add(mnuBatsmans);

        mnuBowlers.setText("BOWLER FORM");

        mnuBowler.setText("Training Bowler");
        mnuBowler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBowlerActionPerformed(evt);
            }
        });
        mnuBowlers.add(mnuBowler);

        mnunewbowler.setText("New Bowler");
        mnunewbowler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnunewbowlerActionPerformed(evt);
            }
        });
        mnuBowlers.add(mnunewbowler);

        jMenu1.add(mnuBowlers);

        mnuAllrouders.setText("ALLROUNDER FORM");

        mnuAllrounder.setText("Training All Rounder");
        mnuAllrounder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAllrounderActionPerformed(evt);
            }
        });
        mnuAllrouders.add(mnuAllrounder);

        mnuNewAllrounder.setText("New All Rounder");
        mnuNewAllrounder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNewAllrounderActionPerformed(evt);
            }
        });
        mnuAllrouders.add(mnuNewAllrounder);

        jMenu1.add(mnuAllrouders);

        mnuKeepers.setText("WICKET KEEPER FORM");

        mnuWicketKeeper.setText("Training Wicket Keeper");
        mnuWicketKeeper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuWicketKeeperActionPerformed(evt);
            }
        });
        mnuKeepers.add(mnuWicketKeeper);

        mnuNewkeeper.setText("New Wicket Keeper");
        mnuNewkeeper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNewkeeperActionPerformed(evt);
            }
        });
        mnuKeepers.add(mnuNewkeeper);

        jMenu1.add(mnuKeepers);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("View");

        mnuViewBatsman.setText("VIEW TEAM BATSMAN LIST");
        mnuViewBatsman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuViewBatsmanActionPerformed(evt);
            }
        });
        jMenu2.add(mnuViewBatsman);

        mnuViewBowler.setText("VIEW TEAM BOWLER LIST");
        mnuViewBowler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuViewBowlerActionPerformed(evt);
            }
        });
        jMenu2.add(mnuViewBowler);

        mnuViewAllrounder.setText("VIEW TEAM ALLROUNDER LIST");
        mnuViewAllrounder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuViewAllrounderActionPerformed(evt);
            }
        });
        jMenu2.add(mnuViewAllrounder);

        mnuViewWicketKeeper.setText("VIEW TEAM WICKET KEEPER LIST");
        mnuViewWicketKeeper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuViewWicketKeeperActionPerformed(evt);
            }
        });
        jMenu2.add(mnuViewWicketKeeper);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Tools");

        mnuChangePassword.setText("CHANGE PASSWORD");
        mnuChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuChangePasswordActionPerformed(evt);
            }
        });
        jMenu3.add(mnuChangePassword);

        mnuResgister.setText("REGISTER FORM");
        mnuResgister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuResgisterActionPerformed(evt);
            }
        });
        jMenu3.add(mnuResgister);

        mnuPCategory.setText("ADD PLAYER CATGEGORY");
        mnuPCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPCategoryActionPerformed(evt);
            }
        });
        jMenu3.add(mnuPCategory);

        jMenuBar1.add(jMenu3);

        jMenu6.setText("Reports");
        jMenuBar1.add(jMenu6);

        jMenu8.setText("Run");
        jMenuBar1.add(jMenu8);

        jMenu9.setText("About");
        jMenuBar1.add(jMenu9);

        jMenu10.setText("Help");
        jMenuBar1.add(jMenu10);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuBatsmanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBatsmanActionPerformed
        // TODO add your handling code here:
           Batsman_Frm Batsman=new  Batsman_Frm();  
           Batsman.setVisible(true);
    }//GEN-LAST:event_mnuBatsmanActionPerformed

    private void mnuBowlerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBowlerActionPerformed
        // TODO add your handling code here:
           Bowler_Frm Bowler=new  Bowler_Frm();  
           Bowler.setVisible(true);
    }//GEN-LAST:event_mnuBowlerActionPerformed

    private void mnuAllrounderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAllrounderActionPerformed
        // TODO add your handling code here:
        Allrounder_Frm AllRounder=new  Allrounder_Frm(); 
        AllRounder.setVisible(true);
    }//GEN-LAST:event_mnuAllrounderActionPerformed

    private void mnuWicketKeeperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuWicketKeeperActionPerformed
        // TODO add your handling code here:
        WicketKeeper_Frm WicketKeeper=new  WicketKeeper_Frm(); 
        WicketKeeper.setVisible(true);
    }//GEN-LAST:event_mnuWicketKeeperActionPerformed

    private void mnuChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuChangePasswordActionPerformed
        // TODO add your handling code here:
        ChangePassword_Frm ChangePassword= new ChangePassword_Frm();
        ChangePassword.setVisible(true);
    }//GEN-LAST:event_mnuChangePasswordActionPerformed

    private void mnuResgisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuResgisterActionPerformed
        // TODO add your handling code here:
        REGISTER_Frm Register=new  REGISTER_Frm(); 
        Register.setVisible(true);
    }//GEN-LAST:event_mnuResgisterActionPerformed

    private void mnuViewBowlerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuViewBowlerActionPerformed
        // TODO add your handling code here:
         ViewBowlerList_Frm ViewBowler=new  ViewBowlerList_Frm(); 
         ViewBowler.setVisible(true);
    }//GEN-LAST:event_mnuViewBowlerActionPerformed

    private void mnuPCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPCategoryActionPerformed
        // TODO add your handling code here:
        PlayersCategory_Frm Register=new  PlayersCategory_Frm(); 
        Register.setVisible(true);
    }//GEN-LAST:event_mnuPCategoryActionPerformed

    private void mnunewbatsmanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnunewbatsmanActionPerformed
        // TODO add your handling code here:
        Batsman_SelectionFrm  NewBatsman=new  Batsman_SelectionFrm(); 
        NewBatsman.setVisible(true);
    }//GEN-LAST:event_mnunewbatsmanActionPerformed

    private void mnunewbowlerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnunewbowlerActionPerformed
        // TODO add your handling code here:
        Bowler_SelectionFrm  NewBowler=new  Bowler_SelectionFrm(); 
        NewBowler.setVisible(true);
    }//GEN-LAST:event_mnunewbowlerActionPerformed

    private void mnuNewAllrounderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNewAllrounderActionPerformed
        // TODO add your handling code here:
        AllRounder_SelectionFrm  NewAllRounder=new  AllRounder_SelectionFrm(); 
        NewAllRounder.setVisible(true);
    }//GEN-LAST:event_mnuNewAllrounderActionPerformed

    private void mnuNewkeeperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNewkeeperActionPerformed
        // TODO add your handling code here:
         WicketKeeper_SelectionFrm  Keeper=new  WicketKeeper_SelectionFrm(); 
         Keeper.setVisible(true);
    }//GEN-LAST:event_mnuNewkeeperActionPerformed

    private void mnuViewBatsmanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuViewBatsmanActionPerformed
        // TODO add your handling code here:
         ViewBatsmanList_Frm  ViewBatsman=new  ViewBatsmanList_Frm(); 
         ViewBatsman.setVisible(true);
    }//GEN-LAST:event_mnuViewBatsmanActionPerformed

    private void mnuViewAllrounderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuViewAllrounderActionPerformed
        // TODO add your handling code here:
         ViewAllRounder_Frm  ViewAllrounder=new  ViewAllRounder_Frm(); 
         ViewAllrounder.setVisible(true);
    }//GEN-LAST:event_mnuViewAllrounderActionPerformed

    private void mnuViewWicketKeeperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuViewWicketKeeperActionPerformed
        // TODO add your handling code here:
         ViewWicketKeeper_Frm ViewKeeper=new  ViewWicketKeeper_Frm(); 
         ViewKeeper.setVisible(true);
    }//GEN-LAST:event_mnuViewWicketKeeperActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Main_Frm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JLabel lblDate;
    private javax.swing.JMenu mnuAllrouders;
    private javax.swing.JMenuItem mnuAllrounder;
    private javax.swing.JMenuItem mnuBatsman;
    private javax.swing.JMenu mnuBatsmans;
    private javax.swing.JMenuItem mnuBowler;
    private javax.swing.JMenu mnuBowlers;
    private javax.swing.JMenuItem mnuChangePassword;
    private javax.swing.JMenu mnuKeepers;
    private javax.swing.JMenuItem mnuNewAllrounder;
    private javax.swing.JMenuItem mnuNewkeeper;
    private javax.swing.JMenuItem mnuPCategory;
    private javax.swing.JMenuItem mnuResgister;
    private javax.swing.JMenuItem mnuViewAllrounder;
    private javax.swing.JMenuItem mnuViewBatsman;
    private javax.swing.JMenuItem mnuViewBowler;
    private javax.swing.JMenuItem mnuViewWicketKeeper;
    private javax.swing.JMenuItem mnuWicketKeeper;
    private javax.swing.JMenuItem mnunewbatsman;
    private javax.swing.JMenuItem mnunewbowler;
    // End of variables declaration//GEN-END:variables
}
