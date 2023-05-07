/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe4;

import java.util.Scanner;

/**
 *
 * @author Igor
 */
public class Exe4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double c,f;
        
        System.out.println("Informe a temperatura em Celsius");
        c = Double.valueOf(input.nextLine());
        
        f = c * 1.8 + 32;
        
        System.out.println("A temperatura em Fahrenheit é: " + f);
    }
}
