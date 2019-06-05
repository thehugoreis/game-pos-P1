import java.util.Scanner;

class perguntas {
	Scanner resp = new Scanner(System.in);

	int res;

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
		System.out.println("\n" + j1.nome + " , responda as questoes corretamente e acumule pontos.");
	}
    //Questão 1040426
	void a1() {
		
		System.out.println("\nO tipo de tecnologia de transmissão conhecido como links ponto a ponto permite \nsomente uma conexão entre pares de máquinas individuais.");
		System.out.println("Digite [1 - Certo]/[2 - Errado]");
		System.out.print("\n> ");
		res = resp.nextInt();

		if (res == 2) {
			j1.pontosJ1 = j1.pontosJ1 +10;
			System.out.println("\n" + j1.nome + " Sua resposta esta correta" + "\n" + "Voce possui:" + j1.pontosJ1 + " pontos");
		} else {
			System.out.println("\n" + j1.nome + " Sua resposta esta errada" + "\n" + "Voce possui:" + j1.pontosJ1 + " pontos");
		}
	}
    //Questão 1038853
	void b1() {
		
		System.out.println("\nCom relação a redes de computadores, julgue o item a seguir. No fluxo de pacotes em \numa rede de computadores, a qualidade de serviço é determinada pelos parâmetros \nrelacionados a propagação, recuperação, interferência e perda de dados. ");
		System.out.println("Digite [1 - Certo]/[2 - Errado]");
		System.out.print("\n> ");
		res = resp.nextInt();

		if (res == 2) {
			j1.pontosJ1 = j1.pontosJ1 +10;
			System.out.println("\n" + j1.nome + " Sua resposta esta correta" + "\n" + "Voce possui:" + j1.pontosJ1 + " pontos");
		} else {
			System.out.println("\n" + j1.nome + " Sua resposta esta errada" + "\n" + "Voce possui:" + j1.pontosJ1 + " pontos");
		}
	}
    //Questão 1040564
	void c1() {
		
		System.out.println("\nO termo conectividade pode ser definido como sendo um processo que compreende a conexão \nde computadores sem levar em consideração os meios e dispositivos de redes, com a finalidade \nde realizar a comunicação de dados entre locais remotos. ");
		System.out.println("Digite [1 - Certo]/[2 - errado]");
		System.out.print("\n> ");
		res = resp.nextInt();

		if (res == 2) {
			j1.pontosJ1 = j1.pontosJ1 +10;
			System.out.println("\n" + j1.nome + " Sua resposta esta correta" + "\n" + "Voce possui:" + j1.pontosJ1 + " pontos");
		} else {
			System.out.println("\n" + j1.nome + " Sua resposta esta errada" + "\n" + "Voce possui:" + j1.pontosJ1 + " pontos");
		}
	}

	//Perguntas Jogador 2
	
	void aviso2() {
		System.out.println("\n"+ j2.nome + " , responda as questoes corretamente e acumule pontos.");
	}
    //Questão 1040566
	void a2() {
		
		System.out.println("\nQuanto à direção do fluxo de dados, na comunicação entre dois dispositivos no modo \nHalf‐Duplex, cada estação pode transmitir e receber, mas nunca ao mesmo tempo. ?");
		System.out.println("Digite [1 - Certo]/[2 - Errado]");
		System.out.print("\n> ");
		res = resp.nextInt();

		if (res == 1) {
			j2.pontosJ2 = j2.pontosJ2 +10;
			System.out.println("\n" + j2.nome + " Sua resposta esta correta" + "\n" + "Voce possui:" + j2.pontosJ2 + " pontos");
		} else {
			System.out.println("\n" + j2.nome + " Sua resposta esta errada" + "\n" + "Voce possui:" + j2.pontosJ2 + " pontos");
		}
	}
    //Questão 1031871
	void b2() {
		
		System.out.println("\nEm uma infraestrutura constituída por várias redes de tecnologias diferentes \ninterconectadas, os roteadores têm a função de conectar as redes de mesma tecnologia, cabendo aos switches conectar \naquelas de tecnologias diferentes. ");
		System.out.println("Digite [1 - Certo]/[2 - Errado]");
		System.out.print("\n> ");
		res = resp.nextInt();

		if (res == 2) {
			j2.pontosJ2 = j2.pontosJ2 +10;
			System.out.println("\n" + j2.nome + " Sua resposta esta correta" + "\n" + "Voce possui:" + j2.pontosJ2 + " pontos");
		} else {
			System.out.println("\n" + j2.nome + " Sua resposta esta errada" + "\n" + "Voce possui:" + j2.pontosJ2 + " pontos");
		}
	}
    //Questao 1035259
	void c2() {
		
		System.out.println("\nEm fundamentos de comunicação de dados, são considerados como sinais analógicos os que \nvariam continuamente no tempo e como sinais digitais os que apresentam variação discreta no tempo (descontinuidade). \nOs computadores e as redes de computadores utilizam sinais digitais, sendo que o bit 0, necessariamente, deve ter valor de 0 Volts e o bit 1, o valor igual a 5 Volts. ");
		System.out.println("Digite [1 - Certo]/[2 - Errado]");
		System.out.print("\n> ");
		res = resp.nextInt();

		if (res == 2) {
			j2.pontosJ2 = j2.pontosJ2 +10;
			System.out.println("\n" + j2.nome + " Sua resposta esta correta" + "\n" + "Voce possui:" + j2.pontosJ2 + " pontos");
		} else {
			System.out.println("\n" + j2.nome + " Sua resposta esta errada" + "\n" + "Voce possui:" + j2.pontosJ2 + " pontos");
		}
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
		System.out.println("\nViva o campeao!\nO jogador vencedor foi:");
		
		  if (j1.pontosJ1 > j2.pontosJ2) {

			System.out.println("Parabens " + j1.nome + " voce eh o vencedor(a) com " + j1.pontosJ1 + " pontos.\nContra " + j2.pontosJ2 + " pontos do seu adeversario(a) " + j2.nome + ".");

		} else if (j2.pontosJ2 > j1.pontosJ1) {

			System.out.println("Parabens " + j2.nome + " voce eh o vencedor(a) com " + j2.pontosJ2 + " pontos.\nContra " + j1.pontosJ1 + " pontos do seu adeversario(a) " + j1.nome + ".");

		} else if (j1.pontosJ1 == j2.pontosJ2) {
			System.out.println("Paraens " + j1.nome + " e " + j2.nome + ",voce terminaram empatados.\n" + j1.nome + " com " + j1.pontosJ1 + " pontos.\n" + j2.nome + " com " + j2.pontosJ2 + " pontos.");
		}
	}	

