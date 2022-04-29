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
public class Exercicio01 {
    
    public static void main(String[] args){
    
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do produto");
        String produto = entrada.nextLine();
        System.out.println("Digite o valor do produto");
        float valorProduto = entrada.nextFloat();
        
        System.out.print(produto+" custa : " +valorProduto);
        entrada.close();
    }
    
    
       
    
    
}
