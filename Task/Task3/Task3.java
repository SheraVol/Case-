package org.example;

import java.util.Scanner;

public class Task3 {
    //Осело колесо, Шалаш, Искать такси
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String str = scanner.nextLine();

        boolean isPalindrome = Palindrome(str);
        if (isPalindrome) {
            System.out.println(str + " Является палиндромом");
        } else {
            System.out.println(str + " Не палиндром");
        }
    }

    public static boolean Palindrome(String str) {
        // Удаляем пробелы и переводим все символы в нижний регистр
        str = str.replaceAll("\\s+", "").toLowerCase();

       
        if (str.length() < 2) {
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        return Palindrome(str.substring(1, str.length() - 1));

    }


}
