package org.example.Interface;

enum Enumm2 {
    Macbook(2000) , Acer(2200) , XPS(2300) ,Surface(1000) ;
private int price;
   private Enumm2(int price) {
       this.price = price;

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
