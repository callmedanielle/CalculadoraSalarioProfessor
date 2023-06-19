import java.util.Scanner;

public class CalculadoraProfessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // solicita o nome do professor

        System.out.println("Digite o nome do professor:");
        String nomeProfessor = scanner.nextLine();

        // solicita o regime de pagamento 

        System.out.println("Digite o regime de pagamento (CLT, Horista ou PJ):");
        String regimePagamento = scanner.nextLine();

        double valorReceber = 0.0;

        // informações específicas para a lógica do programa, salário mensal, horas trabalhadas, valor da hora

        if (regimePagamento.equalsIgnoreCase("CLT")) {
            System.out.println("Digite o salário mensal do professor:");
            double salarioMensal = scanner.nextDouble();
            valorReceber = salarioMensal;
        } else if (regimePagamento.equalsIgnoreCase("Horista")) {
            System.out.println("Digite o número de horas trabalhadas pelo professor:");
            double horasTrabalhadas = scanner.nextDouble();

            System.out.println("Digite o valor da hora de trabalho:");
            double valorHoraTrabalho = scanner.nextDouble();

            valorReceber = horasTrabalhadas * valorHoraTrabalho;
        } else if (regimePagamento.equalsIgnoreCase("PJ")) {
            System.out.println("Digite o valor do contrato do professor:");
            double valorContrato = scanner.nextDouble();
            valorReceber = valorContrato;
        } else {
            System.out.println("Regime de pagamento inválido.");
            scanner.close();
            return;
        }

        // imprime o nome do professor e o valor a receber

        System.out.println("Nome do professor: " + nomeProfessor);
        System.out.println("Valor a receber: " + valorReceber);

        scanner.close();
    }
}
