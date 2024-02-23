/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
        public int inputInt(String msg) {//Nhập một số thực từ bàn phím.
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        while (true) {
            int rs = sc.nextInt();
            if (rs < 0) {
                System.out.println("Invalid type. Please enter again!!");
                continue;
            }
            return rs;
        }
    }
  

    private int getPositiveDecimalInput() {// Nhập một số nguyên dương từ bàn phím.
        while (true) {
            int num = inputInt("Enter a positive decimal number: ");
            if (num >= 0) {
                return  num;
            } else {
                System.out.println("Please enter a positive decimal number.");
            }
        }
    }
    private int[] generateRandomArray(int numElements) {//tao mang ngau nhien
        Random random = new Random();
        int[] array = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            array[i] = random.nextInt(100); // Generate random integer in the range [0, 99]
        }
        return array;
    } 
       
    public void Binary() {//Tạo một mảng ngẫu nhiên và thực hiện tìm kiếm nhị phân.
        int numElements = getPositiveDecimalInput();
        int[] arrayToSearch = generateRandomArray(numElements);

        System.out.println("Array to Search: ");
        displayArray(arrayToSearch);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value to search: ");
        int target = scanner.nextInt();

        int result = binarySearch(arrayToSearch, target);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
        private void displayArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }




    public static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr);
        
        int left = 0;
        int right = arr.length - 1;
        

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }


}

