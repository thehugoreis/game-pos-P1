
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

class ex10 {
	public static void main (String[] args)  throws IOException{
		Scanner resp = new Scanner(System.in);
		Mensagem msg = new Mensagem();
		exnAleat2 rnd = new exnAleat2();
		perguntas pgt = new perguntas();
		Jogador1 J1 = new Jogador1();
		Jogador2 J2 = new Jogador2();
		menuInicial menIni = new menuInicial();

		int res;
		int numJogadores = 1;
		int checagem = menIni.checagem;

		//inicia o jogo enquanto a variavel telaIni na classe menuInicial for igual a um.
		while (menIni.telaIni == 1) {

			if (menIni.menuInicial == 0) { //Caso a variavel menuInicial for igual a zero eh mostrado na tela o menu inicial.
				menIni.telaBoasvindas(); 
			} else if (menIni.menuInicial == 1) {    //Caso a variavel menuInicial for igual a um eh apresentado a descricao do jogo.
				menIni.desc(); 

			} else if (menIni.menuInicial == 2) { //Caso a variavel menuInicial for igual a dois instrucoes de como jogar sao mostradas.
				menIni.cjogar(); 

			} else if (menIni.menuInicial == 3) {    //Caso a variavel menuInicial for igual a tres o jogo inicia.
				if (checagem == 1) {
                    System.out.println("\n**********************************************************************************\n");
					System.out.println("Nesta sessao jogaram [1] um jogador ou [2] dois jogadores?");
					System.out.print("\n> ");
					numJogadores = resp.nextInt(); // Pergunta e registra numero de jogadores.

					//Caso o numero de jogadores for igual a um o bloco de perguntas para um jogador inicia.
					if (numJogadores == 1) {

						pgt.jgd1();//Metodo que pergunta e registra o nome/nick do jogador e define pontos igual a zero.

						while (checagem == 1) {   //Metodos referentes as perguntas e suas resposta corretas.
							pgt.aviso1();
							pgt.a1();
							pgt.b1();
							pgt.c1();

							pgt.respsomaPontos1();
							pgt.avisoFinal1();
							msg.msgFinal();
							System.exit(0);
						}

					} else if (numJogadores == 2) {  //Caso o numero de jogadores for igual a dois este bloco para dois jogadores inicia.

						//Metodos que perguntam o nome ou nick de cada um dos jogadores.
						pgt.jgd1();
						pgt.jgd2();
						
						while (checagem == 1) {

							pgt.aviso1();
							pgt.a1();
							pgt.b1();
							pgt.c1();

							pgt.aviso2();
							pgt.a2();
							pgt.b2();
							pgt.c2();

							pgt.respsomaPontos2();
							pgt.avisoFinal2();

							msg.msgFinal();
							System.exit(0);
						}

					} 
					else { //Volta para a escolha do numero de jogadores caso a escolha nao seja valida.
						System.out.println("\nOpcao Invalida!\n");
						menIni.resetTojogador();
					}
				}

			} else if (menIni.menuInicial == 4){				//Menu Sobre os autores
				menIni.sobre();
				menIni.resetIni();
				
			} else {				//Volta para o menu inicial caso a escolha de uma opcao nao seja valida.
				System.out.println("\nOpcao invalida!");
				menIni.resetIni();
			}

		}

	}
	
}
