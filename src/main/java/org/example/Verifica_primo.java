package org.example;

//import a biblioteca

import java.util.Scanner;

public class Verifica_primo {
    public static void main(String[] args) {
        //instancia a biblioteca
        Scanner scanner = new Scanner(System.in);


        //pega num1
        System.out.println("Digite o primeiro numero");
        int num1 = scanner.nextInt();
        //pega num2
        System.out.println("Digite o segundo numero");
        int num2 = scanner.nextInt();



        //declaracao de array/vetor
        int[] numeros = {num1, num2};

        for (int num : numeros) {
            //verifica se o numero não é divisivel por ele mesmo ou 0
            if (num <= 1) {
                System.out.println("'"+num+"' O numero NÃO é primo");
            } else {
                //procura por divisores, começando pelo 2
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        System.out.println("'"+num+"' O numero NÃO é primo");
                        break;//para não ficar infinitamente procurando divisores
                    } else {
                        System.out.println("'"+num + "' O numero é primo");
                    }
                }
            }
        }
        scanner.close();
    }
}
