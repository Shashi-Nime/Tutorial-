
package view;

import controller.UserTypeController;
import models.UserType;
import models.User;
import controller.UserController;
import controller.Common;
import java.awt.Color;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.RowFilter;
import java.awt.Toolkit;
import controller.dataBaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.TableRowSorter;
import javax.swing.table.DefaultTableModel;

public class CreateNewAccounts extends javax.swing.JFrame {

    List<User> userList;
    User olduser;
    
    
    public CreateNewAccounts() {
        initComponents();
        this.setResizable(false);
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("login.jpg")));
        
        initilize();
    }
   public void initilize(){
        
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
        cbUser.setModel(typeModel);

    }
    public void loadViewUser() {
        userList = UserController.get(null);
        fillTableUser(userList);

        List<UserType> userTypeList = UserTypeController.get();
        Vector<Object> userTypes = new Vector<>();
        userTypes.add("Select a User Type");

        for (UserType type : userTypeList) {
            userTypes.add(type.getName());
        }

        DefaultComboBoxModel<String> typeModel = new DefaultComboBoxModel(userTypes);
        cbUser.setModel(typeModel);
    }

    public void fillTableUser(List<User> users) {
        DefaultTableModel model = (DefaultTableModel) tableCreateAccounts.getModel();
        model.setRowCount(0);
        for (User usr : users) {
            Vector d = new Vector();
            d.add(usr.getId());
            d.add(usr.getName().toString());
            d.add(usr.getPassword());
            d.add(usr.getUserType());
           
            model.addRow(d);

        }

    }
    
    public void fillFormUser(User user) {
        olduser = user;
        txtUserName.setText(user.getName());
        txtPassword.setText(user.getPassword());
        cbUser.setSelectedIndex(user.getUserType().getId());

    }
    public void clearFormUser(){
        JTextField [] arr = {txtUserName,txtPassword,};
        for(JTextField x: arr){
            x.setText("");
           
        }
        cbUser.setSelectedIndex(0);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        CheckBoxSp = new javax.swing.JCheckBox();
        lblUserType = new javax.swing.JLabel();
        cbUser = new javax.swing.JComboBox<>();
        btnCreateNewAccount = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        Panel2 = new javax.swing.JPanel();
        lblImg = new javax.swing.JLabel();
        lblh2 = new javax.swing.JLabel();
        lblh3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCreateAccounts = new javax.swing.JTable();
        btnLogOut = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CreateAnAccount");

        panel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Create An New Account");

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons8-go-back-26.png"))); // NOI18N
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(51, 51, 51));

        lblUserName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblUserName.setText("UserName:");

        txtUserName.setBackground(new java.awt.Color(102, 102, 102));
        txtUserName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(255, 255, 255));
        txtUserName.setText("UserName");
        txtUserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserNameFocusLost(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password:");

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

        CheckBoxSp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CheckBoxSp.setForeground(new java.awt.Color(255, 255, 255));
        CheckBoxSp.setText("Show Password");
        CheckBoxSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxSpActionPerformed(evt);
            }
        });

        lblUserType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUserType.setForeground(new java.awt.Color(255, 255, 255));
        lblUserType.setText("UserType:");

        cbUser.setBackground(new java.awt.Color(102, 102, 102));
        cbUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbUser.setForeground(new java.awt.Color(255, 255, 255));

        btnCreateNewAccount.setBackground(new java.awt.Color(102, 102, 102));
        btnCreateNewAccount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCreateNewAccount.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateNewAccount.setText("Create New Account");
        btnCreateNewAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateNewAccountActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(102, 102, 102));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update Account");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(102, 102, 102));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete Account");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(102, 102, 102));
        btnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUserName)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPassword)
                            .addComponent(lblUserType))
                        .addGap(33, 33, 33)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbUser, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(CheckBoxSp)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPassword)
                                    .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)))
                            .addComponent(btnCreateNewAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserName))
                .addGap(44, 44, 44)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBoxSp)
                .addGap(24, 24, 24)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserType))
                .addGap(42, 42, 42)
                .addComponent(btnCreateNewAccount)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnClear))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        Panel2.setBackground(new java.awt.Color(255, 255, 255));

        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/a4.png"))); // NOI18N

        lblh2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblh2.setText("Apple");

        lblh3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblh3.setText("iStore");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Trush me,Pick me....");

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblImg))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblh3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblh2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblImg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblh2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblh3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(37, 37, 37))
        );

        tableCreateAccounts.setBackground(new java.awt.Color(102, 102, 102));
        tableCreateAccounts.setForeground(new java.awt.Color(255, 255, 255));
        tableCreateAccounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "name", "Password", "UserType"
            }
        ));
        tableCreateAccounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCreateAccountsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableCreateAccounts);

        btnLogOut.setBackground(new java.awt.Color(102, 102, 102));
        btnLogOut.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(255, 255, 255));
        btnLogOut.setText("Log out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        txtSearch.setBackground(new java.awt.Color(153, 153, 153));
        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(255, 255, 255));
        txtSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchFocusLost(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        lblSearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSearch.setForeground(new java.awt.Color(255, 255, 255));
        lblSearch.setText("Search");
        lblSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSearchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblSearch)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(lblSearch))
                .addContainerGap())
        );

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(lblBack))
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)))
                .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(btnLogOut))
                            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
