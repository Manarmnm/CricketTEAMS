/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import javax.swing.JOptionPane;
import CONTROLLER.*;
import MODEL.*;
import java.text.SimpleDateFormat;
import javax.swing.JTextField;

/**
 *
 * @author MASS MNM
 */
public class REGISTER_Frm extends javax.swing.JFrame {
       private Login_DB logDB;
    /**
     * Creates new form REGISTER_Frm
     */
    public REGISTER_Frm() {
        initComponents();
        logDB =new Login_DB();
    }
    
    
    
   private boolean isValidate(){ //Validate change into isValidate
       // boolean flag=true;
       // text boxes can't be empty
        if (txtFName.getText().equals("")) 
        {
              lblfname.setText("First Name is Reqiured ");
              lblfname.setVisible(true);
              return false;
        }
        if (txtNic.getText().equals("")) 
        {
              lblnic.setText("NIC is Reqiured ");
              lblnic.setVisible(true);
              return false;
        }
        if (txtemail.getText().equals("")) 
        {
            
              lblemail.setText("Email ID is Reqiured ");
              lblemail.setVisible(true);
              return false;
        }
        if (txtUName.getText().equals("")) 
        {
              lbluname.setText("UserName is Reqiured ");
              lbluname.setVisible(true);
              return false;
        }
         if (txtPwd.getText().equals("")) 
        {
             lblpwd.setText("Password is Reqiured ");
             lblpwd.setVisible(true);
             return false;
        }
        if (txtCPwd.getText().equals("")) 
        {
             lblcpwd.setText("Confirm Password is Reqiured ");
             lblcpwd.setVisible(true);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        txtLName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        txtConutry = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rdomale = new javax.swing.JRadioButton();
        rdofemale = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jDOB = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        txtNic = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTeleno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmbcategory = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtUName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPwd = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        txtCPwd = new javax.swing.JPasswordField();
        btnclear = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        lblpwd = new javax.swing.JLabel();
        lblfname = new javax.swing.JLabel();
        lbluname = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        lblcpwd = new javax.swing.JLabel();
        lblnic = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtjob = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        setMaximumSize(new java.awt.Dimension(910, 475));
        setMinimumSize(new java.awt.Dimension(910, 475));
        setPreferredSize(new java.awt.Dimension(910, 475));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("First Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 80, 72, 25);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Last Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(450, 80, 100, 25);

        txtFName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFNameKeyTyped(evt);
            }
        });
        getContentPane().add(txtFName);
        txtFName.setBounds(120, 80, 201, 30);

