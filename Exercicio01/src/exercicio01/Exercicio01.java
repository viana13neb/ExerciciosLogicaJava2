package exercicio01;

import java.util.Scanner;

public class Exercicio01 {

    public static boolean numeroPerfeito(int n) {
        if (n <= 1) {
            return false;
        }
        int somaDivisores = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                somaDivisores += i;
            }
        }

        return somaDivisores == n;
    }

    public static void main(String[] args) {
        //Crie um método que receba um número inteiro e retorne true se for um número perfeito 
        //(a soma de seus divisores próprios é igual ao número, ex: 6 = 1 + 2 + 3).

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int n = scan.nextInt();

        System.out.println(numeroPerfeito(n));

    }

}
