/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class baikiemtra_de1_cau1 {
    public static void main(String[] args) {
         ArrayList<Double> numbers= new ArrayList<>();
         Scanner sc = new Scanner(System.in);
         
         System.out.println("nhap so va nhap stop");
         while (true) {
             String input = sc.nextLine();
             if(input.equalsIgnoreCase("stop")){
                 break;
                 
             }
             try {
                 double number = Double.parseDouble(input);
                 numbers.add(number);
             } cath (NumberFormatException e){
                
                 System.out.println("vui long nhap so hop le.");
                 
             } 
        }
         if(numbers.isEmpty()){
             System.out.println("khong co so nao duoc nhap");
             
         }
    }
    
}
