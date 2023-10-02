package com.example.coffeeshop;

public class Coffee {
    private String name;
    private String desc;
    private double price;
    private int imageID;

    public static final  Coffee[] coffee={
            new Coffee("Latte", " this is small coffee",2.50, R.drawable.cofee1),
            new Coffee("Latte2", " this is a med coffee",3.50, R.drawable.cofee1),
            new Coffee("Latte3", " this is a Large Coffee",4.50, R.drawable.cofee1)
    };

    public Coffee(String latte,String desc,  double price, int imageID) {
        this.name =name;
        this.desc = desc;
        this.price = price;
        this.imageID = imageID;
    }
    public String getName()
    {
        return name;
    }
    public String getDesc(){
        return desc;
    }
    public double getPrice(){
        return price;
    }

    public int getImageID(){
        return imageID;
    }

    public String ToString(){
        return name;
    }
}
