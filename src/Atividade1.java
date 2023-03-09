import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        int inicio, fim, contador;
        Scanner entrada = new Scanner(System.in);
        System.out.println("CONTAGEM INTELIGENTE");
        System.out.println("--------------------");
        System.out.println("Digite o inicio: ");
        inicio = entrada.nextInt();
        System.out.println("Digite o fim: ");
        fim = entrada.nextInt();
        System.out.println("----------------------");
        System.out.println(" CONTANDO ");
        System.out.println("----------------------");
        if (fim > inicio) {
            contador = inicio;
            while (contador <= fim) {
                System.out.print(contador + "..");
                contador = contador + 1;
            }
        } else {
            contador = inicio;
            while (contador >= fim) {
                System.out.print(contador + "..");
                contador = contador - 1;
            }
        }
    }
}
