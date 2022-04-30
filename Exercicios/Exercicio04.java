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
public class Exercicio04 {
    
    public static void main(String[] atgs){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do produto");
        String produto = scan.nextLine();
        System.out.printf("Digite o valor de compra do produto %s \n", produto);
        float valor = scan.nextFloat();
           
        while(valor > 100){
            System.out.println("Produto excede o valor limite de 100. Digite novo valor:");
            valor = scan.nextFloat();
        }
        System.out.printf("Produto %s cadastrado com valor %f", produto, valor);
        scan.close();
    
    }
    
    
    
}
