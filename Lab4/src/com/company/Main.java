package com.company;
import java.util.*;
public class Main {
    // C11 = 9 - визначити клас "Морський човен", який складається як мінімум з 5 полів

    static class Ship {
        String name;
        String type;
        String color;
        int model;
        int lenght;

        Ship(String name, String type, String color, int model, int lenght) {
            this.name = name;
            this.type = type;
            this.color = color;
            this.model = model;
            this.lenght = lenght;
        }
    }

    static class SortByName implements Comparator<Ship> {
        @Override
        public int compare(Ship firstShip, Ship secondShip) {
            int comparenames = firstShip.name.compareToIgnoreCase(secondShip.name);

            if (comparenames == 0) {
                return firstShip.type.compareToIgnoreCase(secondShip.type);
            }

            return comparenames;
        }
    }

    static class SortByModel implements Comparator<Ship> {
        @Override
        public int compare(Ship firstShip, Ship secondShip) {
            return secondShip.model - firstShip.model;
        }
    }

    public static void main(String[] args) {
        Ship[] arrayOfShips = new Ship[4];

        arrayOfShips[0] = new Ship("Mamba", "Cruiser", "Black", 4785, 250);
        arrayOfShips[1] = new Ship("Matilda", "Cruiser", "White", 2283, 225);
        arrayOfShips[2] = new Ship("Ivan", "AircraftCarrier", "Grey", 1987, 332);
        arrayOfShips[3] = new Ship("Rose", "Frigate", "Blue", 3569, 198);

        Arrays.sort(arrayOfShips, new SortByName());
        System.out.println("Array of ships sorted by name:\n");
        System.out.printf("%-13s%-14s%-31s%-13s%-6s%-8s\n", "Name:", "Type:", "Color:", "Model:", "Lenght:");

        for (Ship ship: arrayOfShips) {
            System.out.printf("%-13s%-14s%-31s%-13s%-6s%-8s\n", ship.name, ship.type, ship.color, ship.model, ship.lenght);
        }

        Arrays.sort(arrayOfShips, new SortByModel());

        System.out.println("\nArray of ships sorted by model:\n");
        System.out.printf("%-13s%-14s%-31s%-13s%-6s%-8s\n", "Name:", "Type:", "Color:", "Model:", "Lenght:");

        for (Ship ship: arrayOfShips) {
            System.out.printf("%-13s%-14s%-31s%-13s%-6s%-8s\n", ship.name, ship.type, ship.color, ship.model, ship.lenght);
        }
    }
}
