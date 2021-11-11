package br.com.dio.exercicios;

import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            System.out.println("Nome: ");
            nome = scanner.nextLine();
            if(nome.equals("0")) break;
            System.out.println("Idade: ");
            idade = scanner.nextInt();
        }
        System.out.println("Continua aqui");
    }
}
