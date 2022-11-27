
public class Ingresso {

	int quantIngressosMeia;
	int quantIngressosInteira;
	int valorIngressoInteiro = 32;
		
	void valorTotal() {
		double valorTotal = (quantIngressosMeia * (valorIngressoInteiro/2)) + (quantIngressosInteira * valorIngressoInteiro);
		System.out.print("O valor da sua compra é de R$" + valorTotal + ".");
	} 
}

