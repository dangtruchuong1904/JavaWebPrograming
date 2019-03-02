
package javaapplication4;

import java.util.Scanner;


public class Bai1 {


    public static void main(String[] args) {
        int[] A = new int[5];
        int tong =0;
        int tongle =0;
        int tongchan =0; 
         Scanner input = new Scanner(System.in);
         for (int i = 0; i < 5; i++) {

           System.out.println("Nhap vao phan tu thu "  +i+":");
           
            A[i] = input.nextInt();   
            tong = A[i]+tong;
        }
         //in ra mang
             System.out.println("\nMảng ban đầu: ");
    for (int i = 0; i < 5; i++) {
        System.out.print(A[i] + "\t");
    }
       //tinh tong cac phan tu trong mang
        System.out.println("\nTong cac phan tu trong mang la"  + tong +"\t");
        
        
       //tinh tong cac phan tu le
       for (int i =0;i < 5; i++){
           if (A[i]%2 !=0){
               tongle = A[i] +tongle;
               System.out.println("\nTong cac phan tu le trong mang la"  + tongle +"\t");
           
        //tinh tong cac phan tu chan
           } else {
               tongchan = A[i] +tongchan;
               System.out.println("\nTong cac phan tu chan trong mang la"  + tongchan +"\t");
               }                
       }
                     
}
}
        
    
    

