/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai21_String01{
    public static void main(String[] args) {
      System.out.println("Bai tap string");
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap HoVaTen ");
        String hovaten = sc.nextLine();
        
        System.out.println("Ho: "+ hovaten.substring(0, 6));
        System.out.println("Ten lot: "+ hovaten.substring(6, 15));
        System.out.println("Ten: "+ hovaten.substring(14));
        System.out.println("HOVATEN IN HOA: "+hovaten.toUpperCase());
        System.out.println("do dai: "+ hovaten.length());

    }
}
