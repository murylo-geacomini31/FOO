package E6;

public class CalculadoraFinanceira {
        public void calcularDesconto(double valorTotal, double percentualDesconto) {

            double desconto = valorTotal * (percentualDesconto / 100);
            double valorFinal = valorTotal - desconto;

            System.out.println("Valor final com desconto: R$ " + valorFinal);
        }

}


