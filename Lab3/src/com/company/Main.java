package com.company;
import java.util.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {
        // C3 = 1 - StringBuilder
        // C17 = 5 - надрукувати слова без повторень заданого тексту в алфавітному порядку за першою літерою

        System.out.print("Введіть текст: ");
        Scanner consoleInput = new Scanner(System.in);
        StringBuilder buildedString = new StringBuilder();
        buildedString.append(consoleInput.nextLine());

        System.out.println("Сорутємо даний текст в алфавітному порядку з унікальними словами...");
        String normalString = buildedString.toString();
        normalString = Arrays.stream(normalString.split("[()-,;:.!?\\s]+")).distinct().collect(Collectors.joining(" "));
        String[] wordsOfStringArray = normalString.split(" ");

        int numberOfWords = wordsOfStringArray.length;
        String temporaryString;
        for (int i = 0; i < numberOfWords; i++) {
            for (int j = i + 1; j < numberOfWords; j++) {
                if (wordsOfStringArray[i].compareToIgnoreCase(wordsOfStringArray[j]) > 0) {
                    temporaryString = wordsOfStringArray[i];
                    wordsOfStringArray[i] = wordsOfStringArray[j];
                    wordsOfStringArray[j] = temporaryString;
                }
            }
        }

        System.out.print("Результат: ");

        for (int i = 0; i <= numberOfWords - 1; i++) {
            System.out.print(wordsOfStringArray[i] + " ");
        }
    }
}