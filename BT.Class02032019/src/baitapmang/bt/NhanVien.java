/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapmang.bt;
/**
 *
 * @author huong.dang
 */import java.util.Scanner;

public class NhanVien {
    private String ten;
    private String diachi;
    private int tuoi, giolam;
    private double tienluong,tienthuong;
    
   private  Scanner sc = new Scanner(System.in);
//public static void main(String[] args) {
        
    public NhanVien(String ten, String diachi, int tuoi, int giolam, double tienluong) {
        this.ten = ten;
        this.diachi = diachi;
        this.tuoi = tuoi;
        this.giolam = giolam;
        this.tienluong = tienluong;
    }

    public NhanVien() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getGiolam() {
        return giolam;
    }

    public void setGiolam(int giolam) {
        this.giolam = giolam;
    }

    public double getTienluong() {
        return tienluong;
    }

    public void setTienluong(double tienluong) {
        this.tienluong = tienluong;
    }
     public void inputinfo() {
        System.out.print("Nhập ten nhan vien: ");
        ten = sc.nextLine();
        System.out.print("Nhập diachi nhân viên: ");
        diachi = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi = sc.nextInt();
        System.out.print("Nhập gio lam: ");
        giolam = sc.nextInt();
        System.out.print("Nhập luong: ");
        tienluong = sc.nextFloat();
    
}
       public void printinfo() {
        System.out.print("Ten nhan vien : "+ten+":");
        System.out.print("Diachi nhân viên: "+diachi+":");
        System.out.print("Tuoi nhan vien: "+tuoi+":");
        System.out.print("Gio lam: "+giolam+":");
        System.out.print("Tien luong: "+tienluong+":");
        
}
       public double gettienthuong(double tienthuong){
           if(giolam <100){
               tienthuong=0;}
               else;{
           if(giolam >= 100 && giolam < 200){
               tienthuong=(tienluong*10)/100;}
           else;{
                   tienthuong=(tienluong*20)/100;
           }   
           }
       }

       public void tinhThuong(){
            System.out.println("Tien thuong nhan vien la"+tienthuong+":");
}
       public static void main(String[] args ){
     NhanVien nv = new NhanVien();
     nv.inputinfo();
     nv.printinfo();
       System.out.println("Tien thuong cua nhan vien :"+nv.getTen()+" la: "+nv.gettienthuong(nv.getTienluong()));
       }
} 

//


