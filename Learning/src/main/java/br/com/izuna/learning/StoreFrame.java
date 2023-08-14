/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.izuna.learning;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StoreFrame extends javax.swing.JFrame {

    private Integer ID_CONTROL = 0;
    private final List<CartItem> cart = new ArrayList();
    private final ArrayList<Product> products;
    private Double total = 0.0;
    private Integer prev = 0;
    private Integer next = 15;
    private int itemsPage = 15;
    private int actualPage = 0;

    public StoreFrame(SessionAuth session, ArrayList<Product> products) {
        this.products = products;
        initComponents();
        this.setLocationRelativeTo(null);
        setActualViewPage(1);
        this.loadCards(false);
        cartOwner.setText(session.currentUser.getOwnerAccount() + "'s Shopcart");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        showcase = new javax.swing.JPanel();
        storeName = new javax.swing.JLabel();
        profileView = new javax.swing.JLabel();
        cartButton = new javax.swing.JButton();
        storageButton = new javax.swing.JButton();
        nextPageButton = new javax.swing.JButton();
        container = new javax.swing.JPanel();
        prevPageButton = new javax.swing.JButton();
        page = new javax.swing.JLabel();
        storage = new javax.swing.JPanel();
        productName = new javax.swing.JTextField();
        productPrice = new javax.swing.JTextField();
        productDesciption = new javax.swing.JTextField();
        addProductButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        inicialQuantity = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        productDesciption1 = new javax.swing.JTextField();
        capacity = new javax.swing.JLabel();
        actualCapacity = new javax.swing.JLabel();
        stockValue = new javax.swing.JLabel();
        mostValue = new javax.swing.JLabel();
        lessValue = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        dashboard = new javax.swing.JPanel();
        cartView = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        views = new javax.swing.JPanel();
        cartOwner = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main.setLayout(new java.awt.CardLayout());

        showcase.setBackground(new java.awt.Color(255, 255, 255));
        showcase.setName("showcase"); // NOI18N

        storeName.setFont(new java.awt.Font("Vivaldi", 1, 60)); // NOI18N
        storeName.setForeground(new java.awt.Color(153, 0, 153));
        storeName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        storeName.setText("JôJoais");

        profileView.setText("profile");

        cartButton.setBackground(new java.awt.Color(102, 0, 255));
        cartButton.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        cartButton.setForeground(new java.awt.Color(255, 255, 255));
        cartButton.setText("my Cart");
        cartButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cartButton.setName("Cart"); // NOI18N
        cartButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartButtonMouseClicked(evt);
            }
        });

        storageButton.setBackground(new java.awt.Color(102, 0, 255));
        storageButton.setForeground(new java.awt.Color(255, 255, 255));
        storageButton.setText("STORAGE");
        storageButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                storageButtonMouseClicked(evt);
            }
        });

        nextPageButton.setText(">>>");
        nextPageButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextPageButtonMouseClicked(evt);
            }
        });

        container.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );

        prevPageButton.setText("<<<");
        prevPageButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prevPageButtonMouseClicked(evt);
            }
        });

        page.setText("pages");

        javax.swing.GroupLayout showcaseLayout = new javax.swing.GroupLayout(showcase);
        showcase.setLayout(showcaseLayout);
        showcaseLayout.setHorizontalGroup(
            showcaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showcaseLayout.createSequentialGroup()
                .addGroup(showcaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(showcaseLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(showcaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(showcaseLayout.createSequentialGroup()
                                .addComponent(storeName, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(storageButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 301, Short.MAX_VALUE)
                                .addComponent(cartButton)
                                .addGap(43, 43, 43)
                                .addComponent(profileView)
                                .addGap(33, 33, 33))
                            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(showcaseLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prevPageButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(page)
                        .addGap(8, 8, 8)
                        .addComponent(nextPageButton)))
                .addGap(56, 56, 56))
        );
        showcaseLayout.setVerticalGroup(
            showcaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showcaseLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(showcaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storeName)
                    .addComponent(cartButton)
                    .addComponent(profileView)
                    .addComponent(storageButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(showcaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextPageButton)
                    .addComponent(prevPageButton)
                    .addComponent(page))
                .addGap(18, 18, 18))
        );

        main.add(showcase, "showcase");

        storage.setBackground(new java.awt.Color(204, 204, 255));
        storage.setPreferredSize(new java.awt.Dimension(1000, 500));

        productName.setBackground(new java.awt.Color(235, 235, 255));
        productName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        productPrice.setBackground(new java.awt.Color(235, 235, 255));
        productPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        productPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productPriceActionPerformed(evt);
            }
        });

        productDesciption.setBackground(new java.awt.Color(235, 235, 255));
        productDesciption.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        addProductButton.setBackground(new java.awt.Color(51, 0, 153));
        addProductButton.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        addProductButton.setForeground(new java.awt.Color(255, 255, 255));
        addProductButton.setText("INSERIR");
        addProductButton.setName("Button"); // NOI18N
        addProductButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addProductButtonMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Capacidade Estoque");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Capacidade Atual");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Valor em Estoque");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Item de maior valor");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Item de menor valor");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Filtro");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 51, 255));
        jLabel7.setText("Adicione um novo produto ao Estoque");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Nome do Produto");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Preço Unitário");

        inicialQuantity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inicialQuantity.setText("Quantidade Inicial");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Descrição");

        productDesciption1.setBackground(new java.awt.Color(235, 235, 255));
        productDesciption1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        capacity.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        capacity.setForeground(new java.awt.Color(102, 102, 102));
        capacity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        capacity.setText("R$ 00.00");

        actualCapacity.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        actualCapacity.setForeground(new java.awt.Color(153, 0, 0));
        actualCapacity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        actualCapacity.setText("R$ 00.00");

        stockValue.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        stockValue.setForeground(new java.awt.Color(0, 51, 51));
        stockValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        stockValue.setText("R$ 00.00");

        mostValue.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        mostValue.setForeground(new java.awt.Color(204, 153, 0));
        mostValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mostValue.setText("R$ 00.00");

        lessValue.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lessValue.setForeground(new java.awt.Color(102, 51, 0));
        lessValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lessValue.setText("R$ 00.00");

        jButton3.setBackground(new java.awt.Color(153, 153, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Voltar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout storageLayout = new javax.swing.GroupLayout(storage);
        storage.setLayout(storageLayout);
        storageLayout.setHorizontalGroup(
            storageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, storageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(144, 144, 144))
            .addGroup(storageLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, storageLayout.createSequentialGroup()
                .addGap(0, 129, Short.MAX_VALUE)
                .addGroup(storageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(storageLayout.createSequentialGroup()
                        .addGroup(storageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(capacity)
                            .addComponent(actualCapacity)
                            .addComponent(stockValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(storageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(storageLayout.createSequentialGroup()
                        .addGroup(storageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mostValue)
                            .addComponent(lessValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(storageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118)
                .addGroup(storageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, storageLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, storageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(addProductButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, storageLayout.createSequentialGroup()
                            .addGroup(storageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11)
                                .addComponent(inicialQuantity)
                                .addComponent(jLabel9))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(storageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(productPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(productDesciption, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(productDesciption1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(246, 246, 246))
        );
        storageLayout.setVerticalGroup(
            storageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, storageLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGroup(storageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(storageLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(storageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(capacity))
                        .addGap(3, 3, 3)
                        .addGroup(storageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(actualCapacity))
                        .addGap(31, 31, 31)
                        .addGroup(storageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(stockValue))
                        .addGap(33, 33, 33)
                        .addGroup(storageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(mostValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(storageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lessValue))
                        .addGap(55, 55, 55)
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(storageLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(storageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(storageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(storageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inicialQuantity)
                            .addComponent(productDesciption1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(storageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productDesciption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(36, 36, 36)
                        .addComponent(addProductButton)
                        .addGap(286, 286, 286))))
        );

        main.add(storage, "storage");

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 996, Short.MAX_VALUE)
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        main.add(dashboard, "dashboard");

        cartView.setBackground(new java.awt.Color(204, 204, 255));
        cartView.setPreferredSize(new java.awt.Dimension(900, 720));

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Voltar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        views.setBackground(new java.awt.Color(204, 204, 255));
        views.setName("views"); // NOI18N
        views.setPreferredSize(new java.awt.Dimension(800, 520));

        javax.swing.GroupLayout viewsLayout = new javax.swing.GroupLayout(views);
        views.setLayout(viewsLayout);
        viewsLayout.setHorizontalGroup(
            viewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        viewsLayout.setVerticalGroup(
            viewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        cartOwner.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        cartOwner.setText("owners's cart");

        javax.swing.GroupLayout cartViewLayout = new javax.swing.GroupLayout(cartView);
        cartView.setLayout(cartViewLayout);
        cartViewLayout.setHorizontalGroup(
            cartViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartViewLayout.createSequentialGroup()
                .addGroup(cartViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cartViewLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jButton1)
                        .addGap(157, 157, 157)
                        .addComponent(cartOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cartViewLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(views, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        cartViewLayout.setVerticalGroup(
            cartViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartViewLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(cartViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(cartOwner))
                .addGap(19, 19, 19)
                .addComponent(views, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        main.add(cartView, "cartView");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cartButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartButtonMouseClicked
        // TODO add your handling code here:
        loadCartView();
        changePainel(main, "cartView");
    }//GEN-LAST:event_cartButtonMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        changePainel(main, "showcase");
    }//GEN-LAST:event_jButton1MouseClicked

    private void storageButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storageButtonMouseClicked
        // TODO add your handling code here:
        refresh();
        changePainel(main, "storage");
    }//GEN-LAST:event_storageButtonMouseClicked

    private void addProductButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addProductButtonMouseClicked
        // TODO add your handling code here:
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), this.productName.getText(), Double.valueOf(this.productPrice.getText()), this.productDesciption.getText(), "prod"));
    }//GEN-LAST:event_addProductButtonMouseClicked

    private void productPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productPriceActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        changePainel(main, "showcase");
        loadCards(false);
    }//GEN-LAST:event_jButton3MouseClicked

    private void nextPageButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextPageButtonMouseClicked
        // TODO add your handling code here:
        setActualViewPage(1);
        loadCards(false);
    }//GEN-LAST:event_nextPageButtonMouseClicked

    private void prevPageButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prevPageButtonMouseClicked
        // TODO add your handling code here:
        setActualViewPage(-1);
        loadCards(true);
    }//GEN-LAST:event_prevPageButtonMouseClicked

    private void setActualViewPage(int value) {
        actualPage += value;
        int totalPages = products.size() / itemsPage + 1;
        actualPage = actualPage < 1 ? 1 : actualPage > totalPages ? totalPages : actualPage;
        String lastString = "/" + totalPages;
        String str = actualPage + lastString;
        page.setText(str);
    }

    private void refresh() {
        actualCapacity.setText(String.valueOf(products.size()));
        capacity.setText("500");
        int point = this.getTotalValue().toString().indexOf(".");
        String str = this.getTotalValue().toString().substring(0, point + 3);
        stockValue.setText(String.format("%1s%1s", "R$ ", str));
    }

    private Double getTotalValue() {
        total = 0.0;
        products.forEach((p) -> {
            total += p.getPrice();
        });
        return total;
    }

    private void loadCards(boolean previous) {
        container.removeAll();
        container.repaint();
        container.revalidate();

        int x = 50;
        int y = 0;
        int w = 150;
        int h = 150;

        for (int i = (actualPage - 1) * itemsPage, control = 0; i < this.products.size(); i++, control++) {
            if (control == itemsPage) {
                if (previous) {
                    prev = prev - itemsPage < 0 ? 0 : prev - itemsPage;
                } else {
                    prev = next;
                }
                next = i;
                return;
            }

            ProductCard details = new ProductCard(main, this.products.get(i));
            details.setBounds(x, y, w, h);
            details.addMainFrame(this);

            x += 155;
            if (x > this.container.getSize().width - 150) {
                x = 50;
                y += 155;
            }

            this.container.add(details);
        }
    }

    protected void loadCartView() {
        views.removeAll();
        views.repaint();
        views.revalidate();

        int x = 20;
        int y = 15;
        int w = views.getSize().width;
        int h = 50;

        if (this.cart.isEmpty()) {
            JLabel empty = new JLabel("Você não adicionou nenhum item");
            JButton shopBtn = new JButton("Ir às Compras");

            empty.setBounds(x, y, w, h);
            shopBtn.setBounds(x, y + 50, 200, h - 25);

            views.add(empty);
            views.add(shopBtn);
        } else {

            for (int i = 0; i < this.cart.size(); i++) {
                CartView details = new CartView(this.cart.get(i), this);
                JButton button = new JButton("REMOVE");
                button.setBackground(Color.DARK_GRAY);
                button.setForeground(Color.WHITE);
                button.setActionCommand(cart.get(i).getItemID());
                button.addActionListener(ev -> {
                    this.removePorductFromCart(ev.getActionCommand());
                });

                details.setBounds(x, y, w, h);
                button.setBounds(x + w - 125, y + 13, 100, h - 25);

                y += 50;

                views.add(button);
                views.add(details);

            }
        }

    }

    public void addProductToCart(Product product, Integer quantity, String payment) {
        for (int i = 0; i < this.cart.size(); i++) {
            if (cart.get(i).getItemID().equals(product.getID())) {
                cart.get(i).updateQuantity(quantity);
                return;
            }
        }
        cart.add(new CartItem(product, quantity, payment));
        loadCartView();
    }

    public void removePorductFromCart(String id) {
        for (int i = 0; i < this.cart.size(); i++) {
            if (cart.get(i).getItemID().equals(id)) {
                cart.remove(i);
                loadCartView();
                return;
            }
        }

    }

    protected void changePainel(JPanel card, String cardName) {
        CardLayout path = (CardLayout) card.getLayout();
        path.show(card, cardName);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actualCapacity;
    private javax.swing.JButton addProductButton;
    private javax.swing.JLabel capacity;
    private javax.swing.JButton cartButton;
    private javax.swing.JLabel cartOwner;
    private javax.swing.JPanel cartView;
    private javax.swing.JPanel container;
    private javax.swing.JPanel dashboard;
    private javax.swing.JLabel inicialQuantity;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lessValue;
    private javax.swing.JPanel main;
    private javax.swing.JLabel mostValue;
    private javax.swing.JButton nextPageButton;
    private javax.swing.JLabel page;
    private javax.swing.JButton prevPageButton;
    private javax.swing.JTextField productDesciption;
    private javax.swing.JTextField productDesciption1;
    private javax.swing.JTextField productName;
    private javax.swing.JTextField productPrice;
    private javax.swing.JLabel profileView;
    private javax.swing.JPanel showcase;
    private javax.swing.JLabel stockValue;
    private javax.swing.JPanel storage;
    private javax.swing.JButton storageButton;
    private javax.swing.JLabel storeName;
    private javax.swing.JPanel views;
    // End of variables declaration//GEN-END:variables
}
