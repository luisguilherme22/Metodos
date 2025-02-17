package Metodos;
import java.util.Scanner;
public class Ativ_2Pt2 {

        public static String verificar(double nota1, double nota2) {
            double media = (nota1 + nota2) / 2;
            return (media >= 7) ? "O aluno foi aprovado" : "O aluno NÃO foi aprovado";
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Insira a primeira nota:");
            double nota1 = sc.nextDouble();

            System.out.println("Insira a segunda nota:");
            double nota2 = sc.nextDouble();

            System.out.println(verificar(nota1, nota2));

            sc.close();
        }
    }