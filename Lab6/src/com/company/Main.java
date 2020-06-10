package com.company;

public class Main {
    public static void main(String[] args) {
        //ініціалізація
        Vegetable tomato = new Vegetable("Помідор", 19);
        Vegetable cucumber = new Vegetable("Огірок", 15);
        Vegetable onion = new Vegetable("Цибуля", 30);
        Vegetable cabbage = new Vegetable("Капуста", 29);
        Vegetable carrot = new Vegetable("Морква", 31);
        Vegetable corn = new Vegetable("Кукурудза", 97);

        Salad salad = new Salad(tomato, cucumber, onion,
                cabbage, carrot);
        Salad_methods operations = new Salad_methods();

        //операції над салатом
        salad.print();
        operations.by_nutrition_sort(salad);
        operations.total_nutrition(salad);
        operations.find_by_nutrition(salad,20,45);
    }
}