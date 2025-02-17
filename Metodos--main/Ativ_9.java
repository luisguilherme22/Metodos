package Metodos;
import java.util.Scanner;
public class Ativ_9 {

        public static String verificarIntervalo(int numero) {
            if (numero >= 10 && numero <= 50) {
                return numero + " está dentro do intervalo de 10 a 50";
            } else {
                return numero + " Nao está dentro do intervalo de 10 a 50";
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Insira um número:");
            int x = sc.nextInt();

            System.out.println(verificarIntervalo(x));

            sc.close();
        }
    }