
package view;

import java.awt.Toolkit;
import controller.CategoryController;
import java.awt.Toolkit;
import controller.ProductController;
import models.Product;//remember
import java.awt.Color;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import models.Category;
import javax.swing.JTextField;
import models.Salse;
//import controller.SalesController;

public class Cashier extends javax.swing.JFrame {
        
   List<Product> productList;
   Product oldproduct; 
   
   List<Salse> salsesList;
   //Salse  oldsalse;
    public Cashier() {
   
        
        initComponents();
        this.setResizable(false);
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("cashier.png")));
        
        initilize();
    }
    

    public void initilize(){
        loadView(); 
        //Salestable();
    }
     
    
   
    public void loadForm() {
        List<Category> categories = CategoryController.get();
        Vector gnd = new Vector();
        gnd.add("Select a Category");
        for (Category cat : categories) {
            gnd.add(cat);
        }
        DefaultComboBoxModel<String> catModel = new DefaultComboBoxModel(gnd);
        //cbCategory.setModel(catModel);


    }
    public void loadView() {
        productList = ProductController.get(null);
        fillTable(productList);

        List<Category> categoryList = CategoryController.get();
        Vector<Object> categories = new Vector<>();
        categories.add("Select a Category");

        for (Category cat : categoryList) {
            categories.add(cat.getName());
        }

        DefaultComboBoxModel<String> catModel = new DefaultComboBoxModel(categories);
        //cbCategory.setModel(catModel);
    }
     public void fillTable(List<Product> products){
        DefaultTableModel model = (DefaultTableModel)tableP.getModel();
         model.setRowCount(0);
         for (Product pro : products) {
            Vector d = new Vector();
            d.add(pro.getId());
            d.add(pro.getName().toString());
            //d.add(pro.getPrice());
            //d.add(pro.getQuantity());
            d.add(pro.getCategory());
            d.add(pro.getPrice());
            d.add(pro.getQuantity());
            System.out.println(pro.getPrice());
           
            model.addRow(d);

        }
         
    }
      public void fillForm(Product product) {
        oldproduct = product;
        
        //cbCategory.setSelectedIndex(product.getCategory().getId());

    }
      public void fillFormIn(Product product) {
        oldproduct = product;
        
        //txtQuantity.setText(String.valueOf(product.getQuantity()));
        //cbCategory.setSelectedIndex(product.getCategory().getId());

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        panel2 = new javax.swing.JPanel();
        lblH1 = new javax.swing.JLabel();
        lblH2 = new javax.swing.JLabel();
        lblImag = new javax.swing.JLabel();
        lblh3 = new javax.swing.JLabel();
        lblH = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        PanelSearch = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        lblsearch = new javax.swing.JLabel();
        scrollPane2 = new javax.swing.JScrollPane();
        tableP = new javax.swing.JTable();
        lblBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("iStore Cashier");
        setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        panel1.setBackground(new java.awt.Color(51, 51, 51));
        panel1.setForeground(new java.awt.Color(255, 255, 255));

        btnClear.setBackground(new java.awt.Color(102, 102, 102));
        btnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        panel2.setBackground(new java.awt.Color(255, 255, 255));

        lblH1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblH1.setText("Apple");

        lblH2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblH2.setText("iStore");

        lblImag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/a4.png"))); // NOI18N

        lblh3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblh3.setText("Trust me,Pick me...");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImag, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblH1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblH2, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblh3)
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImag)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 275, Short.MAX_VALUE)
                .addComponent(lblH1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblH2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblh3)
                .addContainerGap())
        );

        lblH.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblH.setForeground(new java.awt.Color(255, 255, 255));
        lblH.setText("Cashier");

        btnLogOut.setBackground(new java.awt.Color(102, 102, 102));
        btnLogOut.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(255, 255, 255));
        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        PanelSearch.setBackground(new java.awt.Color(102, 102, 102));

        txtSearch.setBackground(new java.awt.Color(153, 153, 153));
        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(255, 255, 255));
        txtSearch.setText("Sesrch Product here");
        txtSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchFocusLost(evt);
            }
        });
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        lblsearch.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblsearch.setForeground(new java.awt.Color(255, 255, 255));
        lblsearch.setText("Search");
        lblsearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblsearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblsearchFocusLost(evt);
            }
        });
        lblsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblsearchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelSearchLayout = new javax.swing.GroupLayout(PanelSearch);
        PanelSearch.setLayout(PanelSearchLayout);
        PanelSearchLayout.setHorizontalGroup(
            PanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSearchLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblsearch)
                .addGap(12, 12, 12))
        );
        PanelSearchLayout.setVerticalGroup(
            PanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSearchLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(PanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsearch))
                .addContainerGap())
        );

        tableP.setBackground(new java.awt.Color(102, 102, 102));
        tableP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tableP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tableP.setForeground(new java.awt.Color(255, 255, 255));
        tableP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Price", "Category", "Quantity"
            }
        ));
        tableP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePMouseClicked(evt);
            }
        });
        scrollPane2.setViewportView(tableP);

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons8-go-back-26.png"))); // NOI18N
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblH)
                            .addComponent(lblBack))
                        .addGap(456, 456, 456)
                        .addComponent(PanelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(scrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(PanelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblH)))
                .addGap(34, 34, 34)
                .addComponent(scrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnLogOut))
                .addGap(153, 153, 153))
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        this.hide();
        IstoreLogin IstoreLoginobj = new IstoreLogin();
        IstoreLoginobj.show();//show this
    }//GEN-LAST:event_lblBackMouseClicked

    private void tablePMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePMouseClicked
        int row = tableP.getSelectedRow();
        if (row > -1) {
            Product product = productList.get(row);
            fillFormIn(product);
        }
    }//GEN-LAST:event_tablePMouseClicked

    private void lblsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsearchMouseClicked
        txtSearch.setText("");
    }//GEN-LAST:event_lblsearchMouseClicked

    private void lblsearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblsearchFocusLost

    }//GEN-LAST:event_lblsearchFocusLost

    private void lblsearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblsearchFocusGained

    }//GEN-LAST:event_lblsearchFocusGained

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        DefaultTableModel model = (DefaultTableModel)tableP.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tableP.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtSearch.getText()));

    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed

    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusLost
        if(txtSearch.getText().equals("")) {
            txtSearch.setText("Search Product here");
        }
    }//GEN-LAST:event_txtSearchFocusLost

    private void txtSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusGained
        if(txtSearch.getText().equals("Search Product here")) {
            txtSearch.setText("");
        }
    }//GEN-LAST:event_txtSearchFocusGained

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        //txtProductName.setText("");
        //txtProductID.setText("");
        //xtPrice.setText("");
        //txtQuantity.setText("");
        //txtTotal.setText("");

        txtSearch.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cashier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelSearch;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblH;
    private javax.swing.JLabel lblH1;
    private javax.swing.JLabel lblH2;
    private javax.swing.JLabel lblImag;
    private javax.swing.JLabel lblh3;
    private javax.swing.JLabel lblsearch;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JScrollPane scrollPane2;
    private javax.swing.JTable tableP;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
