package com.example.Bank.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Bank")
public class Bank {
    @Id
    @GeneratedValue

    private int id;
    private String name;
    private String acc_no;
    private String balance;

    public Bank() {

    }

    public Bank(String name, String acc_no, String balance) {
        this.id = id;
        this.name = name;
        this.acc_no = acc_no;
        this.balance = balance;
    }

    public Bank(int id, String name, String acc_no, String balance) {
        this.id = id;
        this.name = name;
        this.acc_no = acc_no;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(String acc_no) {
        this.acc_no = acc_no;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}




