package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        System.out.println(checkForPalindrome("iki"));

    }

    public static boolean checkForPalindrome(String name) {
        String cleanName = name.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Tersten bir kopyasını oluştur
        String reversed = new StringBuilder(cleanName).reverse().toString();

        // İki stringi karşılaştır
        return cleanName.equals(reversed);

    }
    public static String convertDecimalToBinary(int number) {
        String binary = "";
        while(number>0) {
            int i = number % 2;
            binary = String.valueOf(i) + binary;
            number = number/2;
        }

        return binary;
    }
}