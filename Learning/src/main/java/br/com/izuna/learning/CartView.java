/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.com.izuna.learning;

public final class CartView extends javax.swing.JPanel {

    private final CartItem product;
    private StoreFrame mainFrame;

    public CartView(CartItem product, StoreFrame mainFrame) {
        super();
        initComponents();
        this.product = product;
        this.mainFrame = mainFrame;
        loadFields();
    }

    /**
     *
     */
    public void loadFields() {
        this.productName.setText(product.getItem().getName());
        this.price.setText(String.valueOf(product.getItem().getPrice() * product.getQuantity()));
        this.qtd.setText(String.valueOf(product.getQuantity()));
    }

    public void addMainFrame(StoreFrame frame) {
        mainFrame = frame;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productName = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        addCartBtn = new javax.swing.JButton();
        qtd = new javax.swing.JLabel();
        removeAmount = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 0, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("oioi"); // NOI18N
        setPreferredSize(new java.awt.Dimension(500, 30));

        productName.setForeground(new java.awt.Color(255, 255, 255));
        productName.setText("ProductName");

        price.setForeground(new java.awt.Color(255, 255, 255));
        price.setText("Price");

        addCartBtn.setBackground(new java.awt.Color(0, 102, 102));
        addCartBtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        addCartBtn.setForeground(new java.awt.Color(255, 255, 255));
        addCartBtn.setText("+");
        addCartBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCartBtnMouseClicked(evt);
            }
        });

        qtd.setForeground(new java.awt.Color(255, 255, 255));
        qtd.setText("00");

        removeAmount.setBackground(new java.awt.Color(204, 0, 0));
        removeAmount.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        removeAmount.setForeground(new java.awt.Color(255, 255, 255));
        removeAmount.setText("-");
        removeAmount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeAmountMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(productName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(price)
                .addGap(34, 34, 34)
                .addComponent(qtd)
                .addGap(61, 61, 61)
                .addComponent(addCartBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeAmount)
                .addGap(130, 130, 130))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productName)
                    .addComponent(price)
                    .addComponent(addCartBtn)
                    .addComponent(qtd)
                    .addComponent(removeAmount))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addCartBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCartBtnMouseClicked
        // TODO add your handling code here:
        mainFrame.addProductToCart(product.getItem(), 1, TOOL_TIP_TEXT_KEY);
        this.loadFields();
    }//GEN-LAST:event_addCartBtnMouseClicked

    private void removeAmountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeAmountMouseClicked
        // TODO add your handling code here:
        mainFrame.addProductToCart(product.getItem(), -1, TOOL_TIP_TEXT_KEY);
        this.loadFields();
    }//GEN-LAST:event_removeAmountMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCartBtn;
    private javax.swing.JLabel price;
    private javax.swing.JLabel productName;
    private javax.swing.JLabel qtd;
    private javax.swing.JButton removeAmount;
    // End of variables declaration//GEN-END:variables
}
