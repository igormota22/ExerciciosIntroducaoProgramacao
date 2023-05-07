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
        
        double salarioMin,fixo,venda,comissao,comissaoVendas,salarioFinal;
        int qntVendida;
        
        System.out.println("Informe o salário minimo");
        salarioMin = Double.valueOf(input.nextLine());
        
        System.out.println("Informe a quantidade de carros vendidos");
        qntVendida = Integer.valueOf(input.nextLine());
        
        System.out.println("Informe o valor total das vendas");
        venda = Double.valueOf(input.nextLine());
        
        fixo = salarioMin * 2;
        comissao = 150 * qntVendida;
        comissaoVendas = venda * 5/100;
        salarioFinal = (fixo + comissao + comissaoVendas);
        
        System.out.println("O salário do funcionario é de: R$ " + salarioFinal);
    }
}
