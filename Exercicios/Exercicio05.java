/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exercicio05 {
    
        public static void main(String[] atgs){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do produto");
        String produto = scan.nextLine();
        float valor;
        do{
            System.out.printf("Digite o valor do produto (<100) %s :", produto);
            valor = scan.nextFloat();
        }
        while(valor > 100);
        System.out.printf("Produto %s cadastrado com valor %f", produto, valor);
        scan.close();
    
    }
    
    
}
