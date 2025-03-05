package com.bridgelabz.generics.levelone;

import java.util.ArrayList;

public class SmartWarehouseManagementSystem {
    public static void main(String[] args) {
        Electronics laptop = new Electronics("MacBook");
        Groceries milk = new Groceries("Amul");
        Furniture table = new Furniture("Nilkamal");

        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();


        electronicsStorage.addItem(laptop);
        groceriesStorage.addItem(milk);
        furnitureStorage.addItem(table);


        Warehouse.displayItems(electronicsStorage.getItems());
        Warehouse.displayItems(groceriesStorage.getItems());
        Warehouse.displayItems(furnitureStorage.getItems());

    }
}

abstract class WarehouseItem{
    private String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


class Electronics extends WarehouseItem {
    public Electronics(String name) {
        super(name);
    }
}

class Groceries extends WarehouseItem {
    public Groceries(String name) {
        super(name);
    }
}

class Furniture extends WarehouseItem {
    public Furniture(String name) {
        super(name);
    }
}

class Storage<T extends WarehouseItem>{
    ArrayList<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public ArrayList<T> getItems() {
        return items;
    }
}

class Warehouse{
    public static void displayItems(ArrayList<? extends WarehouseItem> arr) {
        for(WarehouseItem item : arr){
            System.out.println(item.getName());
        }
    }
}

