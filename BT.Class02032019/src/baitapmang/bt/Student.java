/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapmang.bt;

/**
 *
 * @author huong.dang
 */
import java.util.Scanner;

public class Student {

    private String masinhvien;
    private String lop;
    private int tuoi;
    private double diemtrungbinh;
    private Scanner sc = new Scanner(System.in);

    public Student() {
    }

    public Student(String masinhvien, String lop, int tuoi, double diemtrungbinh) {
        this.masinhvien = masinhvien;
        this.lop = lop;
        this.tuoi = tuoi;
        this.diemtrungbinh = diemtrungbinh;
    }

    public String getMasinhvien() {
        return masinhvien;
    }

    public void setMasinhvien(String masinhvien) {
        this.masinhvien = masinhvien;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getDiemtrungbinh() {
        return diemtrungbinh;
    }

    public void setDiemtrungbinh(double diemtrungbinh) {
        this.diemtrungbinh = diemtrungbinh;
    }

    public void inputinfo() {
        System.out.print("Nhập ma sinh vien: ");
        masinhvien = sc.nextLine();
        if (masinhvien.length() != 8) {
            System.out.println("Ma sinh vien khong hop le");
        } else;
        System.out.print("Nhập lop sinh viên: ");
        lop = sc.nextLine();
        boolean check=false;

        if ((lop.substring(0,1)).equals("A") || lop.substring(0,1).equals("C")) {
            check = true;
            System.out.println(lop.substring(0));
        }

          else{
                System.out.println("So lop khong hop le");
        }
         
        System.out.print("Nhập tuổi: ");
        tuoi = sc.nextInt();
        if (tuoi < 18) {
            System.out.println("So tuoi khong hơp le");
        } else;
        System.out.print("Nhập diem trung binh: ");
        diemtrungbinh = sc.nextInt();
        if (diemtrungbinh < 0.0 | diemtrungbinh > 10.0) {
            System.out.println("Diem trung binh khong hop le");
        }
        System.out.println("Nhap lop");
        
    }

    public void showinfo() {
        System.out.println("Ma sinh vien la" + masinhvien + ":");
        System.out.println("Lop la" + lop + ":");
        System.out.println("So tuoi la" + tuoi + ":");
        System.out.println("Diem trung binh la" + diemtrungbinh + ":");
    }

    public void hocbong() {
        if (diemtrungbinh > 8.0) {
            System.out.println("Sinh vien" + masinhvien + "nhan duoc hoc bong voi so diem " + diemtrungbinh + ":");
        }
        else{
        System.out.println("Sinh vien" + masinhvien + "khong nhan duoc hoc bong");
    }
    }

    public static void main(String[] args) {
        Student st = new Student();
        st.inputinfo();
        st.showinfo();
        st.hocbong();
        // System.out.println("Sinh vien"+st.getMasinhvien()+":");

    }
}
