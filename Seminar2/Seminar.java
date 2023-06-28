// package Seminar2;

// // import java.io.File;
// // import java.io.FileWriter;
// // import java.io.IOException;
// // import java.util.logging.FileHandler;
// // import java.util.logging.Logger;
// // import java.util.logging.SimpleFormatter;

// public class Seminar {
// public static void main(String[] args) {
// // System.out.println(longStringBuilding(11, "a", "b"));
// }

// static String longStringBuilding(int n, char c1, char c2) {
// // Task 1.
// // Дано четное число N (>0) и символы c1 и c2.
// // Написать метод, который вернет строку длины N,
// // которая состоит из чередующихся символов c1 и c2, начиная с c1.
// StringBuilder newStr = new StringBuilder();
// for (int i = 0; i < n / 2; i++) {
// newStr.append(c1);
// newStr.append(c2);
// }
// return newStr.toString();
// }

// static String stringCompress(String str){
// Task 2.
// Напишите метод, который сжимает строку.
// Пример: вход aaaabbbcdd.
// Результат - a4b3cd2 для примера.
// StringBuilder newSt = new StringBuilder();
// char symbol = str.charAt(0);
// StringBuilder newStr;
// newStr.append(symbol);
// int cout = 0;

// for(char letter: str.toCharArray()){
// int count;
// if(letter == symbol) count++;
// else{
// if(count != 1)newStr.append(count);
// newStr.append(letter);
// symbol = letter;
// count = 1;
// }

// }
// if (count != 1) newStr.append(count);

// return newStr.toString();

// }
// }

// Task 3.
// Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает boolean значение).
// class Main {
// public static boolean isPalindrome(String str) {
// if (str == null) {
// return false;
// }

// for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
// if (str.charAt(i) != str.charAt(j)) {
// return false;
// }
// }

// return true;
// }
// }
// }