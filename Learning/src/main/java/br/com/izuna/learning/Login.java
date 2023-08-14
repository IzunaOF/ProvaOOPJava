/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.izuna.learning;

import java.awt.CardLayout;
import javax.swing.JPanel;

interface LoginStruct {

    public String username();

    public String password();
}

public class Login extends javax.swing.JFrame {

    Application application = new Application();

    public Login() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        loginView = new javax.swing.JPanel();
        lbUsername = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        loginText = new javax.swing.JLabel();
        keepOnline = new javax.swing.JCheckBox();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        bottonTxt = new javax.swing.JLabel();
        createUserLink = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();
        storeName = new javax.swing.JLabel();
        createView = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        createAccountButton = new javax.swing.JButton();
        bottonTxt1 = new javax.swing.JLabel();
        loginViewButton = new javax.swing.JLabel();
        storeName1 = new javax.swing.JLabel();
        loginText1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(450, 550));

        main.setPreferredSize(new java.awt.Dimension(450, 550));
        main.setLayout(new java.awt.CardLayout());

        loginView.setBackground(new java.awt.Color(204, 204, 255));
        loginView.setPreferredSize(new java.awt.Dimension(450, 500));

        lbUsername.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lbUsername.setText("Username");

        lbPassword.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lbPassword.setText("Password");

        submitButton.setBackground(new java.awt.Color(51, 0, 102));
        submitButton.setFont(new java.awt.Font("Lucida Fax", 2, 12)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("SUBMIT");
        submitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitButtonMouseClicked(evt);
            }
        });

        loginText.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        loginText.setForeground(new java.awt.Color(51, 0, 102));
        loginText.setText("LOGIN");

        keepOnline.setBackground(new java.awt.Color(204, 204, 255));
        keepOnline.setForeground(new java.awt.Color(102, 102, 102));
        keepOnline.setText("Manter Conectado");

        usernameField.setBackground(new java.awt.Color(235, 235, 255));
        usernameField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        usernameField.setText("test");
        usernameField.setPreferredSize(new java.awt.Dimension(60, 26));

        passwordField.setBackground(new java.awt.Color(235, 235, 255));
        passwordField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        passwordField.setText("100");
        passwordField.setMinimumSize(new java.awt.Dimension(60, 20));
        passwordField.setPreferredSize(new java.awt.Dimension(60, 26));

        bottonTxt.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        bottonTxt.setForeground(new java.awt.Color(102, 102, 102));
        bottonTxt.setText("Não possui uma conta?");

        createUserLink.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        createUserLink.setForeground(new java.awt.Color(102, 0, 102));
        createUserLink.setText("criar conta.");
        createUserLink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createUserLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createUserLinkMouseClicked(evt);
            }
        });

        errorLabel.setForeground(new java.awt.Color(204, 0, 0));

        storeName.setFont(new java.awt.Font("Vivaldi", 1, 60)); // NOI18N
        storeName.setForeground(new java.awt.Color(153, 0, 153));
        storeName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        storeName.setText("JôJoais");

        javax.swing.GroupLayout loginViewLayout = new javax.swing.GroupLayout(loginView);
        loginView.setLayout(loginViewLayout);
        loginViewLayout.setHorizontalGroup(
            loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginViewLayout.createSequentialGroup()
                .addGroup(loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginViewLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbUsername)
                            .addComponent(lbPassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(loginViewLayout.createSequentialGroup()
                                .addComponent(bottonTxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(createUserLink))
                            .addComponent(keepOnline)
                            .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(submitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)))
                    .addGroup(loginViewLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(errorLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginViewLayout.createSequentialGroup()
                .addGap(0, 112, Short.MAX_VALUE)
                .addGroup(loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginViewLayout.createSequentialGroup()
                        .addComponent(storeName, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginViewLayout.createSequentialGroup()
                        .addComponent(loginText, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173))))
        );
        loginViewLayout.setVerticalGroup(
            loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginViewLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(storeName)
                .addGap(40, 40, 40)
                .addComponent(loginText)
                .addGap(12, 12, 12)
                .addComponent(errorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbUsername)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPassword)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(keepOnline)
                .addGap(18, 18, 18)
                .addComponent(submitButton)
                .addGap(18, 18, 18)
                .addGroup(loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bottonTxt)
                    .addComponent(createUserLink))
                .addGap(154, 154, 154))
        );

        usernameField.getAccessibleContext().setAccessibleName("");

        main.add(loginView, "loginView");

        createView.setBackground(new java.awt.Color(204, 204, 255));
        createView.setPreferredSize(new java.awt.Dimension(450, 500));

        username.setBackground(new java.awt.Color(235, 235, 255));
        username.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        password.setBackground(new java.awt.Color(235, 235, 255));
        password.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Password");

        createAccountButton.setBackground(new java.awt.Color(51, 0, 102));
        createAccountButton.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        createAccountButton.setForeground(new java.awt.Color(255, 255, 255));
        createAccountButton.setText("Criar Conta");
        createAccountButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createAccountButtonMouseClicked(evt);
            }
        });

        bottonTxt1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        bottonTxt1.setForeground(new java.awt.Color(102, 102, 102));
        bottonTxt1.setText("Já possui uma conta?");

        loginViewButton.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        loginViewButton.setForeground(new java.awt.Color(102, 0, 102));
        loginViewButton.setText("login");
        loginViewButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginViewButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginViewButtonMouseClicked(evt);
            }
        });

        storeName1.setFont(new java.awt.Font("Vivaldi", 1, 60)); // NOI18N
        storeName1.setForeground(new java.awt.Color(153, 0, 153));
        storeName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        storeName1.setText("JôJoais");

        loginText1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        loginText1.setForeground(new java.awt.Color(51, 0, 102));
        loginText1.setText("CREATE");

        javax.swing.GroupLayout createViewLayout = new javax.swing.GroupLayout(createView);
        createView.setLayout(createViewLayout);
        createViewLayout.setHorizontalGroup(
            createViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createViewLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(createViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createViewLayout.createSequentialGroup()
                        .addComponent(bottonTxt1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(loginViewButton))
                    .addGroup(createViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(createAccountButton, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                        .addComponent(username)
                        .addComponent(password)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createViewLayout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addGroup(createViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createViewLayout.createSequentialGroup()
                        .addComponent(storeName1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createViewLayout.createSequentialGroup()
                        .addComponent(loginText1)
                        .addGap(168, 168, 168))))
        );
        createViewLayout.setVerticalGroup(
            createViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createViewLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(storeName1)
                .addGap(40, 40, 40)
                .addComponent(loginText1)
                .addGap(24, 24, 24)
                .addGroup(createViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(36, 36, 36)
                .addComponent(createAccountButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bottonTxt1)
                    .addComponent(loginViewButton))
                .addContainerGap(175, Short.MAX_VALUE))
        );

        main.add(createView, "createView");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitButtonMouseClicked
        // TODO add your handling code here:
        this.authorization();
    }//GEN-LAST:event_submitButtonMouseClicked

    private void createUserLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createUserLinkMouseClicked
        // TODO add your handling code here:
        changePainel(main, "createView");
    }//GEN-LAST:event_createUserLinkMouseClicked

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void loginViewButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginViewButtonMouseClicked
        // TODO add your handling code here:
        changePainel(main, "loginView");
    }//GEN-LAST:event_loginViewButtonMouseClicked

    private void createAccountButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccountButtonMouseClicked
        // TODO add your handling code here:
        application.createAccount(username.getText(), password.getText());
    }//GEN-LAST:event_createAccountButtonMouseClicked

    protected void changePainel(JPanel card, String cardName) {
        CardLayout path = (CardLayout) card.getLayout();
        path.show(card, cardName);
    }

    private LoginStruct getEntryUser() {
        String user = usernameField.getText();
        String password = passwordField.getText();
        LoginStruct struct;

        struct = new LoginStruct() {
            @Override
            public String username() {
                return user;
            }

            @Override
            public String password() {
                return password;
            }

        };
        return struct;
    }

    public void authorization() {
        application.init();
        LoginStruct logged = this.getEntryUser();

        Account currentUser = application.findUser(logged.username(), logged.password());

        if (currentUser != null) {
            this.dispose();
            this.errorLabel.setText(" ");
            application.store(currentUser);
        } else {
            this.errorLabel.setText("Usuário Inválido!");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bottonTxt;
    private javax.swing.JLabel bottonTxt1;
    private javax.swing.JButton createAccountButton;
    private javax.swing.JLabel createUserLink;
    private javax.swing.JPanel createView;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JCheckBox keepOnline;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JLabel loginText;
    private javax.swing.JLabel loginText1;
    private javax.swing.JPanel loginView;
    private javax.swing.JLabel loginViewButton;
    private javax.swing.JPanel main;
    private javax.swing.JTextField password;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel storeName;
    private javax.swing.JLabel storeName1;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField username;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
