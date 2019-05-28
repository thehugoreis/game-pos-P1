//teste do aleat

import java.util.Scanner;

class test {
	public static void main(String[] args) {
		exnAleat2 rnd = new exnAleat2();
		Scanner resp = new Scanner(System.in);
		perguntas pgt = new perguntas();
		

		int checagem = 1;

		while (checagem == 1) {
			rnd.aleat2();
			int qst = rnd.NROALEAT;
			System.out.println(qst);
			switch (qst) {
				case 1:
					pgt.a1();
					break;
				case 2:
					pgt.b1();
					break;
				case 3:
					pgt.c1();
					break;
				default:
					System.out.println("nao encontrou");
					break;
			}


		}
	}
}
