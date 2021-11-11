package br.com.dio.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;
        int maiorNumero = 0;
        int soma = 0;
        double media = 0.0;
        int cont = 0;

        while (cont < 5) {
            System.out.println("Digite um número: ");
            numero = scanner.nextInt();
            if(maiorNumero < numero) maiorNumero = numero;
            soma += numero;
            cont++;
        }
        media = soma / 5;

        System.out.println("Média: " + media);
        System.out.println("Maior número: "+ maiorNumero);

    }
}
