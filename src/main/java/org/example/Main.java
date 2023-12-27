package org.example;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Gift gift = new Gift();
            gift.addSweet(new Candy("Raffaello", 0.05, 30, "Coconut", false));
            gift.addSweet(new ChocolateBar("Milka", 0.1, 40, "Milk", false));
            gift.addSweet(new Candy("Lemon Drop", 0.02, 0, "Lemon", true));
            gift.addSweet(new ChocolateBar("Dark Delight", 0.1, 85, "dark", false));
            gift.addSweet(new GummyCandy("Green Gummy Bears", 0.05, 0, "Bears", "Green"));

            System.out.println("Загальна вага подарунка: " + gift.calculateTotalWeight());

            gift.sortByWeight();

            List<Sweet> chocolates = gift.findCandyWithChocolateContent(20, 50);
            for (Sweet s : chocolates) {
                System.out.println("Цукерки з шоколадним вмістом: " + s.getName());
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Сталася неочікувана помилка: " + e.getMessage());
        }
    }
}
