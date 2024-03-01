import java.util.Scanner;

public class ReajusteSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário mensal atual: ");
        double salarioAtual = scanner.nextDouble();

        System.out.print("Digite o percentual de reajuste: ");
        double percentualReajuste = scanner.nextDouble();

        double novoSalario = salarioAtual * (1 + percentualReajuste / 100);

        System.out.println("O novo salário é: R$ " + novoSalario);
    }
}
