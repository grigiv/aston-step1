package ru.astondevs.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Lesson1 {
    public static void main(String[] args) {

    }

    // Перевернуть строку и вывести на консоль
    //  String string = "I love Java";
    public static void turnString(String string) {
        char[] charArray = string.toCharArray();
        char[] reversedCharArray = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            reversedCharArray[i] = charArray[charArray.length - 1 - i];
        }
        System.out.println(reversedCharArray);
    }

    // int[] ints = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};
    // Удалить дубликаты из массива и вывести в консоль
    public static void getDistinctNumbers(int[] ints) {
        List<Integer> distinctNumbers = new ArrayList<Integer>();
        for (int i = 0; i < ints.length; i++) {
            boolean isDistinct = true;
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[i] == ints[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                distinctNumbers.add(ints[i]);
            }
        }
        System.out.println(distinctNumbers);
    }

    // Дан массив, заполненный уникальными значениями типа int.
    // int[] arr = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
    // Необходимо найти элемент, который меньше максимума, но больше всех остальных.
    public static Integer findSecondMaxElement(int[] arr) {
        int max = arr[0];
        int secondMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
        }
        return secondMax;
    }

    // Найти длину последнего слова в строке. В строке только буквы и пробелы.
    // "Hello world" - 5
    // "    fly me    to the moon    " - 4
    public static Integer lengthOfLastWord(String string) {
        int count = 0;
        int maxLength = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ' && ((i + 1) < (string.length()- 1)) && Character.isLetter(string.charAt(i+1))) {
                if (maxLength < count) {
                    maxLength = count;
                }
                count = 0;
            }
            else if (Character.isLetter(string.charAt(i))) {
                count++;
            }
        }
        if (maxLength < count) {
            maxLength = count;
        }
        return maxLength;
    }

    // Определить, что строка является палиндромом
    // Сложность по памяти O(1), не создавать новые String, StringBuilder
    // Примеры:
    // abc - false
    // 112233 - false
    // aba - true
    // 112211 - true
    public static boolean isPalindrome(String string) {
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}