/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe6;

import java.util.Scanner;

/**
 *
 * @author Igor
 */
public class Exe6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int altura,compri,largura,areaPiso,areaParede,volume;
        boolean arP,arM,arG;
        
        System.out.println("Informe a altura da sala");
        altura = Integer.valueOf(input.nextLine());
        
        System.out.println("Informe o comprimento da sala");
        compri = Integer.valueOf(input.nextLine());
        
        System.out.println("Informe a largura da sala");
        largura = Integer.valueOf(input.nextLine());
        
        areaPiso = largura * compri;
        volume = compri * largura * altura;
        areaParede = 2 * altura * (compri + largura) ;
        
    
        
        arP = volume < 100;
        arM = volume >= 100 && volume <= 500;
        arG = volume > 500;
                
        
        System.out.println("A área do piso é de : " + areaPiso);
        System.out.println("O volume da sala é de: " + volume);
        System.out.println("A área das paredes é de: " + areaParede);
        System.out.println("O ar -condicionado deve ser pequeno: " + arP);
        System.out.println("O ar -condicionado deve ser médio: " + arM);
        System.out.println("O ar -condicionado deve ser grande: " + arG);
        
        
        
        
        
        
        
        
        
        
    }
}
