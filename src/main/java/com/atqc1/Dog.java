package com.atqc1;

public class Dog extends Pet{

    private String size;

    Dog(String price, String size) {
        super(price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size){
        this.size = size;
    }

    public void petSound(){
        System.out.println("Gav-gav!");
    }

}
