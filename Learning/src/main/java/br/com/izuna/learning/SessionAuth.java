/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.izuna.learning;

public class SessionAuth {
    public Account currentUser;
    public SessionAuth(Account user){
        this.currentUser = user;
    }
    public String getCurrentUser(){
        return this.currentUser.getUserID();
    }
}
