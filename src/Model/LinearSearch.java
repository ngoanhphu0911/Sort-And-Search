package Model;

import java.util.Random;
import java.util.Scanner;
//Nguyên lý: Linear Search (tìm kiếm tuyến tính) là một phương pháp tìm kiếm
//duyệt từng phần tử một trong một danh sách hoặc mảng để tìm kiếm giá trị cụ thể.

public class LinearSearch {
       public void Linear() { //tao mang ngau nhien +tim kiem linearSearch

            int numElements = getPositiveDecimalInput();
            int[] arrayToSearch = generateRandomArray(numElements);

            System.out.println("Array to Search: ");
            displayArray(arrayToSearch);

            
            System.out.println("Number of Index: " + linearSearch(arrayToSearch));
        
    }
    
    
    private int getPositiveDecimalInput() {//nhap so nguyen duong tu ban phim
        while (true) {   
            double num = inputDouble("Enter a positive decimal number: ");
                if (num >= 0) {
                    return (int) num;
                } else {
                    System.out.println("Please enter a positive decimal number.");
                }
        }
    }

    private int[] generateRandomArray(int numElements) {//tao mang ngau nhien co do dai la numElements
        Random random = new Random();
        int[] array = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            array[i] = random.nextInt(10); // Generate random integer in the range [0, 100)
        }
        return array;
    }
    
    public Double inputDouble(String msg) { //nhap mot so thuc tu ban phim
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        while (true) {
            double rs = sc.nextDouble();
            if (rs < 0) {
                System.out.println("Invalid type. Please enter again!!");
                continue;
            }
            return rs;
        }
    }
    
    public int linearSearch(int[] arr){ 
        int count = 0;
        int n = arr.length;
        double value = inputDouble("Enter a value to search: ");
        for(int i = 0; i < n; i++){
            if(arr[i]==value)
                count++;      
        }
        return count;
    }
    
     
    private void displayArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

}
