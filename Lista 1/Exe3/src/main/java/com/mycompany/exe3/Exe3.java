/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe3;

import java.util.Scanner;

/**
 *
 * @author Igor
 */
public class Exe3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int base,altura,area,peri;
        
        System.out.println("Informe a base");
        base = Integer.valueOf(input.nextLine());
        
        System.out.println("Informe a altura");
        altura = Integer.valueOf(input.nextLine());
        
        area = base * altura;
        peri = 2 * (base + altura);
        
        System.out.println("A àrea do retângulo é: " + area);
        System.out.println("O perímetro do retângulo é: " + peri);
    }
}
