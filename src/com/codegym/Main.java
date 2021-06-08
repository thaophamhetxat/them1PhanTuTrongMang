package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước.
	int []arr = {1,2,3,4,5,6,7,0,0,0};
        System.out.println("show arr: ");
        for(int i=0;i<arr.length;i++){
            System.out.printf(arr[i]+"\t");
            System.out.println("[" +i+"]");
        }
// Nhập X là số cần chèn
        int number;
        int position;
        int newArr = arr.length;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n"+"enter number add: ");
        number = scanner.nextInt();
        System.out.println("\n"+"enter position add: ");
        position = scanner.nextInt();


        if(position<=1 || position>=arr.length-1){
            System.out.println("position no in arr");
        }else {
            for(int i = arr.length -1; i > position ;i--){
                arr[i] = arr[i - 1];
            }
            arr[position] = number;
        }

        System.out.printf("newArr: ");
        for(int i=0;i<newArr;i++){
            System.out.printf(arr[i]+"\t");
        }

    }


}
