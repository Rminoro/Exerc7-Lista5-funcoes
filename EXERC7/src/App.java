import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        int QtddePrest = 0;
        double vlrTdia = 0;
        Scanner entrada = new Scanner(System.in);
        while (true) {
            System.out.print("Digite o valor em reais da prestação: ");
            double ValorDaPrestação = entrada.nextDouble();
            if (ValorDaPrestação == 0) {
                break;
            }
            System.out.print("Quantos dias está em atraso ?: ");
            int diasAtrasados = entrada.nextInt();

            double valorTotal = Pagamento(ValorDaPrestação, diasAtrasados);

            System.out.println("O valor a ser pago será de R$ " + String.format("%.2f", valorTotal));
            System.out.println("");

            QtddePrest++;
            vlrTdia += valorTotal;
        }

        System.out.println("<<<<<<<<<< Relatorio Diário >>>>>>>>>>>>>>");
        System.out.println("Quantidade de prest: " + QtddePrest);
        System.out.println("Valor total de prest: R$ " + String.format("%.2f", vlrTdia));
        System.out.println("");

    }

    public static double Pagamento(double valorPrestacao, double diasAtrasados) {
        double valorAPagar = 0;
        if (diasAtrasados > 0) {
            double percentual = 0.03;
            double juros = 0.001;
            double valorMulta = valorPrestacao + (valorPrestacao * percentual);
            valorAPagar = valorMulta + (valorMulta * juros * diasAtrasados);
        } else {
            return valorPrestacao;
        }
        return valorAPagar;

    }

}