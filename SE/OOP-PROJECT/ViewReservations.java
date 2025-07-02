package com.mycompany.hotel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class ViewReservations extends JFrame {
    public ViewReservations() {
        setTitle("View Reservations");
        setSize(600, 400);
        setLocationRelativeTo(null);

        String[] cols = {"Name", "Contact", "Room Type", "Check-In", "Check-Out"};
        DefaultTableModel model = new DefaultTableModel(cols, 0);
        JTable table = new JTable(model);
        JScrollPane scroll = new JScrollPane(table);
        add(scroll);

        List<String[]> reservations = ReservationManager.loadReservations();
        for (String[] res : reservations) {
            model.addRow(res);
        }

        setVisible(true);
    }
}