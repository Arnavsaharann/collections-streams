package com.bridgelabz.generics.levelone;

import java.util.ArrayList;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void applyDiscount(double percentage) {
        this.price -= this.price * (percentage / 100);
    }
}

class Book extends Product {
    Book(String name, double price) {
        super(name, price);
    }
}

class Clothing extends Product {
    Clothing(String name, double price) {
        super(name, price);
    }
}

class Gadget extends Product {
    Gadget(String name, double price) {
        super(name, price);
    }
}

class ProductCatalog<T extends Product> {
    private ArrayList<T> products = new ArrayList<>();

    void addProduct(T product) {
        products.add(product);
    }

    void applyDiscount(double percentage) {
        for (T product : products) {
            product.applyDiscount(percentage);
        }
    }

    void applyDiscountToProduct(T product, double percentage) {
        product.applyDiscount(percentage);
    }

    void displayProducts() {
        for (T product : products) {
            System.out.println(product.name + " - $" + product.price);
        }
    }
}

public class Marketplace {
    public static void main(String[] args) {
        ProductCatalog<Book> bookCatalog = new ProductCatalog<>();
        ProductCatalog<Clothing> clothingCatalog = new ProductCatalog<>();

        Book book1 = new Book("Angles & Demons", 40);
        Clothing shirt = new Clothing("shirt", 20);

        bookCatalog.addProduct(book1);
        clothingCatalog.addProduct(shirt);

        System.out.println("Before Discount:");
        bookCatalog.displayProducts();
        clothingCatalog.displayProducts();

        System.out.println("---------------------");

        bookCatalog.applyDiscount(10);
        clothingCatalog.applyDiscount(15);

        System.out.println("After Discount:");
        bookCatalog.displayProducts();
        clothingCatalog.displayProducts();
    }
}
