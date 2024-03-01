import java.util.Scanner;

public class SalarioVendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de carros vendidos: ");
        int carrosVendidos = scanner.nextInt();

        System.out.print("Digite o valor total das vendas: ");
        double valorTotalVendas = scanner.nextDouble();

        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o valor por carro vendido: ");
        double valorPorCarro = scanner.nextDouble();

        double salarioFinal = salarioFixo + (carrosVendidos * valorPorCarro) + (valorTotalVendas * 0.05);

        System.out.println("O salário final do vendedor é: R$ " + salarioFinal);
    }
}
