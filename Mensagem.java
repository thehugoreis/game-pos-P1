//versao 3
import java.util.Scanner;

class Mensagem {

    Jogador1 j1 = new Jogador1();
	Jogador2 j2 = new Jogador2();

	//Metodo para ao inicio do jogo perguntar o nome do jogador 1 e zerar o numero de pontos.
	void jgd1() {
		j1.nome();
		j1.pontosJ1 = 0;
	}

	//Metodo para ao inicio do jogo perguntar o nome do jogador 2 e zerar o numero de pontos.
	void jgd2() {
		j2.nome();
		j2.pontosJ2 = 0;
	}

    //perguntas jogador 1
	void aviso1() {
        System.out.println("\n**********************************************************************************");
		System.out.println("\n" + j1.nome + " , responda as questoes corretamente e acumule pontos.");
	}
	
	//Perguntas Jogador 2
	void aviso2() {
        System.out.println("\n**********************************************************************************");
		System.out.println("\n"+ j2.nome + " , responda as questoes corretamente e acumule pontos.");
	}

	//Aviso final quando um jogador selecionado, onde sera exibito a quantidade de pontos acumulados.
	void avisoFinal1() {
		System.out.println("Parabens " + j1.nome + " voce eh o vencedor(a).");
		System.out.println("Sua pontuacao foi: " + j1.pontosJ1 + " pontos.");
        System.out.println("\nVIVA O CAMPEAO!!");

	}

	//Mensagem motivacional para um jogador
	void respsomaPontos1() {
		if (j1.pontosJ1  == 30){
            System.out.println("\n**********************************************************************************");
			System.out.println("\nMuito bom!");
		} else if (j1.pontosJ1  > 15 && j1.pontosJ1 < 30) {
            System.out.println("\n**********************************************************************************");
			System.out.println("\nForca!");
		} else if (j1.pontosJ1 < 15) {
            System.out.println("\n**********************************************************************************");
			System.out.println("\nVamos melhorar!");
		}
	}
	
	//Mensagem motivacional para os dois jogadores
	void respsomaPontos2() {
		if (j1.pontosJ1 + j2.pontosJ2 == 60){
            System.out.println("\n**********************************************************************************");
			System.out.println("\nMuito bom!");
		} else if (j1.pontosJ1 + j2.pontosJ2 > 30 && j1.pontosJ1 + j2.pontosJ2 < 60) {
            System.out.println("\n**********************************************************************************");
			System.out.println("\nForca equipe!");
		} else if (j1.pontosJ1 + j2.pontosJ2 < 30) {
            System.out.println("\n**********************************************************************************");
			System.out.println("\nVamos melhorar!");
		}
	}

	//Aviso final do jogo onde sera calculado o vencedor ou o empate.
	void avisoFinal2() {
		System.out.println("\nVIVA O CAMPEAO!\n\nO jogador(a) vencedor foi:");
		
		  if (j1.pontosJ1 > j2.pontosJ2) {

			System.out.println("Parabens " + j1.nome + " voce eh o vencedor(a) com " + j1.pontosJ1 + " pontos.\nContra " + j2.pontosJ2 + " pontos do seu adeversario(a) " + j2.nome + ".");

		} else if (j2.pontosJ2 > j1.pontosJ1) {

			System.out.println("Parabens " + j2.nome + " voce eh o vencedor(a) com " + j2.pontosJ2 + " pontos.\nContra " + j1.pontosJ1 + " pontos do seu adeversario(a) " + j1.nome + ".");

		} else if (j1.pontosJ1 == j2.pontosJ2) {
			System.out.println("Paraens " + j1.nome + " e " + j2.nome + ", voces terminaram empatados.\n" + j1.nome + " com " + j1.pontosJ1 + " pontos.\n" + j2.nome + " com " + j2.pontosJ2 + " pontos.");
		}
	}	
	
	//Mensagem final do jogo
	void msgFinal(){
        System.out.println("\n********************");
		System.out.println("*Obrigado por jogar!*");
		System.out.println("********************");
	}
}
