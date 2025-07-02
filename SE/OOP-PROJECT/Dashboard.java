package com.mycompany.hotel;

import javax.swing.*;

public class Dashboard extends JFrame {
    public Dashboard() {
        setTitle("Hotel Reservation System");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JButton addBtn = new JButton("Add Reservation");
        JButton viewBtn = new JButton("View Reservations");

        addBtn.setBounds(100, 70, 200, 40);
        viewBtn.setBounds(100, 130, 200, 40);

        add(addBtn);
        add(viewBtn);

        addBtn.addActionListener(e -> new AddReservationForm());
        viewBtn.addActionListener(e -> new ViewReservations());

        setVisible(true);
    }
}