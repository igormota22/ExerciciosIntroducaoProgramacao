/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe2;

import java.util.Scanner;

/**
 *
 * @author Igor
 */
public class Exe2 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        int q;
        double preco,conta,contaAtraso;
        boolean consumoElevado;
        
        System.out.println("Informe o preço do quillowatt");
        preco = Double.valueOf(input.nextLine());
        
        System.out.println("Informe a quantidade gasta de quillowatts");
        q = Integer.valueOf(input.nextLine());
        
        conta = q * preco;
        contaAtraso = conta + (conta *10)/100;
        consumoElevado = q > 70;
        
        
        System.out.println("O valor da conta será de: R$ " + conta);
        System.out.println("O valor da conta atrasada será de: R$ " + contaAtraso);
        System.out.println("A residência tem consumo elevado de energia: " + consumoElevado);
    }
}
