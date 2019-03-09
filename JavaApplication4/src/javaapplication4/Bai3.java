package javaapplication4;



import java.util.Scanner;



public class Bai3 {


    public static void main(String[] args) {
        int[] A = new int[5];
   
         Scanner input = new Scanner(System.in);
         for (int i = 0; i < 5; i++) {

           System.out.println("Nhap vao phan tu thu "  +i+":");
            A[i] = input.nextInt();   
        }
         //in ra mang
             System.out.println("\nMảng ban đầu: ");
             for (int i = 0; i < 5; i++) {
        System.out.print(A[i] + "\t");
    }
    System.out.println("Nhập số nguyên k cần tìm: ");
    int k;
    k =input.nextInt();
   int i =0;
    while ((i<5)&&(A[i]!=k)){
        i++;
    }
    if (A[i]-k==0){
        System.out.println("Vi tri cua k la" +i+":");
        }
       else;
    }
    }
    

    

