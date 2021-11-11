package com.mycompany.pizzapracproject1;

public class Order 
{
    private Cart cart;
    private CustomerData d;

    Order(){}
    
    public void setOrder(Cart c, CustomerData d)
    {
        this.cart = c;
        this.d = d;
    }

    public CustomerData getCustomerData()
    {
        return this.d;
    }
    public Cart getCart()
    {
        return this.cart;
    }
}
