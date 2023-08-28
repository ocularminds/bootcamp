package ORDERINGAPP;

import java.sql.Date;

public class Order {
    String costumerId;
    int orderQuntity;
    Date date;
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
