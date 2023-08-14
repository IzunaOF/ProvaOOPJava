/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.izuna.learning;

public class Account {

    private final String ID;
    private String ownerName;
    private String numberAccount;
    private Double balance;

    public Account(String id, String ownerName, String numberAccount) {
        this.ID = id;
        this.ownerName = ownerName;
        this.numberAccount = numberAccount;
        this.balance = 0.0;
    }

    public String getUserID() {
        return this.ID;
    }

    public String getOwnerAccount() {
        return this.ownerName;
    }

    public String getNumberAccount() {
        return this.numberAccount;
    }

    public Double getBalance() {
        return this.balance;
    }

    public void deposit(Double value) {
        this.setBalance(value);
    }

    public Boolean withdraw(Double value) {
        if (value > this.balance) {
            return false;
        }
        this.setBalance(-value);
        return true;
    }

    protected void setBalance(Double value) {
        this.balance += value;
    }
}
