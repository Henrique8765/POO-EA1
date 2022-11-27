import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Este assistente te auxiliará na compra do Ingresso de Cinema"); //apresentação

		ArrayList<String> listaDeFilmes = new ArrayList<>();	//Lista de filmes
		listaDeFilmes.add("The Clockwork Orange");
		listaDeFilmes.add("The Godfather");
		listaDeFilmes.add("Forest Gump");
		listaDeFilmes.add("Into The Wild");

		Ingresso ingresso1 = new Ingresso();
	
		System.out.println("Digite o número equivalente ao filme que você deseja assistir:");
		for (int i = 1; i <= listaDeFilmes.size(); i++) {
			int numeroDoFilmeNoArray = i-1;
			System.out.println(i + " - " + listaDeFilmes.get(numeroDoFilmeNoArray));
		}
		
		Scanner reader = new Scanner(System.in);
		int codigoDoFilme;
		codigoDoFilme = reader.nextInt()-1;
		System.out.println("Você escolheu " + listaDeFilmes.get(codigoDoFilme) + ".");
		
		String sessoes[] = new String[4];
		sessoes [0] = "10:00";
		sessoes [1] = "11:00";
		sessoes [2] = "14:00";
		sessoes [3] = "16:00";
		
		System.out.println("Digite o número equivalente à sessão que você deseja assistir:");
		System.out.println("1 - "+ sessoes [0]);
		System.out.println("2 - "+ sessoes [1]);
		System.out.println("3 - "+ sessoes [2]);
		System.out.println("4 - "+ sessoes [3]);
		int codigoDaSessao;
		codigoDaSessao = reader.nextInt()-1;
		System.out.println("Você escolheu " + sessoes[codigoDaSessao] + ".");

		System.out.println("Serão quantos ingressos Meia Entrada para esta sessão?");
		ingresso1.quantIngressosMeia = reader.nextInt();
		System.out.println("E quantos ingresos Inteirospara esta sessão?");
		ingresso1.quantIngressosInteira = reader.nextInt();

		ingresso1.valorTotal();

	}
		
		
}
