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
     
        double p1,p2,trabalho;
        int frequencia;
        boolean aprovado;
        
        System.out.println("Informe a nota da primeira prova");
        p1 = Double.valueOf(input.nextLine());
        
        System.out.println("Informe a nota da segunda prova");
        p2 = Double.valueOf(input.nextLine());
        
        System.out.println("Informe a nota do trabalho");
        trabalho = Double.valueOf(input.nextLine());
        
        System.out.println("Informe a frequência do aluno");
        frequencia = Integer.valueOf(input.nextLine());
        
        aprovado = (p1 >=  6 || p2 >=6) && (trabalho >= 7) && (frequencia >= 75) || (trabalho == 6 && frequencia >= 90); 
        
        System.out.println("O aluno está aprovado: " + aprovado);
    }
}