        txtLName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtLName);
        txtLName.setBounds(560, 80, 190, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Address");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 120, 72, 40);

        txtAddress.setColumns(15);
        txtAddress.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtAddress.setRows(5);
        jScrollPane2.setViewportView(txtAddress);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(120, 120, 200, 47);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Country");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(450, 120, 100, 25);

        txtConutry.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConutryKeyTyped(evt);
            }
        });
        getContentPane().add(txtConutry);
        txtConutry.setBounds(560, 120, 190, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 180, 80, 30);

        rdomale.setForeground(new java.awt.Color(255, 255, 255));
        rdomale.setText("MALE");
        getContentPane().add(rdomale);
        rdomale.setBounds(120, 180, 100, 30);

        rdofemale.setForeground(new java.awt.Color(255, 255, 255));
        rdofemale.setText("FEMALE");
        getContentPane().add(rdofemale);
        rdofemale.setBounds(230, 180, 90, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DOB");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(450, 160, 80, 30);
        getContentPane().add(jDOB);
        jDOB.setBounds(560, 160, 190, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NIC");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 220, 80, 30);
        getContentPane().add(txtNic);
        txtNic.setBounds(120, 220, 200, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contacts No");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(450, 200, 90, 30);

        txtTeleno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelenoKeyTyped(evt);
            }
        });
        getContentPane().add(txtTeleno);
        txtTeleno.setBounds(560, 200, 190, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Category");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(450, 320, 100, 30);

        cmbcategory.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cmbcategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Players" }));
        getContentPane().add(cmbcategory);
        cmbcategory.setBounds(560, 320, 190, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Email");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(450, 240, 90, 30);
        getContentPane().add(txtemail);
        txtemail.setBounds(560, 240, 190, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("User Name");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 290, 100, 30);

        txtUName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUNameKeyTyped(evt);
            }
        });
        getContentPane().add(txtUName);
        txtUName.setBounds(120, 290, 200, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Password");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(10, 330, 100, 30);
        getContentPane().add(txtPwd);
        txtPwd.setBounds(120, 330, 200, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Confirm Password");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 370, 110, 30);
        getContentPane().add(txtCPwd);
        txtCPwd.setBounds(120, 370, 200, 30);

        btnclear.setBackground(new java.awt.Color(0, 0, 0));
        btnclear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("CLEAR");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        getContentPane().add(btnclear);
        btnclear.setBounds(630, 390, 120, 30);

        btnadd.setBackground(new java.awt.Color(0, 0, 0));
        btnadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("ADD");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        getContentPane().add(btnadd);
        btnadd.setBounds(490, 390, 120, 30);

        lblpwd.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblpwd.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblpwd);
        lblpwd.setBounds(320, 330, 124, 25);

        lblfname.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblfname.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblfname);
        lblfname.setBounds(340, 80, 138, 25);

        lbluname.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbluname.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lbluname);
        lbluname.setBounds(320, 290, 124, 25);

        lblemail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblemail.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblemail);
        lblemail.setBounds(760, 250, 137, 19);

        lblcpwd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblcpwd.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblcpwd);
        lblcpwd.setBounds(760, 340, 137, 19);

        lblnic.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblnic.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblnic);
        lblnic.setBounds(330, 240, 147, 25);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Job");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(450, 280, 100, 30);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(420, 380, 370, 20);
        getContentPane().add(txtjob);
        txtjob.setBounds(560, 280, 190, 30);

        jLabel15.setFont(new java.awt.Font("Century", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Player Register ");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(360, 10, 170, 25);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 50, 880, 10);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/register.jpg"))); // NOI18N
        jLabel16.setText("jLabel16");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(0, 0, 980, 470);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        txtAddress.setText("");
        txtCPwd.setText("");
        txtConutry.setText("");
        txtFName.setText("");
        txtLName.setText("");
        txtNic.setText("");
        txtPwd.setText("");
        txtTeleno.setText("");
        txtUName.setText("");
        txtemail.setText("");
        txtjob.setText("");
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
     if(isValidate()){
         String d= ((JTextField)jDOB.getDateEditor().getUiComponent()).getText();
        String FName=   txtFName.getText(); 
        String LName=   txtLName.getText(); 
        String Address= txtAddress.getText(); 
        String Country= txtConutry.getText();
        String Gender="";
         if(rdomale.isSelected()){
            Gender="Male";
        }else if(rdomale.isSelected()){
                Gender="Female";
            }
        
        String Nic=      txtNic.getText(); 
        int    TeleNo=Integer.parseInt(txtTeleno.getText());
        String Category= cmbcategory.getSelectedItem().toString();
        String Email=    txtemail.getText(); 
        String UserName= txtUName.getText(); 
        String Password= txtPwd.getText();
        String CPwd=     txtCPwd.getText(); 
        String Job=      txtjob.getText();

       if(Password.equals(CPwd)){
          
            Register Reg= new Register(FName, LName, Address, Country, Gender, d, Nic, TeleNo, Category, Email, UserName, Password,Job);
            
            int result=logDB.addLogin(Reg);
            
            if(result>0){
                JOptionPane.showMessageDialog(rootPane, "New Login is added");
            }else{
                JOptionPane.showMessageDialog(rootPane, "New Login is not added");
            }  
       }else{
            JOptionPane.showMessageDialog(rootPane,"Confirm Password is not matching with Password");
        }
     }
    }//GEN-LAST:event_btnaddActionPerformed

    private void txtTelenoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelenoKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(c!='0' && c!='1' && c!='2' && c!='3' && c!='4' && c!='5' && c!='5' && c!='6' && c!='7' && c!='8' && c!='9' && c!='.'&& c!='-')
            evt.consume();
    }//GEN-LAST:event_txtTelenoKeyTyped

    private void txtFNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFNameKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
        if (!Character.isLetter(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtFNameKeyTyped

    private void txtUNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUNameKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
        if (!Character.isLetter(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtUNameKeyTyped

    private void txtConutryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConutryKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
        if (!Character.isLetter(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtConutryKeyTyped

    private void txtLNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLNameActionPerformed

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
            java.util.logging.Logger.getLogger(REGISTER_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REGISTER_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REGISTER_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REGISTER_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REGISTER_Frm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnclear;
    private javax.swing.JComboBox<String> cmbcategory;
    private com.toedter.calendar.JDateChooser jDOB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JLabel lblcpwd;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblfname;
    private javax.swing.JLabel lblnic;
    private javax.swing.JLabel lblpwd;
    private javax.swing.JLabel lbluname;
    private javax.swing.JRadioButton rdofemale;
    private javax.swing.JRadioButton rdomale;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JPasswordField txtCPwd;
    private javax.swing.JTextField txtConutry;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtNic;
    private javax.swing.JPasswordField txtPwd;
    private javax.swing.JTextField txtTeleno;
    private javax.swing.JTextField txtUName;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtjob;
    // End of variables declaration//GEN-END:variables
}
