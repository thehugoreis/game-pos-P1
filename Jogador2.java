//guarda jogador 2
import java.util.Scanner;

class Jogador2 {
	Scanner resp = new Scanner(System.in);

	String nome;
	String sexo;
	String idade;
	int pontosJ2 = 0;//Garada os pontos da rodade referentes ao jogador dois

	//Metodo que pergunta o nome/nick do jogador 2
	void nome() {
	System.out.println("\nJogador 2: Qual o seu nome ou nickname?");
	nome = resp.nextLine();
	}
}
