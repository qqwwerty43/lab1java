package com.company;

public class Palindrome {
    //Метод вывода результата на экран
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            if (isPalindrome(s)) {
                System.out.println(s + " is palindrome");
            } else {
                System.out.println(s + " is not palindrome");
            }
        }
    }

    //Метод, возвращающий перевёрнутую строку
    public static String reverseString(String strings) {
        String temp = "";
        for (int i = 1; i <= strings.length(); i++) {
            temp += strings.charAt(strings.length() - i);
        }
        return (temp);
    }
    //Метод, непосредственно проверяющий строку на палиндром
    public static boolean isPalindrome(String s) {
        String rev = reverseString(s);
        return s.equals(rev);
    }
}