package org.example;

import java.util.Scanner;

public class Sistema_restaurante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //vetores que armazenam cardapio e preco
        String[] cardapio = {"strogonoff", "frango grelhado", "batata frita", "suco"};//o cardapio anda junto do preco,mas não o contrario
        double[] precos = {25.0, 20.0, 10.0, 8.0};

        //lembre-se de tentar automatizar isso com banco de dados(php)
        //vetores que recebem cardapio e preco
        String[] pedidos = new String[50];//segundo o gpt, não dá pra fazer dinamico sem usar a biblioteca ArrayList
        double[] precoPedidos = new double[50];
        int contador = 0;//vai servir para percorrer os dois vetores acima

        boolean finaliza_pedido = false;

        while (!finaliza_pedido) {
            System.out.println("Cardápio");
            for (int i = 0; i < cardapio.length; i++) {
                System.out.println((i + 1) + " - " + cardapio[i] + " -> R$ " + precos[i]);
            }
            System.out.println("\nDigite 0 para finalizar o pedido");
            System.out.println("Digite " + (cardapio.length + 1) + " para remover o prato");//semelhante ao que se faz em php e javascript

            System.out.print("\nescolha uma opção das mostradas anteriormente :");
            int escolha = scanner.nextInt();// recebe a escolha de cardapio


            if (escolha >= 1 && escolha <= cardapio.length) {
                pedidos[contador] = cardapio[escolha - 1];//contador percorre o vetor pedidos e escolha percorre cardapio
                precoPedidos[contador] = precos[escolha - 1];//o mesmo de cima mas com o vetor de precos
                contador++;
                System.out.println("\n"+cardapio[escolha - 1] + " adicionado ao pedido");


            } else if (escolha == cardapio.length + 1) {
                if (contador == 0) { //verifica se há algum prato a ser removido
                    System.out.println("\nNão tem pratos para serem removidos, adicione algum prato\n");
                    continue;// ele serve para iniciar o for abaixo
                }
                System.out.println("\nResumo do seu pedido atual:");
                for (int i = 0; i < contador; i++) {//percorre o vetor pedidos, por isso ele não é semelhante ao vetor cardapio
                    System.out.println((i + 1) + " - " + pedidos[i] + " -> R$ " + precoPedidos[i]);
                }
                System.out.print("\ndigite o numero do prato que quer remover, se digitar qualquer numero a não ser os acima. voce volta pro menu anterior: ");
                int remover = scanner.nextInt();// recebe o contador do vetor pedidos
                scanner.nextLine();
                if (remover >= 1 && remover <= contador) {
                    for (int i = remover - 1; i < contador - 1; i++) {
                        pedidos[i] = pedidos[i + 1];
                        precoPedidos[i] = precoPedidos[i + 1];
                    }
                    contador--;
                    System.out.println("\nprato removido");
                } else {
                    System.out.println("\nNumero invalido, então voce voltará para o menu de escolha de pratos\n");
                }
            } else if (escolha == 0) {//finaliza o pedido
                finaliza_pedido = true;
            } else {
                System.out.println("\nEssa opção nao existe\n");
            }
        }


        //recibo
        System.out.println("\nrecibo");//o \n faz a mesma funcao em c++, que é pular linha. tipo o br em html
        double total = 0;
        for (int i = 0; i < contador; i++) {
            System.out.println("- " + pedidos[i] + " - R$ " + precoPedidos[i]);
            total += precoPedidos[i];
        }
        System.out.println("total em R$ " + total);

        scanner.close();
    }
}

