/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package source;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ashwi
 */
public class login1 extends javax.swing.JFrame {
    
    
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
   
    

    /** Creates new form login */
    public login1() {
        initComponents();
         conn=javaconnect.connerDb();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        mainpanel = new javax.swing.JPanel();
        loginpanel = new javax.swing.JPanel();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        lblusername = new javax.swing.JLabel();
        lblusername1 = new javax.swing.JLabel();
        btnsubmit = new javax.swing.JButton();
        lbllogin = new javax.swing.JLabel();
        lblbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 600));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1014, 568));
        getContentPane().setLayout(null);

        mainpanel.setBackground(new java.awt.Color(60, 86, 84));
        mainpanel.setLayout(null);

        loginpanel.setBackground(new java.awt.Color(66, 92, 90));

        txtusername.setBackground(new java.awt.Color(236, 219, 150));
        txtusername.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtusername.setToolTipText("Enter Username");
        txtusername.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 10, 2, 2));
        txtusername.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                txtusernameFocusLost(evt);
            }
        });
        txtusername.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtusernameActionPerformed(evt);
            }
        });

        txtpassword.setBackground(new java.awt.Color(236, 219, 150));
        txtpassword.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtpassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        lblusername.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblusername.setForeground(new java.awt.Color(215, 162, 23));
        lblusername.setText("password");

        lblusername1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblusername1.setForeground(new java.awt.Color(215, 162, 23));
        lblusername1.setText("username");

        btnsubmit.setBackground(new java.awt.Color(215, 162, 23));
        btnsubmit.setText("SUBMIT");
        btnsubmit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnsubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginpanelLayout = new javax.swing.GroupLayout(loginpanel);
        loginpanel.setLayout(loginpanelLayout);
        loginpanelLayout.setHorizontalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpanelLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblusername1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblusername, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );
        loginpanelLayout.setVerticalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpanelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(lblusername1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(lblusername, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnsubmit)
                .addGap(29, 29, 29))
        );

        mainpanel.add(loginpanel);
        loginpanel.setBounds(330, 130, 346, 339);

        lbllogin.setFont(new java.awt.Font("Dubai Medium", 1, 48)); // NOI18N
        lbllogin.setForeground(new java.awt.Color(215, 162, 23));
        lbllogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllogin.setText("LOGIN");
        mainpanel.add(lbllogin);
        lbllogin.setBounds(420, 50, 165, 76);
        mainpanel.add(lblbackground);
        lblbackground.setBounds(0, 0, 1014, 570);

        getContentPane().add(mainpanel);
        mainpanel.setBounds(0, 0, 1020, 570);

        setSize(new java.awt.Dimension(1014, 568));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtusernameActionPerformed
    {//GEN-HEADEREND:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void txtusernameFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtusernameFocusLost
    {//GEN-HEADEREND:event_txtusernameFocusLost
  
    }//GEN-LAST:event_txtusernameFocusLost

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnsubmitActionPerformed
    {//GEN-HEADEREND:event_btnsubmitActionPerformed
        try
        {
            
            Statement st=conn.createStatement();
            
            String uname=txtusername.getText();
            String pwd=txtpassword.getText();
            
            String str="Select * from employees where username = '" + uname +"' and password = '"+pwd+"'";
            
            ResultSet rs;
            
            rs=st.executeQuery(str);
            
            if(rs.first())
            {
                JOptionPane.showMessageDialog(null,"Logged in Successfully");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid credentials");
                txtusername.setText("");
                txtpassword.setText("");
            }
            
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this,"Error "+e);
        }

    }//GEN-LAST:event_btnsubmitActionPerformed

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
            java.util.logging.Logger.getLogger(login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsubmit;
    private javax.swing.JLabel lblbackground;
    private javax.swing.JLabel lbllogin;
    private javax.swing.JLabel lblusername;
    private javax.swing.JLabel lblusername1;
    private javax.swing.JPanel loginpanel;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables

}