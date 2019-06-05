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
        System.out.println("\n**********************************************************************************\n");
		System.out.println("Ola, voce inicou o jogo de perguntas e repostas.\nEscolha uma das opcoes a seguir:\n");
		System.out.println("[1]-Descricao do jogo.");
		System.out.println("[2]-Instrucoes de como jogar.");
		System.out.println("[3]-Comecar a jogar!");
		System.out.println("[4]-Sobre");
		System.out.println("[5]-Sair do jogo");
		System.out.print("\n> ");
		menuInicial = resp.nextInt();

		if (menuInicial == 5) {
			telaIni = 0;
			checagem = 0;
		}
	}

	//Tela onde e mostrado a descricao do jogo e seu proposito.
	void desc() {
        System.out.println("\n**********************************************************************************\n");
		System.out.println("Este jogo foi produzido para o curso de redes como projeto de sala. O seu objetivo e registrar o nome dos jogadores, um ou mais, apresentar a eles perguntas e por fim uma pontuacao com a quantidade de acertos e o vencedor.\n");
		System.out.println("\n\nVoltar a tela inicial? [1-Sim]/[2-Nao]");
		System.out.print("\n> ");
		int descResp = resp.nextInt();
		if (descResp == 1) {
			menuInicial = 0;
		}

	}
	//Tela com descricoes de como jogar.
	void cjogar() {
        System.out.println("\n**********************************************************************************\n");
		System.out.println("Este jogo funciona com a interacao do usuario inserindo numeros.\n  Por exemplo:\n  *****Esta e uma pergunta*****\n     [1 - resposta um]\n     [2 - resposta dois]\n\nO usuario/jogador deve entao inserir no console o numero correspondete a opcao de resposta desejada e pressionar a tecla enter/return.");
		System.out.println("\n\nVoltar a tela inicial? [1-Sim]/[2-Nao]");
		System.out.print("\n> ");
		int cjogarResp = resp.nextInt();
		if (cjogarResp == 1) {
			menuInicial = 0;
		}

	}

	//Menu sobre os autores
	void sobre(){
        System.out.println("\n**********************************************************************************\n");
		System.out.println("Sobre os autores do jogo:\n	Hugo reis, 23 anos - hugoreis2919@gmail.com\n	Antonio Carlos, 18 anos - antonio.silva145@fatec.sp.gov.br\n\n**Projeto de Programacao para Ambiente de Redes - FATEC/2019**");
		System.out.println("\n\nVoltar a tela inicial? [1-Sim]/[2-Nao]");
		System.out.print("\n> ");
		int sobreResp = resp.nextInt();
		if (sobreResp == 1) {
            menuInicial = 0;
        }

	}

	//Resseta a variavel menuInicial. Faz o loop voltar ao metodo telaBoasvindas.
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
