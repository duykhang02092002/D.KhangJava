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
public class baikentra_de1_cau2 {
    public static void main(String[] args) {
        System.out.println("Tinh Chu Vi, Dien Tich Tam giac");
        Scanner sc = new Scanner(System.in);
        double  a,b,c,nuacv,cv,dt;
        System.out.println("nhap canh a: ");
        a = sc.nextInt();
         System.out.println("nhap canh b: ");
        b = sc.nextInt();
         System.out.println("nhap canh c: ");
        c = sc.nextInt();
        
        nuacv = (a+b+c)/2;
        
        cv = (a+b+c);
        
        dt = Math.sqrt(nuacv*(nuacv-a)*(nuacv-b)*(nuacv-c));
        
        System.out.println("chu vi la: " + cv);
        System.out.println("dientich la: " + dt);
    }
}
