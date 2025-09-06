package org.example;

//importa a biblioteca scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            //instancia a biblioteca
            Scanner scanner = new Scanner(System.in);

            //pega num1
            System.out.println("Digite o primeiro numero da equacao");
            double num1 = scanner.nextDouble();
            //pega num2
            System.out.println("Digite o segundo numero da equacao");
            double num2 = scanner.nextDouble();


            //inicia o menu
            System.out.println("Escolha uma das operacoes");
            System.out.println("1-Soma");
            System.out.println("2-Subtração");
            System.out.println("3-Multiplicação");
            System.out.println("4-Divisão");
            //captura a opcao escolhida
            int operacao = scanner.nextInt();

            //o menu usando switch case
            double resultado;
            switch(operacao){
                case 1:
                    resultado = num1 + num2;
                    System.out.println("Resultado da Soma=" + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("Resultado da Subtração=" + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("Resultado da Multiplicação=" + resultado);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado da Divisão=" + resultado);
                    } else {
                        System.out.println("Erro: Divisão por zero não existe");
                    }
                    break;
                default:
                    System.out.println("Operação invalida");
            }
            scanner.close();
        }
    }


