package com.mycompany.hotel;

public class SingleRoom extends Room {
    public SingleRoom(int roomNumber, double price) {
        super(roomNumber, price);
    }

    public String getRoomType() {
        return "Single";
    }
}