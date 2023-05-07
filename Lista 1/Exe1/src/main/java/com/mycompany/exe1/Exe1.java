/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe1;

import java.util.Scanner;

/**
 *
 * @author Igor
 */
public class Exe1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n1,n2,soma;
        
        System.out.println("Digite o primeiro número");
        n1 = Integer.valueOf(input.nextLine());
        
         System.out.println("Digite o segundo número");
        n2 = Integer.valueOf(input.nextLine());
        
        soma = (n1 * n1) + (n2 * n2);
        
        System.out.println("A soma dos quadrados é: " + soma);
    }
}
