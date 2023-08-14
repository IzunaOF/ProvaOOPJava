/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.izuna.learning;

import java.awt.CardLayout;
import javax.swing.JPanel;

public class ProductView extends javax.swing.JFrame {

    private final Product product;
    private final StoreFrame mainFrame;

    public ProductView(JPanel cardLayout, Product product, StoreFrame mainFrame) {
        initComponents();
        this.product = product;
        this.mainFrame = mainFrame;
        this.loadFields();
    }

    private void loadFields() {
        this.viewProductDescription.setText(product.getDescription());
        this.viewProductName.setText(product.getName());
        this.viewProductPrice.setText(String.valueOf(product.getPrice()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productView = new javax.swing.JPanel();
        lastPageButton = new javax.swing.JButton();
        storeName1 = new javax.swing.JLabel();
        detailsOf_Label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        viewProductName = new javax.swing.JLabel();
        viewProductDescription = new javax.swing.JLabel();
        viewProductPrice = new javax.swing.JLabel();
        addCartButton = new javax.swing.JButton();
        addMessage = new javax.swing.JLabel();
        buyAmount = new javax.swing.JTextField();
        qtdLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        productView.setBackground(new java.awt.Color(255, 255, 255));
        productView.setPreferredSize(new java.awt.Dimension(900, 500));

        lastPageButton.setBackground(new java.awt.Color(153, 153, 255));
        lastPageButton.setForeground(new java.awt.Color(255, 255, 255));
        lastPageButton.setText("Fechar");
        lastPageButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lastPageButtonMouseClicked(evt);
            }
        });

        storeName1.setFont(new java.awt.Font("Vivaldi", 1, 28)); // NOI18N
        storeName1.setForeground(new java.awt.Color(153, 0, 153));
        storeName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        storeName1.setText("JôJoais");

        detailsOf_Label.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        detailsOf_Label.setForeground(new java.awt.Color(153, 0, 153));
        detailsOf_Label.setText("Product Details View");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\leosc\\Desktop\\Learning Java\\Learning\\src\\main\\java\\assets\\4.png")); // NOI18N
        jLabel1.setMinimumSize(new java.awt.Dimension(200, 200));

        viewProductName.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        viewProductName.setText("product name");

        viewProductDescription.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        viewProductDescription.setText("description");

        viewProductPrice.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        viewProductPrice.setText("price");

        addCartButton.setBackground(new java.awt.Color(0, 102, 0));
        addCartButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addCartButton.setForeground(new java.awt.Color(255, 255, 255));
        addCartButton.setText("ADD TO CART");
        addCartButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCartButtonMouseClicked(evt);
            }
        });
        addCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCartButtonActionPerformed(evt);
            }
        });

        buyAmount.setBackground(new java.awt.Color(231, 228, 255));
        buyAmount.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        buyAmount.setText("1");

        qtdLabel.setForeground(new java.awt.Color(102, 102, 102));
        qtdLabel.setText("Quantidade");

        javax.swing.GroupLayout productViewLayout = new javax.swing.GroupLayout(productView);
        productView.setLayout(productViewLayout);
        productViewLayout.setHorizontalGroup(
            productViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productViewLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(productViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(productViewLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lastPageButton))
                    .addComponent(storeName1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137)
                .addComponent(detailsOf_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(productViewLayout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(productViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(productViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(viewProductDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(viewProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addMessage)
                    .addGroup(productViewLayout.createSequentialGroup()
                        .addComponent(buyAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(qtdLabel))
                    .addComponent(viewProductPrice)
                    .addComponent(addCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(129, 129, 129))
        );
        productViewLayout.setVerticalGroup(
            productViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productViewLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(productViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(detailsOf_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(productViewLayout.createSequentialGroup()
                        .addComponent(storeName1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastPageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(productViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(productViewLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(viewProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(viewProductDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(viewProductPrice)
                        .addGap(31, 31, 31)
                        .addComponent(addMessage)
                        .addGap(32, 32, 32)
                        .addGroup(productViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buyAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtdLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productViewLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(productView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(productView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lastPageButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastPageButtonMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_lastPageButtonMouseClicked

    private void addCartButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCartButtonMouseClicked
        // TODO add your handling code here:
        mainFrame.addProductToCart(product, Integer.valueOf(buyAmount.getText()), "credit");
        addMessage.setText("Adicionado com sucesso");
    }//GEN-LAST:event_addCartButtonMouseClicked

    private void addCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCartButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addCartButtonActionPerformed

    protected void changePainel(JPanel card, String cardName) {
        CardLayout path = (CardLayout) card.getLayout();
        path.show(card, cardName);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCartButton;
    private javax.swing.JLabel addMessage;
    private javax.swing.JTextField buyAmount;
    private javax.swing.JLabel detailsOf_Label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton lastPageButton;
    private javax.swing.JPanel productView;
    private javax.swing.JLabel qtdLabel;
    private javax.swing.JLabel storeName1;
    private javax.swing.JLabel viewProductDescription;
    private javax.swing.JLabel viewProductName;
    private javax.swing.JLabel viewProductPrice;
    // End of variables declaration//GEN-END:variables
}
