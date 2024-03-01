import java.util.Scanner;

public class CustoCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();

        double percentualDistribuidor = 28;
        double percentualImpostos = 45;

        double custoFinal = custoFabrica + (custoFabrica * percentualDistribuidor / 100) + (custoFabrica * percentualImpostos / 100);

        System.out.println("O custo final ao consumidor é: R$ " + custoFinal);
    }
}
