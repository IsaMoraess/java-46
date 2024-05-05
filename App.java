import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
/* Conversão de Moedas:
    Peça ao usuário que insira um valor em reais e uma taxa de câmbio. Calcule e
    mostre o equivalente em dólares*/
        Scanner sc = new Scanner(System.in);
    System.out.println("Informe um valor em real, para convrter em dolar!");
    double reais = sc.nextDouble();
    double dolares = reais * 5.02;
    System.out.println("O valor em Dolar é: " +dolares);
    }
}
