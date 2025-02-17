package Metodos;
import java.util.Scanner;
public class Ativ_4 {

        public static String verificarVoto(int idade) {
            if (idade >= 16) {
                return "Você pode votar!";
            } else {
                return "Você nao pode votar!";
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Insira sua idade:");
            int idade = sc.nextInt();

            System.out.println(verificarVoto(idade));

            sc.close();
        }
    }