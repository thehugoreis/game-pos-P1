//guarda jogador 1
import java.util.Scanner;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

class Jogador1 {
	Scanner resp = new Scanner(System.in);

	String nome;
	String sexo;
	String idade;
	int pontosJ1 = 0;//Pontos da rodada referentes ao jogador um

	//Metodo para perguntar ao jogador seu nome/nick e resitra em arquivo externo
	void nome() throws IOException {
        
        System.out.println("\n**********************************************************************************");
        System.out.println("\nJogador 1: Qual o seu nome ou nickname?");
        System.out.print("\n> ");
        nome = resp.nextLine();
        String nomeArq = nome + "_jogador1.txt"; //Atribui o nome do jogador ao arquivo de texto.
    
        FileOutputStream arquivo = new FileOutputStream(nomeArq); //Atribui a variavel "arquivo" o conteudo da variavel "nomeArq"
		PrintWriter manipulaArq = new PrintWriter(arquivo);
		
		//Imprime linha no aquivo criado
		manipulaArq.println(nome);
		//manipulaArq.println(pontosJ1 + " Pontos");
		manipulaArq.close();
		arquivo.close();
	}
}
