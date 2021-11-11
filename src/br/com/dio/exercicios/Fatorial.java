package br.com.dio.exercicios;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Forneça o número: ");
        int numeroFatorial = scanner.nextInt();
        int resultado = numeroFatorial;

        for (int i = numeroFatorial - 1; i >= 1; i--) {
            resultado *= i;
        }

        System.out.println("Fatorial de " + numeroFatorial + " = " + resultado);

    }
}
