
package javaapplication4;

import java.util.Scanner;


public class Bai2 {


    public static void main(String[] args) {
        int[] A = new int[5];
        int max =0;
        int min =0; 
        int x;
         Scanner input = new Scanner(System.in);
         for (int i = 0; i < 5; i++){

           System.out.println("Nhap vao phan tu thu "  +i+":");
            A[i] = input.nextInt();
            
            if (i==0){
                max =A[i];}
            else{
                if (A[i]> max){
                    max = A[i];}
                }
         }
                 System.out.println("\nPhan tu lon nhat cua mang la: " +max+":");
         
         for (int i = 0; i < 5; i++) {
         
            
            if (i==0){
            min =A[i];}
            else{
            if (A[i]< min){
            min = A[i];} 
         }
         }
            System.out.println("\nPhan tu nho nhat cua mang la: " +min+":");
             for (int i = 0; i < 5; i++) {
         
            if (A[i]%3==0){
            x =A[i];
            System.out.println("\nPhan tu chia het cho 3 cua mang la: " +x+":");}
            
         }
         }
            
    
}


                 


    
    