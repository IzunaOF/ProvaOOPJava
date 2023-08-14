/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.com.izuna.learning;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ProductCard extends javax.swing.JPanel {

    private JPanel cardLayout;
    private Product product;
    private StoreFrame mainFrame;

    public ProductCard(JPanel cardLayout, Product product) {
        initComponents();
        this.cardLayout = cardLayout;
        this.product = product;

        this.productNameLabel.setText(product.getName());
        this.priceLabel.setText(String.format("%1s%1s", "R$", String.valueOf(product.getPrice())));

        this.productDetailsButton.setName(product.getDescription());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productDetailsButton = new javax.swing.JButton();
        productNameLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(3, 1, 1, 1, new java.awt.Color(204, 204, 255)));
        setPreferredSize(new java.awt.Dimension(150, 150));

        productDetailsButton.setBackground(new java.awt.Color(102, 0, 255));
        productDetailsButton.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        productDetailsButton.setForeground(new java.awt.Color(255, 255, 255));
        productDetailsButton.setText("Details");
        productDetailsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productDetailsButtonMouseClicked(evt);
            }
        });

        productNameLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        productNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        productNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productNameLabel.setText("productName");

        priceLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(255, 255, 255));
        priceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        priceLabel.setText("price");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(priceLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(productDetailsButton)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(productNameLabel)
                .addGap(18, 18, 18)
                .addComponent(priceLabel)
                .addGap(27, 27, 27)
                .addComponent(productDetailsButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void productDetailsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productDetailsButtonMouseClicked
        // TODO add your handling code here:
        this.changePainel(cardLayout, "productView");
        JFrame view = new ProductView(cardLayout, product, mainFrame);
        view.setLocationRelativeTo(cardLayout);
        view.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        view.setVisible(true);
    }//GEN-LAST:event_productDetailsButtonMouseClicked

    public void addMainFrame(StoreFrame frame) {
        mainFrame = frame;
    }

    protected void changePainel(JPanel card, String cardName) {
        CardLayout path = (CardLayout) card.getLayout();
        path.show(card, cardName);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JLabel priceLabel;
    javax.swing.JButton productDetailsButton;
    javax.swing.JLabel productNameLabel;
    // End of variables declaration//GEN-END:variables
}
