/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import MODEL.*;
import CONTROLLER.*;
/**
 *
 * @author MASS MNM
 */
public class ViewAllRounder_Frm extends javax.swing.JFrame {
private MasterDB MasterDB;
private DefaultTableModel tblModel;
    /**
     * Creates new form ViewAllRounder_Frm
     */
    public ViewAllRounder_Frm() {
        initComponents();
        
         MasterDB=new MasterDB();
        
        
        tblModel=new DefaultTableModel();
        tblallrounder.setModel(tblModel);
        
        tblModel.addColumn("Team_Name");
        tblModel.addColumn("Player Name");
        tblModel.addColumn("Player Role");
        tblModel.addColumn("Total Match");
        tblModel.addColumn("Nationality");
        tblModel.addColumn("Strike Rate");
        tblModel.addColumn("Average"); 
        tblModel.addColumn("Bowling Economy");
        tblModel.addColumn("Bowling Average");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnallronder = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblallrounder = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cmballrouder = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(810, 420));
        setMinimumSize(new java.awt.Dimension(810, 420));
        setPreferredSize(new java.awt.Dimension(810, 420));
        getContentPane().setLayout(null);

        btnallronder.setBackground(new java.awt.Color(0, 0, 0));
        btnallronder.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnallronder.setForeground(new java.awt.Color(255, 255, 255));
        btnallronder.setText("SEARCH");
        btnallronder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnallronderActionPerformed(evt);
            }
        });
        getContentPane().add(btnallronder);
        btnallronder.setBounds(460, 70, 104, 30);

        tblallrounder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblallrounder);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 140, 780, 230);

        jLabel2.setFont(new java.awt.Font("Century", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("View All Rounders");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 10, 190, 20);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 40, 560, 10);

        cmballrouder.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL ROUNDER" }));
        getContentPane().add(cmballrouder);
        cmballrouder.setBounds(270, 70, 180, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/viewAll.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 800, 390);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnallronderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnallronderActionPerformed
        // TODO add your handling code here:
        
        tblModel.setRowCount(0);
        String PRole=cmballrouder.getSelectedItem().toString();
        ArrayList<Team_Players> pList=MasterDB.GetTeam(PRole);
        
        for(Team_Players atn:pList){
            
           tblModel.addRow(new Object[]{atn.getTeam_Name(),atn.getPlayerName(), atn.getPlayerRole(),atn.getTotalMatchs(),atn.getNationality(),atn.getBat_Strike_Rate(),atn.getBat_Average(),atn.getBowl_Economy(),atn.getBowl_Average()}); 
        }
    }//GEN-LAST:event_btnallronderActionPerformed

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
            java.util.logging.Logger.getLogger(ViewAllRounder_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAllRounder_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAllRounder_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAllRounder_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAllRounder_Frm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnallronder;
    private javax.swing.JComboBox<String> cmballrouder;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblallrounder;
    // End of variables declaration//GEN-END:variables
}