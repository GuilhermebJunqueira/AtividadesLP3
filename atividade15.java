import java.util.Scanner;

public class SalarioComHorasExtras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas em um mês: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.print("Digite o salário por hora: ");
        double salarioPorHora = scanner.nextDouble();

        int horasNormais = 40;
        double salarioTotal;

        if (horasTrabalhadas <= horasNormais) {
            salarioTotal = horasTrabalhadas * salarioPorHora;
        } else {
            int horasExtras = horasTrabalhadas - horasNormais;
            double salarioHoraExtra = salarioPorHora * 1.5;
            salarioTotal = (horasNormais * salarioPorHora) + (horasExtras * salarioHoraExtra);
        }

        System.out.println("O salário total do funcionário é: R$ " + salarioTotal);
    }
}
