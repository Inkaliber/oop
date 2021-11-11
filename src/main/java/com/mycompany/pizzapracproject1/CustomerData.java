package com.mycompany.pizzapracproject1;

public class CustomerData 
{
    private String name;
    private String phoneNumber;
    private String cardNumber;
    
    CustomerData(String name, String phoneNumber, String cardNumber)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.cardNumber = cardNumber;
    }
    CustomerData(){}
    public String getName()
    {
        return this.name;
    }
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
    public String getCardNumber()
    {
        return this.cardNumber;
    }
    
    public String getAllinfo()
    {
        String info = "";
        info = info + this.name + " " + this.phoneNumber + " " + this.cardNumber;
        return info;
    }
}
