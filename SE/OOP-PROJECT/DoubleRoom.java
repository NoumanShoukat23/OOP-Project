package com.mycompany.hotel;

public class DoubleRoom extends Room {
    public DoubleRoom(int roomNumber, double price) {
        super(roomNumber, price);
    }

    public String getRoomType() {
        return "Double";
    }
}