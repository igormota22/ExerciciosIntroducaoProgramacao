/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe8;

import java.util.Scanner;

/**
 *
 * @author Igor
 */
public class Exe8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n,quociente,resto;
        
        System.out.println("Digite o número");
        n = Integer.valueOf(input.nextLine());
        
        quociente = n/2;
        resto = n % 2;
        
        
        System.out.println("O quociente do número é: " + quociente);
        System.out.println("O resto do número é: " + resto);
        
        
        
        
    }
}
