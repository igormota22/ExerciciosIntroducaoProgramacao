/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe7;

import java.util.Scanner;

/**
 *
 * @author Igor
 */
public class Exe7 {

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int qCafe,qLeite,qBisc;
        double pCafe,pLeite,pBisc,gCafe,gLeite,gBisc,gTotal;
       
        System.out.println("Informe a quantidade de café");
        qCafe = Integer.valueOf(input.nextLine());
        
         System.out.println("Informe a quantidade de café");
        qLeite = Integer.valueOf(input.nextLine());
        
         System.out.println("Informe a quantidade de bolachas");
        qBisc = Integer.valueOf(input.nextLine());
        
        
        System.out.println("Informe o preço do café");
        pCafe = Double.valueOf(input.nextLine());
        
         System.out.println("Informe o preço do leite");
        pLeite = Double.valueOf(input.nextLine());
        
         System.out.println("Informe o preço da bolacha");
        pBisc = Double.valueOf(input.nextLine());
        
        
        gCafe = qCafe * pCafe;
        gLeite = qLeite * pLeite;
        gBisc = qBisc * pBisc;
        gTotal = gCafe + gLeite + gBisc;
        
        System.out.println("O gasto do café foi de: R$ " + gCafe);
        System.out.println("O gasto do leite foi de: R$ " + gLeite);
        System.out.println("O gasto do bolacha foi de: R$ " + gBisc);
        System.out.println("O gasto total foi de: R$ " + gTotal);
    }
}
