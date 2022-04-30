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
public class ExercicioEntrega {
    
    float salario;
    
    
    float getSalario(){
        return this.salario;
    }
    
    void setSalario(float valor){
        this.salario = valor;
    }
    
    static float calculaSalario(float valor, float horasSemanais){
    
        return (((valor*horasSemanais))*4);
    
    }
    
    static float selecionaAliquota(float salario){
        if(salario <= 1900){
            return (float) (0);
        }else if(salario >1900 && salario <=2820){
            return (float) (0.075);
        }else if(salario > 2820 && salario <= 3750){
            return (float) (0.145);
        } else if(salario > 3750 && salario <= 4600){
            return (float) (0.225);
        }else{
            return (float) (0.275);
        }
    }
    
    
    static float calculaIRPF(float salario){
        float aliquota = selecionaAliquota(salario);
        System.out.println(aliquota);
        if(aliquota == 0.075){
            return (float) ((salario*aliquota)-142.8);
        }else if(aliquota == 0.145){
            return (float) ((salario*aliquota)-300);
        }else if(aliquota == 0.225){
            return (float) ((salario*aliquota)-600);
        }else if(aliquota == 0.275){
            return (float) ((salario*aliquota)-800);
        }else return salario;
           }
    
    
    public static void main(String[] atgs){
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o valor da sua hora de trabalho?");
        float valorHora = scan.nextFloat();
        System.out.println("Quantas horas voce trabalha ?");
        float horas = scan.nextFloat();
        
        ExercicioEntrega funcionario = new ExercicioEntrega();     
        
        float salarioBruto = funcionario.calculaSalario(valorHora, horas);
        float salarioAtualizado = funcionario.calculaIRPF(salarioBruto);
        funcionario.setSalario(salarioAtualizado);
        
        
        System.out.printf("Salario final de %f :", funcionario.getSalario());
    
    }
    
    
    
    
//    static float calculaIRPF(float salario){
//        
//    
//    }
    
    
    
    
}
