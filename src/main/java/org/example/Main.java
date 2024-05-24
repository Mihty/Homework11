package org.example;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        String from = "China";
        String material = "steel";
        String color = "black";
        Box.MaxLiftingCapacity maxLiftingCapacity = new Box.MaxLiftingCapacity("kg", 150);
        Box.Cargo cargo = new Box.Cargo("electronics", "C-1");
        LocalDateTime deliveryDate = LocalDateTime.parse("2021-09-20T11:07:00", DateTimeFormatter.ISO_DATE_TIME);

        Box box = new Box(from, material, color, maxLiftingCapacity, cargo, deliveryDate);

        System.out.println(box);
    }
}
