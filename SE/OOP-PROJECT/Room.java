package com.mycompany.hotel;

public abstract class Room {
    protected int roomNumber;
    protected double price;

    public Room(int roomNumber, double price) {
        this.roomNumber = roomNumber;
        this.price = price;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getPrice() {
        return price;
    }

    public abstract String getRoomType();
}