/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt.class02032019;
import java.util.Scanner;
/**
 *
 * @author huong.dang
 */
public class Mydate {
    private int date;
    private int month;
    private int year;

    public Mydate(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public static void main(String[] args) {
        Mydate date =new Mydate();
        System.out.println("Ngay thang la"+date.getDate()+"/"+date.getMonth()+"/"+date.getYear());
    }
}
