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
        
        double peso,altura,imc;
        boolean acimaPeso;
        
        System.out.println("Informe o peso");
        peso = Double.valueOf(input.nextLine());
        
        System.out.println("Informe a altura");
        altura = Double.valueOf(input.nextLine());
        
        imc = peso /(altura * altura);
        acimaPeso = imc > 25;
        
        System.out.println("O indice de massa corporal da pessoa (IMC) é: " + imc);
        System.out.println("A pessoa está acima do peso: " + acimaPeso);
    }
}
