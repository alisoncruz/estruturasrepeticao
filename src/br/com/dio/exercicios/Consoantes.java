package br.com.dio.exercicios;

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] consoantes = new String[6];
        int count = 0;
        int quantidadeConsoantes = 0;

        do {
            System.out.println("Digite uma letra: ");
            String letra = scanner.nextLine();
            if (ehConsoante(letra)) {
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }
            count++;
        } while (count < consoantes.length);

        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
        for (String letra : consoantes) {
            System.out.print(letra + " ");
        }


    }

    private static boolean ehConsoante(String letra) {
        switch (letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                return false;
            default:
                return true;
        }
    }
}
