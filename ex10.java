
import java.util.Scanner;

class ex10 {
	public static void main (String[] args) {
		Scanner resp = new Scanner(System.in);
		Mensagem obj1 = new Mensagem();
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

			if (menIni.menuInicial == 0) {
				menIni.telaBoasvindas(); //Caso a variavel menuInicial for igual a zero eh mostrado na tela o menu inicial.
			} else if (menIni.menuInicial == 1) {
				menIni.desc(); //Caso a variavel menuInicial for igual a um eh apresentado a descricao do jogo.

			} else if (menIni.menuInicial == 2) {
				menIni.cjogar(); //Caso a variavel menuInicial for igual a dois instrucoes de como jogar sao mostradas.

			} else if (menIni.menuInicial == 3) {

				//Caso a variavel menuInicial for igual a tres o jogo comeca.
				if (checagem == 1) {
					System.out.println("\nNesta sessao jogaram [1] um jogador ou [2] dois jogadores?");
					numJogadores = resp.nextInt(); // Pergunta e registra numero de jogadores.

					//Caso o numero de jogadores for igual a um o bloco de perguntas para um jogador inicia.
					if (numJogadores == 1) {

						pgt.jgd1();//Metodo que pergunta e registra o nome/nick do jogador e define pontos igual a zero.

						while (checagem == 1) {
						
							//Metodos referentes as perguntas e suas resposta corretas.
							pgt.a1();
							pgt.b1();
							pgt.c1();

							pgt.respsomaPontos();
							pgt.avisoFinal1();
							obj1.msg();
							System.out.println("\nDeseja voltar ao menu e jogarovamente? [1 - sim]/[2 - nao]");
							int respNjogador = resp.nextInt();//Registra decisao do jogador em jogar novamente ou nao.

							if (respNjogador == 1) {
								System.out.println("\n");//Caso o jogador deseje jogar novamente uma nova linha eh impressa e o loop de perguntas reinicia
								menIni.menuInicial = 0;
								menIni.telaBoasvindas();
							} else if (respNjogador == 2) {
								/*Caso jogador nao deseje jogar novamente a variavel do loop e 
								 *modificada para encerralo, uma mensagem de creditos aparece e o programa eh finalizado.*/
								System.exit(0);

							} else {
								/* Retorna a mensagem de opcao invalida e finaliza o programa*/
								System.out.println("\nOpcao invalida");
								System.exit(0);
							}

						}

					} else if (numJogadores == 2) {

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

							pgt.respsomaPontos();
							pgt.avisoFinal2();

							obj1.msg();
							System.out.println("\nDeseja voltar ao menu e jogarovamente? [1 - sim]/[2 - nao]");
							int respNjogador = resp.nextInt();//Registra decisao do jogador em jogar novamente ou nao.

							if (respNjogador == 1) {
								System.out.println("\n");//Caso o jogador deseje jogar novamente uma nova linha eh impressa e o loop de perguntas reinicia
								menIni.menuInicial = 0;
								menIni.telaBoasvindas();
							} else if (respNjogador == 2) {
								/*Caso jogador nao deseje jogar novamente a variavel do loop e 
								 *modificada para encerralo, uma mensagem de creditos aparece e o programa eh finalizado.*/
								System.exit(0);

							} else {
								/* Retorna a mensagem de opcao invalida e finaliza o programa*/
								System.out.println("\nOpcao invalida");
								System.exit(0);
							}
						}

					} else {
						//Volta para a escolha do numero de jogadores caso a escolha nao seja valida.
						System.out.println("\nOpcao Invalida!\n");
						menIni.resetTojogador();
					}

				}

			} else {
				//Volta para o menu inicial casa a escolha de uma opcao nao seja valida.

				System.out.println("\nOpcao invalida!");
				menIni.resetIni();

			}

		}

	}
	
}
