
package view;

import controller.UserController;
import java.awt.Toolkit;
import controller.dataBaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import controller.UserTypeDto;
import java.util.List;
import models.User;
import controller.UserTypeController;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import models.UserType;
import java.sql.*;



public class IstoreLogin extends javax.swing.JFrame {
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
      
       //Connection con;
      //PreparedStatement pst;
      //ResultSet rs=null;
      
      
     List<User> userList;
     User olduser;
     
     
     
    public IstoreLogin() {
        initComponents();
        this.setResizable(false);
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("login.jpg")));
        
        //initilize();
    }
    /*public void initilize(){
        
        loadViewUser();

    }
  public void loadFormUser() {
        List<UserType> userTypes = UserTypeController.get();
        Vector typ = new Vector();
        typ.add("Select a User Type");
        for (UserType type : userTypes) {
            typ.add(type);
        }
        DefaultComboBoxModel<String> typeModel = new DefaultComboBoxModel(typ);
       cobUserType.setModel(typeModel);

    }
    public void loadViewUser() {
        userList = UserController.get(null);
        

        List<UserType> userTypeList = UserTypeController.get();
        Vector<Object> userTypes = new Vector<>();
        userTypes.add("Select a User Type");

        for (UserType type : userTypeList) {
            userTypes.add(type.getName());
        }

        DefaultComboBoxModel<String> typeModel = new DefaultComboBoxModel(userTypes);
        cobUserType.setModel(typeModel);
    }
public void fillFormUser(User user) {
        olduser = user;
        txtUserName.setText(user.getName());
        txtPassword.setText(user.getPassword());
        cobUserType.setSelectedIndex(user.getUserType().getId());
        //String type = txtUserType.getSelectedItem().toString();

    }*/
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel4 = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        lblUserName = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblPassword = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        cbShowPassword = new javax.swing.JCheckBox();
        panel1 = new javax.swing.JPanel();
        lblimg = new javax.swing.JLabel();
        lblh1 = new javax.swing.JLabel();
        lblh2 = new javax.swing.JLabel();
        lblh3 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Apple iStore");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(51, 51, 51));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        panel4.setBackground(new java.awt.Color(51, 51, 51));
        panel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel4.setForeground(new java.awt.Color(102, 102, 102));
        panel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel4MouseClicked(evt);
            }
        });

        lblLogin.setBackground(new java.awt.Color(255, 255, 255));
        lblLogin.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setText("Login");

        btnLogin.setBackground(new java.awt.Color(102, 102, 102));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnLogOut.setBackground(new java.awt.Color(102, 102, 102));
        btnLogOut.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(255, 255, 255));
        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        lblUserName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblUserName.setText("User Name:");

        txtPassword.setBackground(new java.awt.Color(102, 102, 102));
        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setText("Password");
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password:");

        txtUserName.setBackground(new java.awt.Color(102, 102, 102));
        txtUserName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(255, 255, 255));
        txtUserName.setText("UserName");
        txtUserName.setToolTipText("");
        txtUserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserNameFocusLost(evt);
            }
        });
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserNameKeyTyped(evt);
            }
        });

        cbShowPassword.setBackground(new java.awt.Color(51, 51, 51));
        cbShowPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbShowPassword.setForeground(new java.awt.Color(255, 255, 255));
        cbShowPassword.setText("Show Password");
        cbShowPassword.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbShowPasswordActionPerformed(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(255, 255, 255));

        lblimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/a4.png"))); // NOI18N

        lblh1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblh1.setText("Apple");

        lblh2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblh2.setText("iStore");

        lblh3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblh3.setText("Trust me,pick me.....");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblimg)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblh3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblh2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblh1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(lblimg, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblh1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblh2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblh3)
                .addGap(19, 19, 19))
        );

        btnClear.setBackground(new java.awt.Color(102, 102, 102));
        btnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogin)
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserName)
                            .addComponent(lblPassword))
                        .addGap(80, 132, Short.MAX_VALUE)
                        .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbShowPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUserName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnLogOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(51, 51, 51)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(lblLogin)
                .addGap(62, 62, 62)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbShowPassword)
                .addGap(56, 56, 56)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogOut)
                .addContainerGap(120, Short.MAX_VALUE))
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
       /*String uname = txtUserName.getText();
       String pword = txtPassword.getText();
       String type = cobUserType.getSelectedItem().toString();
       //String type =cobUserType.setSelectedIndex(user.getUserType().getId());
       
       if(uname.equals("")||pword.equals("")||type.equals("Select")){
        JOptionPane.showMessageDialog(null,"Some fields ara empty");
       }else{
        try{
         Connection connection = dataBaseConnection.connection();
         PreparedStatement pst = connection.prepareStatement("SELECT * FROM user WHERE name = ? AND password = ?  AND usertype=?");
         pst.setString(1,uname);
         pst.setString(2,pword);
         //pst.setString(1,type);
         ResultSet rs = pst.executeQuery();
         
         
         
         if(rs.next()){
             String s1 = rs.getString("type");
             if(type.equals("manager")&& s1.equals("manager")){
              new Manager().setVisible(true);
              this.hide();
              JOptionPane.showMessageDialog(null, "Login Succcessfully");
             }
             if(type.equals("cashier")&& s1.equals("cashier")){
              new Cashier().setVisible(true);
              this.hide();
              JOptionPane.showMessageDialog(null, "Login Succcessfully");
             }
             
            /*if(type.equals("cashier")&& s1.equals("cashier")){
              new Cashier().setVisible(true);
              this.hide();
              JOptionPane.showMessageDialog(null, "Login Succcessfully");
             }*/
             
    
        /* }else{
             JOptionPane.showMessageDialog(null, "Wrong UserName or Password or both fields!!!","Message",JOptionPane.ERROR_MESSAGE);
         }
        /*}catch(Exception e){
        JOptionPane.showMessageDialog(null,""+e);
        }*/
                                                      
         String userName = txtUserName.getText();
         String passWord = txtPassword.getText();
         if(userName.equals("manager")&& passWord.equals("1234")){
             new Manager().setVisible(true);
              this.hide();
              JOptionPane.showMessageDialog(null, "Login Succcessfully");
             dispose();
         }else if(userName.equals("cashier")&& passWord.equals("1234")){
             new Cashier().setVisible(true);
              this.hide();
              JOptionPane.showMessageDialog(null, "Login Succcessfully");
             dispose();
         }
         else if(userName.equals("")|| passWord.equals("")){
             JOptionPane.showMessageDialog(null,"User Name or Password can't be empty");
         }
         else{
             JOptionPane.showMessageDialog(null,"Incorrect UserName or Password");
         }
         
                                        
        
        
       
    }//GEN-LAST:event_btnLoginActionPerformed
    
       
                                            
    
    private void cbShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbShowPasswordActionPerformed
        if (cbShowPassword.isSelected()){
              txtPassword.setEchoChar((char)0);
    }//GEN-LAST:event_cbShowPasswordActionPerformed
        else{
            txtPassword.setEchoChar('*');
        }
    }
    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
          System.exit(0);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
       txtUserName.setText("");
       txtPassword.setText("");      
    }//GEN-LAST:event_btnClearActionPerformed

    private void panel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panel4MouseClicked

    private void txtUserNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusGained
    if(txtUserName.getText().equals("UserName")) {
        txtUserName.setText("");
} 
    }//GEN-LAST:event_txtUserNameFocusGained

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        if(txtPassword.getText().equals("Password")) {
            txtPassword.setText("");
} 
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtUserNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusLost
    if(txtUserName.getText().equals("")) {
        txtUserName.setText("UserName");
    }     
    }//GEN-LAST:event_txtUserNameFocusLost

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        if(txtPassword.getText().equals("")) {
           txtPassword.setText("Password");
    }     
    }//GEN-LAST:event_txtPasswordFocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
      
    }//GEN-LAST:event_formWindowGainedFocus

    private void txtUserNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyTyped
       
    }//GEN-LAST:event_txtUserNameKeyTyped

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
       
    }//GEN-LAST:event_txtPasswordKeyTyped

    
    public static void main(String args[]) {
        
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IstoreLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox cbShowPassword;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblh1;
    private javax.swing.JLabel lblh2;
    private javax.swing.JLabel lblh3;
    private javax.swing.JLabel lblimg;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel4;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
