package com.mycompany.pizzapracproject1;

public class main 
{
    public static void main(String[] args) 
    {
        //System.out.println("I am in main");
        Cart cart = new Cart();
        Connection conn = new Connection(cart);
        Input i = new Input(conn, cart);
        system.out.println("i made changes")
    }
}
