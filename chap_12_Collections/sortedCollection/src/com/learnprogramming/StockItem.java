package com.learnprogramming;

public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantityStock = 0;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0;
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int quantityInStock() {
        return quantityStock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void adjustStock(int quantity) {
        int newQuentity = this.quantityStock + quantity;
        if (newQuentity >= 0) {
            this.quantityStock = newQuentity;
        }
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("calling .equals method");
        if (this == obj) {
            return true;
        }

        if((obj == null) || (this.getClass() == obj.getClass())) {
            return false;
        }

        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    @Override
    public int compareTo(StockItem o) {
        System.out.println("calling  .compareTo metohd");
        if(this == o) {
            return 0;
        }

        if ( o != null) {
            return this.name.compareTo(o.getName());
        }

        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + " : price " + this.price;
    }


}