//Outras Questoes

        //Questão 1035260
        void a3() {
		
		System.out.println("\nEm fundamentos de comunicação de dados, para que os sinais analógicos sejam tratados/processados \npor ambientes computacionais digitais, deve‐se realizar a digitalização dos sinais analógicos. Nesse processo, \no sinal digital irá representar fielmente, por uma combinação de zeros e uns, todos os pontos da curva do sinal \nanalógico original, justificando o fato de ter mais qualidade e clareza na reprodução. ");
		System.out.println("Digite [1 - Certo]/[2 - Errado]");
		System.out.print("\n> ");
		res = resp.nextInt();

		if (res == 2) {
			j2.pontosJ2 = j2.pontosJ2 +10;
			System.out.println("\n" + j2.nome + " Sua resposta esta correta" + "\n" + "Voce possui:" + j2.pontosJ2 + " pontos");
		} else {
			System.out.println("\n" + j2.nome + " Sua resposta esta errada" + "\n" + "Voce possui:" + j2.pontosJ2 + " pontos");
		}
    }
		
		//Questão 1024350
		void b3() {
		
		System.out.println("\nA ethernet é um tipo de tecnologia de acesso utilizado nas redes LAN.");
		System.out.println("Digite [1 - Certo]/[2 - Errado]");
		System.out.print("\n> ");
		res = resp.nextInt();

		if (res == 1) {
			j2.pontosJ2 = j2.pontosJ2 +10;
			System.out.println("\n" + j2.nome + " Sua resposta esta correta" + "\n" + "Voce possui:" + j2.pontosJ2 + " pontos");
		} else {
			System.out.println("\n" + j2.nome + " Sua resposta esta errada" + "\n" + "Voce possui:" + j2.pontosJ2 + " pontos");
		}
	}
	
        //Questão 1025679
		void c3() {
		
		System.out.println("\nEm uma rede de computadores, o acesso remoto a programas, equipamentos, impressoras e dados, \nindependentemente da localização física desses recursos e dos próprios usuários, é possível mediante \na utilização de ");
		System.out.println("[1 - becape corporativo]\n[2 - controle de acesso logico]\n[3 - gerenciamento de contas]\n[4 - processamento centralizado]\n[5 - compartilhamento de recursos]");
		System.out.print("\n> ");
		res = resp.nextInt();

		if (res == 5) {
			j2.pontosJ2 = j2.pontosJ2 +10;
			System.out.println("\n" + j2.nome + " Sua resposta esta correta" + "\n" + "Voce possui:" + j2.pontosJ2 + " pontos");
		} else {
			System.out.println("\n" + j2.nome + " Sua resposta esta errada" + "\n" + "Voce possui:" + j2.pontosJ2 + " pontos");
		}
    }
		
		//Questão 1025680
		void d3() {
		
		System.out.println("\nDo ponto de vista da comunicação entre computadores, a Internet é tecnicamente baseada em ");
		System.out.println("[1 - comutação de células.]\n[2 - comutação de circuitos.]\n[3 - rótulos de comutação.]\n[4 - comutação de pacotes. ]\n[5 - comutação de mensagens.]");
		System.out.print("\n> ");
		res = resp.nextInt();

		if (res == 4) {
			j2.pontosJ2 = j2.pontosJ2 +10;
			System.out.println("\n" + j2.nome + " Sua resposta esta correta" + "\n" + "Voce possui:" + j2.pontosJ2 + " pontos");
		} else {
			System.out.println("\n" + j2.nome + " Sua resposta esta errada" + "\n" + "Voce possui:" + j2.pontosJ2 + " pontos");
		}
    }

}
