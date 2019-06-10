//guarda jogador 2
import java.util.Scanner;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

class Jogador2 {
	Scanner resp = new Scanner(System.in);

	String nome;
	String sexo;
	String idade;
	int pontosJ2 = 0;//Gera os pontos da rodade referentes ao jogador dois

	//Metodo que pergunta o nome/nick do jogador 2
	void nome() throws IOException{
	System.out.println("\n**********************************************************************************");
	System.out.println("\nJogador 2: Qual o seu nome ou nickname?");
	System.out.print("\n> ");
	nome = resp.nextLine();
	String nomeArq = nome + "_jogador2.txt"; //Atribui o nome do jogador ao arquivo de texto.
    
        FileOutputStream arquivo = new FileOutputStream(nomeArq); //Atribui a variavel "arquivo" o conteudo da variavel "nomeArq"
		PrintWriter manipulaArq = new PrintWriter(arquivo);
		
		//Imprime linha no aquivo criado
		manipulaArq.println(nome);
		//manipulaArq.println(pontosJ1 + " Pontos");
		manipulaArq.close();
		arquivo.close();
	}
}
