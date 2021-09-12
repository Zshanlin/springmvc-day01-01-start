package com.aaa.domain;

import java.io.Serializable;

public class Account implements Serializable {
    private String username;
    private Integer id;
    private Double money;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", id=" + id +
                ", money=" + money +
                '}';
    }
}
