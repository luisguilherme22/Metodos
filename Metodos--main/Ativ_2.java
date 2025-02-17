package Metodos;

import java.util.Scanner;

public class Ativ_2 {

        public static String ParImpar(int numero) {
            if (numero % 2 == 0) {
                return numero + " é par";
            } else {
                return numero + " é ímpar";
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Insira um número: ");
            int x = sc.nextInt();

            System.out.println(ParImpar(x));

            sc.close();
        }
            }