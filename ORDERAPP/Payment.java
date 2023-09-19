package ORDERAPP;

public class Payment {
    private Customer customer;
    private Order order;
    private int amount;
    

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

     public Order getOrder() {
        return order;
    }

    public void setOder(Order order) {
        this.order = order;
    }    

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

}
