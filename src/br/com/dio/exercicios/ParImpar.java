package br.com.dio.exercicios;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeNumeros = 0;
        int count = 0;
        int quantidadePares = 0;
        int quantidadeImpares = 0;

        System.out.println("Digite a quantidade de números: ");
        quantidadeNumeros = scanner.nextInt();

        while (count < quantidadeNumeros) {
            System.out.println("Digite um número: ");
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                quantidadePares++;
            } else {
                quantidadeImpares++;
            }
            count++;
        }

        System.out.println("Quantidade de números pares: " + quantidadePares);
        System.out.println("Quantidade de números ímpares: " + quantidadeImpares);
    }
}
