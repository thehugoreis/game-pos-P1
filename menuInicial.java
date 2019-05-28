//Menu inicial
//Descricao do jogo
//Como jogar

import java.util.Scanner;

class menuInicial {

	Scanner resp = new Scanner(System.in);
	int checagem = 1;
	int menuInicial = 0;
	int telaIni = 1;

	//Tela inicial do jogo. Apresenta opcoes para o jogador escolher. 
	void telaBoasvindas() {
		menuInicial = 0;
		System.out.println("\nOla, voce inicou o jogo de perguntas e repostas.\nEscolha uma das opcoes a seguir:\n");
		System.out.println("[1]-Descricao do jogo.");
		System.out.println("[2]-Instrucoes de como jogar.");
		System.out.println("[3]-Comecar a jogar!");
		System.out.println("[4]-Sair do jogo");
		menuInicial = resp.nextInt();

		if (menuInicial == 4) {
			telaIni = 0;
			checagem = 0;
		}
	}

	//Tela onde e mostrado a descricao do jogo e seu proposito.
	void desc() {
		System.out.println("\nEste jogo foi produzido para o curso de redes como projeto de sala. O seu objetivo e registrar o nome dos jogadores, um ou mais, apresentar a eles perguntas e por fim uma pontuacao com a quantidade de acertos e o vencedor.\n");
		System.out.println("\n\nVoltar a tela inicial? [1-Sim]/[2-Nao]");
		int descResp = resp.nextInt();
		if (descResp == 1) {
			menuInicial = 0;
		}

	}
	//Tela com descricoes de como jogar.
	void cjogar() {
		System.out.println("\nEste jogo funciona com a interacao do usuario inserindo numeros.\n Por exemplo:\n*****Esta e uma pergunta*****\n[1 - resposta um]\n[2 - resposta dois]\n\n**********\n O usuario/jogador deve entao inserir no console o numero correspondete a opcao de resposta desejada e pressionar a tecla enter/return.");
		System.out.println("\n\nVoltar a tela inicial? [1-Sim]/[2-Nao]");
		int cjogarResp = resp.nextInt();
		if (cjogarResp == 1) {
			menuInicial = 0;
		}

	}

	//Resseta a variavel menuInicial. Fazendo o loop voltar ao metodo telaBoasvindas.
	void resetIni() {
		menuInicial = 0;
		checagem = 1;
		telaIni = 1;
	}
	//Resset para a tela de escolha de jogadores.
	void resetTojogador() {
		menuInicial = 3;
	}

}
