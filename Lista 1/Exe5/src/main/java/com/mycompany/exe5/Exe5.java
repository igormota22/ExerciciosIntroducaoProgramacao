/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe5;

import java.util.Scanner;

/**
 *
 * @author Igor
 */
public class Exe5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double pic1 = 1.50, pic2 = 2, pic3 = 0.75;
        int qnt1,qnt2,qnt3;
        double venda1, venda2, venda3,vendaTotal;
        
        System.out.println("Informe a quantidade vendida do primeiro tipo de picolé");
        qnt1 = Integer.valueOf(input.nextLine());
        
        System.out.println("Informe a quantidade vendida do segundo tipo de picolé");
        qnt2 = Integer.valueOf(input.nextLine());
        
        System.out.println("Informe a quantidade vendida do terceiro tipo de picolé");
        qnt3 = Integer.valueOf(input.nextLine());
        
        venda1 = pic1 * qnt1;
        venda2 = pic2 * qnt2;
        venda3 = pic3 * qnt3;
        vendaTotal = venda1 + venda2 + venda3;
        
        System.out.println("O valor das vendas do primeiro tipo foi de:  R$ " + venda1);
        System.out.println("O valor das vendas do segundo tipo foi de:  R$ " + venda2);
        System.out.println("O valor das vendas do terceiro tipo foi de:  R$ " + venda3);
        System.out.println("O valor total das vendas das foi de:  R$ " + vendaTotal);
    }
}
