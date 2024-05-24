package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Box {
    private String from;
    private String material;
    private String color;
    private MaxLiftingCapacity maxLiftingCapacity;
    private Cargo cargo;
    private LocalDateTime deliveryDate;

    public Box(String from, String material, String color, MaxLiftingCapacity maxLiftingCapacity, Cargo cargo, LocalDateTime deliveryDate) {
        this.from = from;
        this.material = material;
        this.color = color;
        this.maxLiftingCapacity = maxLiftingCapacity;
        this.cargo = cargo;
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return "Box{" +
                "from='" + from + '\'' +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", maxLiftingCapacity=" + maxLiftingCapacity +
                ", cargo=" + cargo +
                ", deliveryDate=" + deliveryDate +
                '}';
    }

    public static class MaxLiftingCapacity {
        private String unit;
        private int value;

        public MaxLiftingCapacity(String unit, int value) {
            this.unit = unit;
            this.value = value;
        }

        @Override
        public String toString() {
            return "MaxLiftingCapacity{" +
                    "unit='" + unit + '\'' +
                    ", value=" + value +
                    '}';
        }
    }

    public static class Cargo {
        private String name;
        private String className;

        public Cargo(String name, String className) {
            this.name = name;
            this.className = className;
        }

        @Override
        public String toString() {
            return "Cargo{" +
                    "name='" + name + '\'' +
                    ", className='" + className + '\'' +
                    '}';
        }
    }
}
