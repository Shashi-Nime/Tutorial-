
package view;

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

/**
 *
 * @author i3
 */
public class Manager extends javax.swing.JFrame {
    List<Product> productList;
    Product oldproduct;
   
    
public Manager() {
        initComponents();
        
        this.setResizable(false);
       
        panel1.setFocusable(true);
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("manager.png")));
        initilize();
        
    
    }
    
    public void initilize(){
        loadView(); 
    }
   
    public void loadForm() {
        List<Category> categories = CategoryController.get();
        Vector gnd = new Vector();
        gnd.add("Select a Category");
        for (Category cat : categories) {
            gnd.add(cat);
        }
        DefaultComboBoxModel<String> catModel = new DefaultComboBoxModel(gnd);
        cbCategory.setModel(catModel);


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
        cbCategory.setModel(catModel);
    }
    
   public void fillTable(List<Product> products){
        DefaultTableModel model = (DefaultTableModel)tableProduct.getModel();
         model.setRowCount(0);
         for (Product pro : products) {
            Vector d = new Vector();
            d.add(pro.getId());
            d.add(pro.getName().toString());
           
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
        txtProductName.setText(product.getName());
        txtPrice.setText(String.valueOf(product.getPrice()));
        txtQuantity.setText(String.valueOf(product.getQuantity()));
        cbCategory.setSelectedIndex(product.getCategory().getId());

    }
   public void clearForm(){
        JTextField [] arr = {txtProductName,txtPrice,txtQuantity};
        for(JTextField x: arr){
            x.setText("");
            
        }
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        lblProductName = new javax.swing.JLabel();
        lblCategory = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        cbCategory = new javax.swing.JComboBox<>();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        panel3 = new javax.swing.JPanel();
        lblh1 = new javax.swing.JLabel();
        lblh2 = new javax.swing.JLabel();
        lblimg = new javax.swing.JLabel();
        lblh3 = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        lblManager = new javax.swing.JLabel();
        PanelSearch = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        lblsearch = new javax.swing.JLabel();
        scrollPane1 = new javax.swing.JScrollPane();
        tableProduct = new javax.swing.JTable();
        btnLogOut = new javax.swing.JButton();
        btncreateAnAccount = new javax.swing.JButton();
        lblBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("iStore Manager");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(51, 51, 51));
        panel1.setForeground(new java.awt.Color(255, 255, 255));

        lblProductName.setBackground(new java.awt.Color(51, 51, 51));
        lblProductName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblProductName.setForeground(new java.awt.Color(255, 255, 255));
        lblProductName.setText("Product Name:");

        lblCategory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCategory.setForeground(new java.awt.Color(255, 255, 255));
        lblCategory.setText("Category:");

        txtProductName.setBackground(new java.awt.Color(102, 102, 102));
        txtProductName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtProductName.setForeground(new java.awt.Color(255, 255, 255));
        txtProductName.setText("ProductName");
        txtProductName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtProductNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProductNameFocusLost(evt);
            }
        });

        cbCategory.setBackground(new java.awt.Color(102, 102, 102));
        cbCategory.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbCategory.setForeground(new java.awt.Color(255, 255, 255));
        cbCategory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCategoryItemStateChanged(evt);
            }
        });
        cbCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoryActionPerformed(evt);
            }
        });

        btnInsert.setBackground(new java.awt.Color(102, 102, 102));
        btnInsert.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnInsert.setForeground(new java.awt.Color(255, 255, 255));
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(102, 102, 102));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(102, 102, 102));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
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

        panel3.setBackground(new java.awt.Color(255, 255, 255));

        lblh1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblh1.setText("Apple");

        lblh2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblh2.setText("iStore");

        lblimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/a4.png"))); // NOI18N

        lblh3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblh3.setText("Trust me,Pick me.....");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblh2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblh1, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblimg, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblh3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblimg, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblh1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblh2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblh3)
                .addGap(23, 23, 23))
        );

        lblPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblPrice.setText("Price:");

        lblQuantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblQuantity.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantity.setText("Quantity:");

        txtPrice.setBackground(new java.awt.Color(102, 102, 102));
        txtPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPrice.setForeground(new java.awt.Color(255, 255, 255));
        txtPrice.setText("Price");
        txtPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPriceFocusLost(evt);
            }
        });

        txtQuantity.setBackground(new java.awt.Color(102, 102, 102));
        txtQuantity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtQuantity.setForeground(new java.awt.Color(255, 255, 255));
        txtQuantity.setText("Quantity");
        txtQuantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtQuantityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQuantityFocusLost(evt);
            }
        });

        lblManager.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblManager.setForeground(new java.awt.Color(255, 255, 255));
        lblManager.setText("Manager");

        PanelSearch.setBackground(new java.awt.Color(102, 102, 102));

        txtSearch.setBackground(new java.awt.Color(153, 153, 153));
        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(255, 255, 255));
        txtSearch.setText("Search Product here");
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

        lblsearch.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblsearch.setForeground(new java.awt.Color(255, 255, 255));
        lblsearch.setText("Search");

        javax.swing.GroupLayout PanelSearchLayout = new javax.swing.GroupLayout(PanelSearch);
        PanelSearch.setLayout(PanelSearchLayout);
        PanelSearchLayout.setHorizontalGroup(
            PanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblsearch)
                .addGap(24, 24, 24))
        );
        PanelSearchLayout.setVerticalGroup(
            PanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSearchLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(PanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblsearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        tableProduct.setBackground(new java.awt.Color(102, 102, 102));
        tableProduct.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tableProduct.setForeground(new java.awt.Color(255, 255, 255));
        tableProduct.setModel(new javax.swing.table.DefaultTableModel(
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
                "Product ID", "Product Name", "Category", "Price", "Quantity"
            }
        ));
        tableProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductMouseClicked(evt);
            }
        });
        scrollPane1.setViewportView(tableProduct);

        btnLogOut.setBackground(new java.awt.Color(102, 102, 102));
        btnLogOut.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(255, 255, 255));
        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        btncreateAnAccount.setBackground(new java.awt.Color(102, 102, 102));
        btncreateAnAccount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btncreateAnAccount.setForeground(new java.awt.Color(255, 255, 255));
        btncreateAnAccount.setText("Create an Account");
        btncreateAnAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateAnAccountActionPerformed(evt);
            }
        });

        lblBack.setBackground(new java.awt.Color(102, 102, 102));
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
                .addGap(14, 14, 14)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBack)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuantity)
                            .addComponent(lblPrice))
                        .addGap(64, 64, 64)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCategory)
                            .addComponent(lblProductName))
                        .addGap(29, 29, 29)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtProductName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                            .addComponent(cbCategory, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lblManager))
                .addGap(51, 93, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(PanelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(btncreateAnAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblManager)
                .addGap(45, 45, 45)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProductName))
                .addGap(26, 26, 26)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategory)
                    .addComponent(cbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert)
                    .addComponent(btnUpdate))
                .addGap(26, 26, 26)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnClear))
                .addGap(136, 136, 136))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncreateAnAccount)
                    .addComponent(btnLogOut))
                .addGap(71, 71, 71))
            .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
     Product product = new Product();
        String error = "";
        String updates = "";
        product.setId(oldproduct.getId());

        String name = txtProductName.getText();

        if (name != "") {
            if (name.equals(oldproduct.getName())) {
                product.setName(oldproduct.getName());
                //txtProductName.setBackground(Color.green);
            } else {
                product.setName(name);
                //txtName.setBackground(Color.yellow);
                updates = updates + "\n Name updated";
            }
        } else {
            //txtName.setBackground(Color.red);
            error = error + "\n Invalid name";
        }
        String price = txtPrice.getText();
        if (price != "") {
            if (price.equals(oldproduct.getPrice())) {
                product.setPrice(oldproduct.getPrice());
                //txtPrice.setBackground(Color.green);
            } else {
                product.setPrice(Double.parseDouble(price));
                //txtPrice.setBackground(Color.yellow);
                updates = updates + "\n Price updated";
            }

        } else {
            //txtPrice.setBackground(Color.red);
            error = error + "\n Invalid Price";

        }
        
       String quantity = txtQuantity.getText();
        if (quantity != "") {
            if (price.equals(oldproduct.getQuantity())) {
                product.setQuantity(oldproduct.getQuantity());
                //txtPrice.setBackground(Color.green);
            } else {
                product.setQuantity(Integer.parseInt(quantity));
                //product.setQuantity(Integer.parseInt(quantity));
                //txtPrice.setBackground(Color.yellow);
                updates = updates + "\n Quantity updated";
            }

        } else {
            //txtPrice.setBackground(Color.red);
            error = error + "\n Invalid Price";

        }
        
        int catIndex = cbCategory.getSelectedIndex();
        Object catValue = cbCategory.getSelectedItem();
        if (catIndex != 0) {

            Category catObj = new Category();
            catObj.setId(catIndex);
            catObj.setName(catValue.toString());

            if (catObj.getId() == oldproduct.getCategory().getId()) {
                product.setCategory(oldproduct.getCategory());
            } else {
                product.setCategory(catObj);
                //jComboBox1.setBackground(Color.yellow);
                updates = updates + "\n Category Updated";
            }
        } else {
            //jComboBox1.setBackground(Color.red);
            error = error + "\n Select a Category";
        }
        if (error.isEmpty()) {

            if (!updates.isEmpty()) {
                int resp = JOptionPane.showConfirmDialog(null, "You have following updates\n\n" + updates);
                if (resp == 0) {

                    String status = ProductController.put(product);

                    if (status.equals("1")) {

                        int srow = tableProduct.getSelectedRow();
                        loadView();

                        tableProduct.setRowSelectionInterval(srow, srow);
                        loadForm();
                        JOptionPane.showMessageDialog(null, "Successfully updated \n\n" + status);


    }                                         
    }                   
            }}
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
       
        txtProductName.setText("");
        txtQuantity.setText("");
        txtPrice.setText("");
        txtSearch.setText("");
        cbCategory.setSelectedItem(0);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
         System.exit(0);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
    Product product = new Product();
        String error="";
        String name = txtProductName.getText();
        if(name != ""){
            product.setName(name);
            
        }else{
            
            error = error +"\n Invalid name";
        }
        String priceT = txtPrice.getText();
        double price;
        try{
            price = Double.parseDouble(priceT);
            if(price <0){
               
                error= error+"\n Invlid price";
            }else{
                
                product.setPrice(price);
            }
        }catch(NumberFormatException e){
            
            error = error +"\n Invlid price";
        }
        
        
        String quantityText = txtQuantity.getText();
        int quantity = Integer.parseInt(quantityText) ;
        try{if (quantity < 0) {
                //txtQuantity.setBackground(Color.red);
                error = error + "\n Invlid quantity";
            } else {
                //txtQuantity.setBackground(Color.green);
                product.setQuantity(quantity);
            }
        } catch (NumberFormatException e) {
           // txtPrice.setBackground(Color.red);
            error = error + "\n Invlid quantity";
        }
       int catIndex = cbCategory.getSelectedIndex();
       Object catValue = cbCategory.getSelectedItem();
       
       if(catIndex != 0){
          
           Category catobj = new Category();
           catobj.setId(catIndex);
           catobj.setName(catValue.toString());
           product.setCategory(catobj);
           
       }else{
         error = error + "\n select a category";
       }
       if(error.isEmpty()){
        String  cnfmsg = "Are you sure to save following details ?\n\n";
        cnfmsg = cnfmsg + "\n Name : "+product.getName();
        cnfmsg = cnfmsg + "\n Price : "+product.getPrice();
        //cnfmsg = cnfmsg + "\n quantity : "+product.getQuantity();
        cnfmsg = cnfmsg + "\n Category : "+product.getCategory().getName();
        cnfmsg = cnfmsg + "\n quantity : "+product.getQuantity();
        int conf = JOptionPane.showConfirmDialog(null,cnfmsg);
        if(conf == 0){
            String st = ProductController.post(product);
            if(st.equals("1")){
                JOptionPane.showMessageDialog(null,"successfully saved");
                loadView();
                loadForm();
            }     
                 }
        
    }else{
           JOptionPane.showConfirmDialog(null,error);
       }         
    }//GEN-LAST:event_btnInsertActionPerformed

    private void cbCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoryActionPerformed
       
    }//GEN-LAST:event_cbCategoryActionPerformed

    private void txtSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusGained
        if(txtSearch.getText().equals("Search Product here")) {
        txtSearch.setText("");
} 
        txtSearch.setForeground(new Color(0,102,102));
    }//GEN-LAST:event_txtSearchFocusGained

    private void txtSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusLost
        if(txtSearch.getText().equals("")) {
        txtSearch.setText("Search Product here");
    }     
        txtSearch.setForeground(new Color(0,102,102));
    }//GEN-LAST:event_txtSearchFocusLost

    private void txtProductNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProductNameFocusGained
        if(txtProductName.getText().equals("ProductName")) {
        txtProductName.setText("");
} 
    }//GEN-LAST:event_txtProductNameFocusGained

    private void txtProductNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProductNameFocusLost
       if(txtProductName.getText().equals("")) {
        txtProductName.setText("ProductName");
    }     
    }//GEN-LAST:event_txtProductNameFocusLost

    private void txtPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPriceFocusGained
      if(txtPrice.getText().equals("Price")) {
        txtPrice.setText("");
} 
    }//GEN-LAST:event_txtPriceFocusGained

    private void txtPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPriceFocusLost
        if(txtPrice.getText().equals("")) {
        txtPrice.setText("Price");
    }     
    }//GEN-LAST:event_txtPriceFocusLost

    private void txtQuantityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantityFocusGained
       if(txtQuantity.getText().equals("Quantity")) {
       txtQuantity .setText("");
    }     
    }//GEN-LAST:event_txtQuantityFocusGained

    private void txtQuantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantityFocusLost
        if(txtQuantity.getText().equals("")) {
        txtQuantity.setText("Quantity");
} 
    }//GEN-LAST:event_txtQuantityFocusLost

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
    }//GEN-LAST:event_formWindowOpened
   //public static int categoty_Id;
    private void cbCategoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCategoryItemStateChanged
       
    }//GEN-LAST:event_cbCategoryItemStateChanged
    
    private void tableProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductMouseClicked
    int row = tableProduct.getSelectedRow();
        if (row > -1) {
            Product product = productList.get(row);
            fillForm(product);
        }      
    }//GEN-LAST:event_tableProductMouseClicked

    private void btncreateAnAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateAnAccountActionPerformed
         //new CreateAccount().setVisible(true);/
         this.hide();
         CreateNewAccounts c1 = new  CreateNewAccounts();
         c1.show();//show this
    }//GEN-LAST:event_btncreateAnAccountActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
    int resp = JOptionPane.showConfirmDialog(null,"\n Are You Sure to delete following person ?\n"+oldproduct.getName());
        if(resp==0){
                String status =ProductController.delete(oldproduct);
            if(status.equals("1")){
                loadView();
                loadForm();
                JOptionPane.showMessageDialog(null, "Successfully Deleted");
                clearForm();

            }
            else{
                JOptionPane.showMessageDialog(null, "Faild to delete");
    }                                         
 }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
       this.hide();
       IstoreLogin IstoreLoginobj = new IstoreLogin();
       IstoreLoginobj.show();//show this
    }//GEN-LAST:event_lblBackMouseClicked

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
      DefaultTableModel model = (DefaultTableModel)tableProduct.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tableProduct.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtSearch.getText()));
                                       
    }//GEN-LAST:event_txtSearchKeyPressed

    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelSearch;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btncreateAnAccount;
    private javax.swing.JComboBox<String> cbCategory;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblManager;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblh1;
    private javax.swing.JLabel lblh2;
    private javax.swing.JLabel lblh3;
    private javax.swing.JLabel lblimg;
    private javax.swing.JLabel lblsearch;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel3;
    private javax.swing.JScrollPane scrollPane1;
    private javax.swing.JTable tableProduct;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
