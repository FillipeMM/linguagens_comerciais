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
public class Exercicio02 {
    
    public static void main(String[] args){
    
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do produto");
        String produto = entrada.nextLine();
        System.out.println("Digite o valor do produto");
        float valorProduto = entrada.nextFloat();
        
        if (valorProduto > 100){
            System.out.print(produto+" custa mais de 100 reais, excedendo " + (valorProduto-100));
        }else{
            System.out.print(produto+" custa menos de 100 reais ");
        }
            
        
        
        entrada.close();
    }
    
}
