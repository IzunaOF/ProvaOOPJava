package Interface;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JLabel;
import produto.Produto;

public final class MenuJOJO extends javax.swing.JFrame {

    ArrayList<Produto> products = new ArrayList<>();

    public void addProductsTest() {
        String[] names = {"Brinco", "Anel", "Colar", "Bracelete", "Piercing"};
        Double[] values = {45.99, 12.99, 89.99, 50.00, 19.90};
        for (int i = 0; i < names.length; i++) {
            products.add(new Produto(names[i], values[i], i * 5));
        }
    }

    public MenuJOJO() {
        addProductsTest();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        prodColar = new javax.swing.JLabel();
        prodPiercing = new javax.swing.JLabel();
        prodAnel = new javax.swing.JLabel();
        prodBracelete = new javax.swing.JLabel();
        prodBrinco = new javax.swing.JLabel();
        btnColar = new javax.swing.JButton();
        btnBracelete = new javax.swing.JButton();
        btnPiercing = new javax.swing.JButton();
        btnBrinco = new javax.swing.JButton();
        btnAnel = new javax.swing.JButton();
        viewProduto = new javax.swing.JPanel();
        nomePorduto = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        reservadosLabel = new javax.swing.JLabel();
        qtdLabel = new javax.swing.JLabel();
        value = new javax.swing.JLabel();
        qtd = new javax.swing.JLabel();
        reservados = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        btnReservar = new javax.swing.JButton();
        btnCancelarReserva = new javax.swing.JButton();
        compradosQtd = new javax.swing.JLabel();
        compradosQTD = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        gastoCompra = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        gastoReserva = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main.setPreferredSize(new java.awt.Dimension(500, 500));
        main.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setText("JôJoias");

        prodColar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        prodColar.setText("Colar");

        prodPiercing.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        prodPiercing.setText("Priercing");

        prodAnel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        prodAnel.setText("Anel");

        prodBracelete.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        prodBracelete.setText("Bracelete");

        prodBrinco.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        prodBrinco.setText("Brinco");

        btnColar.setText("Ver");
        btnColar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnColarMouseClicked(evt);
            }
        });

        btnBracelete.setText("Ver");
        btnBracelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBraceleteMouseClicked(evt);
            }
        });

        btnPiercing.setText("Ver");
        btnPiercing.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPiercingMouseClicked(evt);
            }
        });

        btnBrinco.setText("Ver");
        btnBrinco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBrincoMouseClicked(evt);
            }
        });

        btnAnel.setText("Ver");
        btnAnel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnColar)
                            .addComponent(btnBracelete)
                            .addComponent(btnPiercing)
                            .addComponent(btnBrinco)
                            .addComponent(btnAnel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prodColar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prodAnel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prodBrinco, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                                    .addComponent(prodPiercing)
                                    .addGap(15, 15, 15))
                                .addComponent(prodBracelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prodColar)
                    .addComponent(btnColar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prodBracelete)
                    .addComponent(btnBracelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prodPiercing)
                    .addComponent(btnPiercing))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prodBrinco)
                    .addComponent(btnBrinco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prodAnel)
                    .addComponent(btnAnel))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        main.add(menu, "menu");

        nomePorduto.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        nomePorduto.setText("PRODUTO");

        valueLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        valueLabel.setText("Valor");

        reservadosLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        reservadosLabel.setText("Reservados");

        qtdLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        qtdLabel.setText("QTD");

        value.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        value.setText("00");

        qtd.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        qtd.setText("00");

        reservados.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        reservados.setText("00");

        jButton1.setText("Ir pro Menu");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        btnComprar.setText("Comprar");
        btnComprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComprarMouseClicked(evt);
            }
        });

        btnReservar.setText("Reservar");
        btnReservar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReservarMouseClicked(evt);
            }
        });

        btnCancelarReserva.setText("Cancelar Reserva");
        btnCancelarReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarReservaMouseClicked(evt);
            }
        });

        compradosQtd.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        compradosQtd.setText("00");

        compradosQTD.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        compradosQTD.setText("Comprados");

        jLabel2.setText("Valor Gasto Neste Item");

        gastoCompra.setText("00");

        jLabel3.setText("Valor gasto em reserva deste Item");

        gastoReserva.setText("00");

        javax.swing.GroupLayout viewProdutoLayout = new javax.swing.GroupLayout(viewProduto);
        viewProduto.setLayout(viewProdutoLayout);
        viewProdutoLayout.setHorizontalGroup(
            viewProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewProdutoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(viewProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewProdutoLayout.createSequentialGroup()
                        .addGroup(viewProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(viewProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(gastoCompra))
                            .addGroup(viewProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(gastoReserva)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewProdutoLayout.createSequentialGroup()
                        .addGroup(viewProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(viewProdutoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(viewProdutoLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(btnComprar)
                                .addGap(29, 29, 29)
                                .addComponent(btnReservar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(btnCancelarReserva))
                            .addGroup(viewProdutoLayout.createSequentialGroup()
                                .addGroup(viewProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(viewProdutoLayout.createSequentialGroup()
                                        .addComponent(compradosQTD)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(compradosQtd)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(valueLabel))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, viewProdutoLayout.createSequentialGroup()
                                        .addComponent(reservadosLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(reservados)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(qtdLabel)))
                                .addGap(27, 27, 27)
                                .addGroup(viewProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(value)
                                    .addComponent(qtd))))
                        .addGap(51, 51, 51))))
            .addGroup(viewProdutoLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(nomePorduto, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        viewProdutoLayout.setVerticalGroup(
            viewProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewProdutoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jButton1)
                .addGap(29, 29, 29)
                .addComponent(nomePorduto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(viewProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComprar)
                    .addComponent(btnReservar)
                    .addComponent(btnCancelarReserva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(viewProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(value)
                    .addComponent(compradosQTD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compradosQtd))
                .addGap(18, 18, 18)
                .addGroup(viewProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtd)
                    .addComponent(reservadosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reservados))
                .addGap(40, 40, 40)
                .addGroup(viewProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(gastoCompra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(viewProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(gastoReserva))
                .addGap(28, 28, 28))
        );

        main.add(viewProduto, "viewProduto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 342, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnColarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnColarMouseClicked
        // TODO add your handling code here:
        Produto item = getItem("Colar");

        setViewProduto(item, "viewProduto");
    }//GEN-LAST:event_btnColarMouseClicked

    private void btnBraceleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBraceleteMouseClicked
        // TODO add your handling code here:
        Produto item = getItem("Bracelete");
        setViewProduto(item, "viewProduto");
    }//GEN-LAST:event_btnBraceleteMouseClicked

    private void btnPiercingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPiercingMouseClicked
        // TODO add your handling code here:
        Produto item = getItem("Piercing");
        setViewProduto(item, "viewProduto");
    }//GEN-LAST:event_btnPiercingMouseClicked

    private void btnBrincoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBrincoMouseClicked
        // TODO add your handling code here:
        Produto item = getItem("Brinco");
        setViewProduto(item, "viewProduto");
    }//GEN-LAST:event_btnBrincoMouseClicked

    private void btnAnelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnelMouseClicked
        // TODO add your handling code here:
        Produto item = getItem("Anel");
        setViewProduto(item, "viewProduto");
    }//GEN-LAST:event_btnAnelMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        changeCard("menu");
    }//GEN-LAST:event_jButton1MouseClicked

    private void btnComprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprarMouseClicked
        // TODO add your handling code here:
        this.products.forEach((Produto p) -> {
            if (p.getName().equals(this.nomePorduto.getText())) {
                p.BUY(1);
                compradosQtd.setText(Integer.toString(p.getComprados()) + "und(s)");
                gastoCompra.setText("R$ " + String.format("%02d", p.getComprados() * p.getValue().intValue()));
                qtd.setText(Integer.toString(p.getQtd()) + "und(s)");
            }
        });
    }//GEN-LAST:event_btnComprarMouseClicked

    private void btnReservarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReservarMouseClicked
        // TODO add your handling code here:
        this.products.forEach((Produto p) -> {
            if (p.getName().equals(this.nomePorduto.getText())) {
                p.reserve(1);
                reservados.setText(Integer.toString(p.getReservados()) + "und(s)");
                gastoReserva.setText("R$ " + String.format("%02d", p.getReservados() * p.getValue().intValue()));
                gastoCompra.setText("R$ " + String.format("%02d", p.getComprados() * p.getValue().intValue()));
                qtd.setText(Integer.toString(p.getQtd()) + "und(s)");
            }
        });
    }//GEN-LAST:event_btnReservarMouseClicked

    private String formatar(Double value) {
        return "R$ " + value;
    }
    private void btnCancelarReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarReservaMouseClicked
        // TODO add your handling code here:
        this.products.forEach((Produto p) -> {
            if (p.getName().equals(this.nomePorduto.getText())) {
                p.unReserve(1);
                reservados.setText(Integer.toString(p.getReservados()) + "und(s)");
                gastoReserva.setText("R$ " + String.format("%02d", p.getReservados() * p.getValue().intValue()));

                qtd.setText(Integer.toString(p.getQtd()) + "und(s)");
            }
        });
    }//GEN-LAST:event_btnCancelarReservaMouseClicked

    private void setViewProduto(Produto item, String cardName) {
        value.setText("R$ " + Double.toString(item.getValue()));
        nomePorduto.setText(item.getName());
        reservados.setText(Integer.toString(item.getReservados()) + "und(s)");
        qtd.setText(Integer.toString(item.getQtd()) + "und(s)");
        compradosQtd.setText(item.getComprados() + "und(s)");

        changeCard(cardName);
    }

    private Produto getItem(String name) {
        for (int i = 0; i < this.products.size(); i++) {

            if (this.products.get(i).getName().equals(name)) {
                return this.products.get(i);
            }
        }
        return null;
    }

    private void changeCard(String cardName) {
        CardLayout cardLayout = (CardLayout) this.main.getLayout();
        cardLayout.show(this.main, cardName);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnel;
    private javax.swing.JButton btnBracelete;
    private javax.swing.JButton btnBrinco;
    private javax.swing.JButton btnCancelarReserva;
    private javax.swing.JButton btnColar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnPiercing;
    private javax.swing.JButton btnReservar;
    private javax.swing.JLabel compradosQTD;
    private javax.swing.JLabel compradosQtd;
    private javax.swing.JLabel gastoCompra;
    private javax.swing.JLabel gastoReserva;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel main;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel nomePorduto;
    private javax.swing.JLabel prodAnel;
    private javax.swing.JLabel prodBracelete;
    private javax.swing.JLabel prodBrinco;
    private javax.swing.JLabel prodColar;
    private javax.swing.JLabel prodPiercing;
    private javax.swing.JLabel qtd;
    private javax.swing.JLabel qtdLabel;
    private javax.swing.JLabel reservados;
    private javax.swing.JLabel reservadosLabel;
    private javax.swing.JLabel value;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JPanel viewProduto;
    // End of variables declaration//GEN-END:variables
}
