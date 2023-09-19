package ORDERAPP;

import java.sql.Date;
import java.util.List;

public class Order {
    private Customer customer;
    private List<Item> items;
    private Date date;
    private Integer orderQuantity;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List items) {
        this.items = items;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
