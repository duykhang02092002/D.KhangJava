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
        ArrayList<Double> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap so va nhap stop");
        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;

            }
            try{
                double number = Double.parseDouble(input);
                numbers.add(number);
            }
            cath(NumberFormatException e){
                
                 System.out.println("vui long nhap so hop le.");

            }
        }
        if (numbers.isEmpty()) {
            System.out.println("khong co so nao duoc nhap");
            return;
        }
        // Tính toán
        double max = numbers.get(0);
        double min = numbers.get(0);
        double sum = 0;

        for (double num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            sum += num;
        }

        double average = sum / numbers.size();

        // Xuất thông tin
        System.out.println("Số lớn nhất: " + max);
        System.out.println("Số nhỏ nhất: " + min);
        System.out.println("Tổng của dãy số đã nhập: " + sum);
        System.out.println("Trung bình của dãy số đã nhập: " + average);
    
    }
}

