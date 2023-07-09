package com.dreamTank.mhl.domain;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * javabean 和 employee 对应
 * +---------------+-------------+------+-----+---------+----------------+
 * | Field         | Type        | Null | Key | Default | Extra          |
 * +---------------+-------------+------+-----+---------+----------------+
 * | id            | int         | NO   | PRI | NULL    | auto_increment |
 * | billId        | varchar(50) | NO   |     |         |                |
 * | menuId        | int         | NO   |     | 0       |                |
 * | nums          | int         | NO   |     | 0       |                |
 * | money         | double      | NO   |     | 0       |                |
 * | diningTableId | int         | NO   |     | 0       |                |
 * | billDate      | datetime    | NO   |     | NULL    |                |
 * | state         | varchar(50) | NO   |     |         |                |
 */
public class Bill {
    private Integer id;
    private String billId;
    private Integer menuId;
    private Integer nums;
    private double money;
    private Integer diningTableId;
    private LocalDateTime billDate;
    private String state;

    public Bill() {
    }

    public Bill(Integer id, String billId, Integer menuId, Integer nums, double money, Integer diningTableId, LocalDateTime billDate, String state) {
        this.id = id;
        this.billId = billId;
        this.menuId = menuId;
        this.nums = nums;
        this.money = money;
        this.diningTableId = diningTableId;
        this.billDate = billDate;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getNums() {
        return nums;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Integer getDiningTableId() {
        return diningTableId;
    }

    public void setDiningTableId(Integer diningTableId) {
        this.diningTableId = diningTableId;
    }

    public  LocalDateTime getBillDate() {
        return billDate;
    }

    public void setBillDate(LocalDateTime billDate) {
        this.billDate = billDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return id +
                "\t\t" + menuId +
                "\t\t\t" + nums +
                "\t\t\t" + money +
                "\t" + diningTableId +
                "\t\t" + billDate +
                "\t\t\t" + state;
    }
}
