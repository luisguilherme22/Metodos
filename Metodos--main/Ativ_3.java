package Atividades;

import java.util.Scanner;

public class Ativ_3 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Insira dois numeros: ");
            int x= sc.nextInt();
            int y= sc.nextInt();

            int higher = max(x,y);

            showResult( higher);


                sc.close();
            }
        public static int max(int x, int y){
            int aux;
            if(x > y){
                aux = x;
            } else {
                aux = y;
            }
            return aux;
        }

    public static void showResult (int valor) {
        System.out.println("O maior número é: " + valor);

    }
}