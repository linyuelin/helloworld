package com.dreaMTank.dao_.domain;

import java.util.Date;

public class actor {
    private Integer id ;
    private String name;
    private String sex;
    private Date  date;
    private String phone;

    public actor() {
    }

    public actor(Integer id, String name, String sex, Date date, String phone) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "actor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", date=" + date +
                ", phone='" + phone + '\'' +
                '}';
    }
}