int resp = JOptionPane.showConfirmDialog(null,"\n Are You Sure to delete following person ?\n"+olduser.getName());
        if(resp==0){
                String status =UserController.delete(olduser);
            if(status.equals("1")){
                loadViewUser();
                loadFormUser();
                JOptionPane.showMessageDialog(null, "Successfully Deleted");
                clearFormUser();

            }
            else{
                JOptionPane.showMessageDialog(null, "Faild to delete");
    }                                         
 }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtPassword.setText("");
        txtUserName.setText("");
        cbUser.setSelectedIndex(0);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        User user = new User();
        String error = "";
        String updates = "";
        user.setId(olduser.getId());

        String name = txtUserName.getText();

        if (name != "") {
            if (name.equals(olduser.getName())) {
                user.setName(olduser.getName());

            } else {
                user.setName(name);

                updates = updates + "\n Name updated";
            }
        } else {

            error = error + "\n Invalid name";
        }
        String  password = txtPassword.getText();
        if ( password!= "") {
            if (password.equals(olduser.getPassword())) {
                user.setPassword(olduser.getPassword());

            } else {
                user.setPassword(password);

                updates = updates + "\n Password updated";
            }
        } else {

            error = error + "\n Invalid Password";
        }

        int userIndex = cbUser.getSelectedIndex();
        Object userValue = cbUser.getSelectedItem();
        if (userIndex != 0) {

            UserType usrObj = new UserType();
            usrObj.setId(userIndex);
            usrObj.setName(userValue.toString());

            if (usrObj.getId() == olduser.getUserType().getId()) {
                user.setUserType(olduser.getUserType());
            } else {
                user.setUserType(usrObj);

                updates = updates + "\n User Type Updated";
            }
        } else {

            error = error + "\n Select a User Type";
        }
        if (error.isEmpty()) {

            if (!updates.isEmpty()) {
                int resp = JOptionPane.showConfirmDialog(null, "You have following updates\n\n" + updates);
                if (resp == 0) {

                    String status = UserController.put(user);

                    if (status.equals("1")) {

                        int srow = tableCreateAccounts.getSelectedRow();
                        loadViewUser();

                        tableCreateAccounts.setRowSelectionInterval(srow, srow);
                        loadFormUser();
                        JOptionPane.showMessageDialog(null, "Successfully updated \n\n" + status);

                    }
                }
            }}
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCreateNewAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateNewAccountActionPerformed
        User user = new User();
        String error = "";
        String name = txtUserName.getText();
        if (name != "") {
            user.setName(name);

        } else {

            error = error + "\n Invalid name";
        }
        String password = txtPassword.getText();
        if (password != "") {
            user.setPassword(password);

        } else {

            error = error + "\n Invalid Password";
        }

        int userIndex = cbUser.getSelectedIndex();
        Object userValue = cbUser.getSelectedItem();

        if (userIndex != 0) {

            UserType usrobj = new UserType();
            usrobj.setId(userIndex);
            usrobj.setName(userValue.toString());
            user.setUserType(usrobj);

        } else {

            error = error + "\n select a User";
        }
        if (error.isEmpty()) {
            String cnfmsg = "Are you sure to save following details ?\n\n";
            cnfmsg = cnfmsg + "\n Name : " + user.getName();
            cnfmsg = cnfmsg + "\n Password : " + user.getPassword();
            cnfmsg = cnfmsg + "\n UserType : " + user.getUserType().getName();
            int conf = JOptionPane.showConfirmDialog(null, cnfmsg);
            if (conf == 0) {
                String st = UserController.post(user);
                if (st.equals("1")) {
                    JOptionPane.showMessageDialog(null, "successfully saved");
                    loadViewUser();
                    loadFormUser();
                }
            }
        } else {
            JOptionPane.showConfirmDialog(null, error);
        }

    }//GEN-LAST:event_btnCreateNewAccountActionPerformed

    private void CheckBoxSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxSpActionPerformed
        if (CheckBoxSp.isSelected()){
            txtPassword.setEchoChar((char)0);
        }
        else{
            txtPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_CheckBoxSpActionPerformed

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        this.hide();
        Manager m1 = new  Manager();
        m1.show();//show this
    }//GEN-LAST:event_lblBackMouseClicked

    private void txtUserNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusGained
        if(txtUserName.getText().equals("UserName")) {
        txtUserName.setText("");
} 
    }//GEN-LAST:event_txtUserNameFocusGained

    private void txtUserNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusLost
      if(txtUserName.getText().equals("")) {
        txtUserName.setText("UserName");
    }     
    }//GEN-LAST:event_txtUserNameFocusLost

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
       if(txtPassword.getText().equals("Password")) {
        txtPassword.setText("");
} 
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
      if(txtPassword.getText().equals("")) {
        txtPassword.setText("Password");
    }    
    }//GEN-LAST:event_txtPasswordFocusLost

    private void tableCreateAccountsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCreateAccountsMouseClicked
      int row = tableCreateAccounts.getSelectedRow();
        if (row > -1) {
            User user = userList.get(row);
            fillFormUser(user);
        }
    }//GEN-LAST:event_tableCreateAccountsMouseClicked

    private void lblSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchMouseClicked
         txtSearch.setText("");
    }//GEN-LAST:event_lblSearchMouseClicked

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        DefaultTableModel model = (DefaultTableModel)tableCreateAccounts.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tableCreateAccounts.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtSearch.getText()));
                                       
    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusGained
         if(txtSearch.getText().equals("Search User here")) {
        txtSearch.setText("");
} 
    }//GEN-LAST:event_txtSearchFocusGained

    private void txtSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusLost
       if(txtSearch.getText().equals("")) {
        txtSearch.setText("Search Product here");
    }     
    }//GEN-LAST:event_txtSearchFocusLost

    
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
            java.util.logging.Logger.getLogger(CreateNewAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateNewAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateNewAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateNewAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateNewAccounts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBoxSp;
    private javax.swing.JPanel Panel2;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreateNewAccount;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUserType;
    private javax.swing.JLabel lblh2;
    private javax.swing.JLabel lblh3;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel3;
    private javax.swing.JTable tableCreateAccounts;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private void getPassword(String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
