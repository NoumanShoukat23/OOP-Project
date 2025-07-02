package com.mycompany.hotel;

import java.io.*;
import java.util.*;

public class ReservationManager {
    private static final String FILE_NAME = "reservations.txt";

    public static void saveReservation(Customer customer) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(customer.getDetails());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static List<String[]> loadReservations() {
        List<String[]> reservations = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                reservations.add(line.split(","));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return reservations;
    }
}