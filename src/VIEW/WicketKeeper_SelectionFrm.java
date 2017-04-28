/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import MODEL.*;
import CONTROLLER.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.stream.DoubleStream;
import javax.swing.JOptionPane;

/**
 *
 * @author MASS MNM
 */
public class WicketKeeper_SelectionFrm extends javax.swing.JFrame {
private MasterDB MasterDB;
    /**
     * Creates new form WicketKeeper_SelectionFrm
     */
    public WicketKeeper_SelectionFrm() {
        initComponents();
         MasterDB=new MasterDB();
    }
    
   private boolean isValidate(){ 
       
        if (txtplayername.getText().equals(""))  
        {
            JOptionPane.showMessageDialog(rootPane, "Player Name is a requied field");  //help message
            txtplayername.requestFocusInWindow();
            return false;
        }
        if (txtnationality.getText().equals(""))  
        {
            JOptionPane.showMessageDialog(rootPane, "Nationality  is a requied field");  //help message
            txtnationality.requestFocusInWindow();
            return false;
        }
        if (txttotmatch.getText().equals("")) //flag=false;
        {
            JOptionPane.showMessageDialog(rootPane, "Total Match is a requied field");   
            txttotmatch.requestFocusInWindow();
            return false;
        }
        if (txtcatch.getText().equals("")) //flag=false;
        {
            JOptionPane.showMessageDialog(rootPane, "Total Catchs is a requied field");  
            txtcatch.requestFocusInWindow();
            return false;
        }
        if (txtstumps.getText().equals("")) //flag=false;
        {
            JOptionPane.showMessageDialog(rootPane, "Total Stumps is a requied field");  
            txtstumps.requestFocusInWindow();
            return false;
        }
        if (txtteamid.getText().equals("")) //flag=false;
        {
            JOptionPane.showMessageDialog(rootPane, "Team ID is a requied field");  
            txtteamid.requestFocusInWindow();
            return false;
        }
        if (txtteamname.getText().equals("")) //flag=false;
        {
            JOptionPane.showMessageDialog(rootPane, "Team Name is a requied field");  
            txtteamname.requestFocusInWindow();
            return false;
        }
     
        return true;
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
        cmbPRole = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtstumps = new javax.swing.JTextField();
        txtcatch = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtStumWeight = new javax.swing.JTextField();
        txtcatchweigth = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btbclear = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPrecStump = new javax.swing.JTextField();
        txtPrecCatch = new javax.swing.JTextField();
        lblexistingSWeight = new javax.swing.JLabel();
        lblexistingCatchWeight = new javax.swing.JLabel();
        btnproccess = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtnationality = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txttotmatch = new javax.swing.JTextField();
        txtplayername = new javax.swing.JTextField();
        txtteamname = new javax.swing.JTextField();
        txtteamid = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(860, 550));
        setMinimumSize(new java.awt.Dimension(860, 550));
        setPreferredSize(new java.awt.Dimension(860, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Player Role");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 80, 25));

        cmbPRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "WICKET KEEPER" }));
        getContentPane().add(cmbPRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 190, 30));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total Stumps");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total Catchs");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        txtstumps.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtstumpsKeyTyped(evt);
            }
        });
        getContentPane().add(txtstumps, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 208, 29));

        txtcatch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcatchKeyTyped(evt);
            }
        });
        getContentPane().add(txtcatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 208, 30));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Stump Weight");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Catch Weight");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        txtStumWeight.setEditable(false);
        getContentPane().add(txtStumWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 208, 30));

        txtcatchweigth.setEditable(false);
        getContentPane().add(txtcatchweigth, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 208, 29));

        btnadd.setText("ADD");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        getContentPane().add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 90, 40));

        btbclear.setText("CLEAR");
        btbclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbclearActionPerformed(evt);
            }
        });
        getContentPane().add(btbclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 430, 90, 40));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("==>");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 70, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("==>");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 70, -1));

        txtPrecStump.setEditable(false);
        getContentPane().add(txtPrecStump, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 190, 30));

        txtPrecCatch.setEditable(false);
        getContentPane().add(txtPrecCatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 190, 29));

        lblexistingSWeight.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblexistingSWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 199, 31));

        lblexistingCatchWeight.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblexistingCatchWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 199, 30));

        btnproccess.setText("PROCESS");
        btnproccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproccessActionPerformed(evt);
            }
        });
        getContentPane().add(btnproccess, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 430, 90, 40));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Player Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));
        getContentPane().add(txtnationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 208, 29));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Team ID");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, 20));

        txttotmatch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttotmatchKeyTyped(evt);
            }
        });
        getContentPane().add(txttotmatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 188, 29));
        getContentPane().add(txtplayername, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 210, 30));
        getContentPane().add(txtteamname, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 188, 30));
        getContentPane().add(txtteamid, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 190, 30));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nationality");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Team Name");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, 20));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Total Match");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, -1, 20));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("NEW ALL WICKET KEEPER FORMS");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 310, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/WKS.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 520));

        jLabel14.setText("jLabel11");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("NEW BOWLER FORMS");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
           if(isValidate()){
        
          double []ExistingTot_Stump = new double[150];
          double[]ExistingTot_Catchs = new double[150];
           int x=0;
        
        
  
        String PName=cmbPRole.getSelectedItem().toString();
        ArrayList<Wicket_KeeperList> WKList=MasterDB.GetKeepers(PName);
        
        for(Wicket_KeeperList atn:WKList){
                
         ExistingTot_Stump[x] = Double.parseDouble(atn.getStump_Weight());
         ExistingTot_Catchs[x] = Double.parseDouble(atn.getCatch_Weight());
           x++;
        }
        
        double s= DoubleStream.of(ExistingTot_Stump).sum()/50;
        double b= DoubleStream.of(ExistingTot_Catchs).sum()/50;
          
    
       
            double k = Double.parseDouble(txtstumps.getText());
            double x1 = 1/k;
            double m = Double.parseDouble(txtcatch.getText());
            double y1 = 1/m;
           
           
            
           Train_Keeper predvalue= new Train_Keeper();
            
            predvalue.getStumpInput(x1, 1);
            predvalue.getCatchInput(y1, 1);
            predvalue.RandomMethodStump();
            predvalue.RandomMethodCatch();
            predvalue.SumFunction();
            predvalue.SumFunction1();
            predvalue.Activate();
            predvalue.TrainingNetwork_Stump(0);
            predvalue.TrainingNetwork_Catch(0);
       
       
 
          int z=0;
           
           while((z<100)){
           predvalue.TrainingNetwork_Stump(1);
           predvalue.TrainingNetwork_Catch(1);
           predvalue.SumFunction();
           predvalue.SumFunction1();
           predvalue.Activate();
             z++;
          }
           

           if(predvalue.error==0){
               
                 txtStumWeight.setText(String.valueOf(predvalue.Stumps_weights[0]));
                 txtcatchweigth.setText(String.valueOf(predvalue.Catchs_weights[0]));
                
              DecimalFormat  df= new DecimalFormat("##.##");
                 
              txtPrecStump.setText(df.format(predvalue.Stumps_weights[0]*100)+" %");   
              txtPrecCatch.setText(df.format(predvalue.Catchs_weights[0]*100)+" %");
              
              lblexistingSWeight.setText("Predictable Catchs Average "+df.format(s*100)+" %");
              lblexistingCatchWeight.setText("Predictable Stump Avarage  "+df.format(b*100)+" %");
                 
           }
       }
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnproccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproccessActionPerformed
        // TODO add your handling code here:
       String  Team_ID=    txtteamid.getText();
       String  Team_Name=  txtteamname.getText();
       String  PlayerName= txtplayername.getText();
       String  Player_Role= cmbPRole.getSelectedItem().toString();
       String  Nationality= txtnationality.getText();
       int     Total_Matchs= Integer.parseInt(txttotmatch.getText());
       int     Innigs= 0;
       int     Highscore=0;
       int     totwicket= 0;
       double  Bat_Srate= 0.0;
       double  Bat_Ave    = 0.0;
       double  Bowl_Economy= 0.0;
       double  Bowl_Average= 0.0;
       int     Stumps= Integer.parseInt(txtstumps.getText());
       int     Catchs= Integer.parseInt(txtcatch.getText());
       String  Bat_SWeight= null;
       String  Bat_AWeight= null;
       String  Bowl_EWeight= null;
       String  Bowl_AWeight= null;
       String  Catch_Weight= txtcatchweigth.getText();
       String  Stump_Weight= txtStumWeight.getText();
     
       
       Team_Players   team= new Team_Players(Team_ID, Team_Name, PlayerName, Player_Role, Nationality, Total_Matchs, Innigs, Highscore,totwicket, Bat_Srate, Bat_Ave, Bowl_Economy, Bowl_Average, Stumps,Catchs, Bat_SWeight, Bat_AWeight,Bowl_EWeight,Bowl_AWeight, Catch_Weight,Stump_Weight);
       
        int result= MasterDB.AddTeamPlayers(team);
            
            if(result>0){
                JOptionPane.showMessageDialog(rootPane, "Teams Player is added");
            }else{
                JOptionPane.showMessageDialog(rootPane, "Team Player is not added");
            }  
    }//GEN-LAST:event_btnproccessActionPerformed

    private void txtstumpsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtstumpsKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
        if(c!='0' && c!='1' && c!='2' && c!='3' && c!='4' && c!='5' && c!='5' && c!='6' && c!='7' && c!='8' && c!='9' && c!='.')
            evt.consume();
    }//GEN-LAST:event_txtstumpsKeyTyped

    private void txtcatchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcatchKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
        if(c!='0' && c!='1' && c!='2' && c!='3' && c!='4' && c!='5' && c!='5' && c!='6' && c!='7' && c!='8' && c!='9' && c!='.')
            evt.consume();
    }//GEN-LAST:event_txtcatchKeyTyped

    private void txttotmatchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttotmatchKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
        if(c!='0' && c!='1' && c!='2' && c!='3' && c!='4' && c!='5' && c!='5' && c!='6' && c!='7' && c!='8' && c!='9' && c!='.')
            evt.consume();
    }//GEN-LAST:event_txttotmatchKeyTyped

    private void btbclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbclearActionPerformed
        // TODO add your handling code here:
        txtPrecCatch.setText("");
        txtPrecStump.setText("");
        txtStumWeight.setText("");
        txtcatch.setText("");
        txtcatchweigth.setText("");
        txtnationality.setText("");
        txtplayername.setText("");
        txtstumps.setText("");
        txtteamid.setText("");
        txtteamname.setText("");
        txttotmatch.setText("");
    }//GEN-LAST:event_btbclearActionPerformed

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
            java.util.logging.Logger.getLogger(WicketKeeper_SelectionFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WicketKeeper_SelectionFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WicketKeeper_SelectionFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WicketKeeper_SelectionFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WicketKeeper_SelectionFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbclear;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnproccess;
    private javax.swing.JComboBox<String> cmbPRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblexistingCatchWeight;
    private javax.swing.JLabel lblexistingSWeight;
    private javax.swing.JTextField txtPrecCatch;
    private javax.swing.JTextField txtPrecStump;
    private javax.swing.JTextField txtStumWeight;
    private javax.swing.JTextField txtcatch;
    private javax.swing.JTextField txtcatchweigth;
    private javax.swing.JTextField txtnationality;
    private javax.swing.JTextField txtplayername;
    private javax.swing.JTextField txtstumps;
    private javax.swing.JTextField txtteamid;
    private javax.swing.JTextField txtteamname;
    private javax.swing.JTextField txttotmatch;
    // End of variables declaration//GEN-END:variables
}
