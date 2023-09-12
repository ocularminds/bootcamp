package ORDERAPP;

import java.sql.Date;

public class Order {
    private String costumerId;
    private int orderQuntity;
    private Date date;
    private Integer orderQuantity;

    public String getCustomerId() {
        return costumerId;
    }

    public void setCustomerId(String customerId) {
        this.costumerId = customerId;
    }

    public Integer getOrderQuantity() {
        return getOrderQuantity();
    }

    public void setOrderQuantity(Integer orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
