package com.liudz1;

import sun.font.TrueTypeFont;

public class Phone {

    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private double price;
    private int year;

    public Phone(String brand, double price, int year) {
        this.brand = brand;
        this.price = price;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }

    public boolean equals(Object obj) {
        //将obj转为Phone类型
        //instanceof 判断对象是否属于类
        if (obj instanceof Phone) {
            Phone other = (Phone) obj;
            if (this.getBrand() == other.getBrand()) {
                return true;
            }
        }
        return false;
    }
}
