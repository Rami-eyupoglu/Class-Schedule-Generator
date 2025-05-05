/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dersprogramiolusturma;

/**
 *
 * @author Casper
 */
public class GenericMethodExample {

    public static <T> void printArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        // We call the array by referance like (Integer , Double , String)
        Integer[] intArray = {1, 2, 3, 4, 5};
        printArray(intArray);

        Double[] doubleArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        printArray(doubleArray);

        String[] stringArray = {"a", "b", "c", "d", "e"};
        printArray(stringArray);
    }
}
