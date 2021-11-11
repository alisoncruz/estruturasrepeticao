package br.com.dio.exercicios;

import java.util.Scanner;

public class Nota {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma nota: ");
        double nota = scanner.nextDouble();

        while(nota < 0 || nota > 10) {
            System.out.println("Nota inválida. Digite novamente: ");
            nota = scanner.nextDouble();
        }
    }
}
