import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {

		char[][] tabuleiro = {{ ' ', '|', ' ', '|', ' ' }, 
							  { '-', '+', '-', '+', '-' }, 
							  { ' ', '|', ' ', '|', ' ' },
							  { '-', '+', '-', '+', '-' }, 
							  { ' ', '|', ' ', '|', ' ' }};

		int contador = 0;
		boolean venceu = false;
		boolean jogador1 = true;
		char simbolo;

		Scanner scan = new Scanner(System.in);

		System.out.println("Jogo da Velha");
		System.out.println(" ");
		System.out.println("Jogador 1: X ");
		System.out.println("Jogador 2: O ");
		System.out.println(" ");

		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				System.out.print(tabuleiro[i][j]);
			}

			System.out.println(" ");
		}
		
		System.out.println(" ");
		
		while (!venceu) {

			if (jogador1) {
				System.out.print("Jogador 1: Onde deseja jogar? (Entre com numeros 1 a 9) ");
				simbolo = 'X';
			} else {
				System.out.print("Jogador 2: Onde deseja jogar? (Entre com numeros 1 a 9) ");
				simbolo = 'O';
			}

			while (scan.hasNextInt() == false) {
				System.out.println("Entrada invalida. Escolha um numero entre 1 e 9.");
				scan.next();
			}

			int posicao = scan.nextInt();

			if (posicao < 1 || posicao > 9) {
				System.out.println("Entrada invalida. Escolha um numero entre 1 e 9.");
				continue;
			}

			switch (posicao) {
			case 1:
				if (tabuleiro[0][0] == ' ') {
					tabuleiro[0][0] = simbolo;
					contador++;
				} else {
					System.out.println("Essa posicao ja foi marcada, tente novamente.");
					continue;
				}
				break;
			case 2:
				if (tabuleiro[0][2] == ' ') {
					tabuleiro[0][2] = simbolo;
					contador++;
				} else {
					System.out.println("Essa posicao ja foi marcada, tente novamente.");
					continue;
				}
				break;
			case 3:
				if (tabuleiro[0][4] == ' ') {
					tabuleiro[0][4] = simbolo;
					contador++;
				} else {
					System.out.println("Essa posicao ja foi marcada, tente novamente.");
					continue;
				}
				break;
			case 4:
				if (tabuleiro[2][0] == ' ') {
					tabuleiro[2][0] = simbolo;
					contador++;
				} else {
					System.out.println("Essa posicao ja foi marcada, tente novamente.");
					continue;
				}
				break;
			case 5:
				if (tabuleiro[2][2] == ' ') {
					tabuleiro[2][2] = simbolo;
					contador++;
				} else {
					System.out.println("Essa posicao ja foi marcada, tente novamente.");
					continue;
				}
				break;
			case 6:
				if (tabuleiro[2][4] == ' ') {
					tabuleiro[2][4] = simbolo;
					contador++;
				} else {
					System.out.println("Essa posicao ja foi marcada, tente novamente.");
					continue;
				}
				break;
			case 7:
				if (tabuleiro[4][0] == ' ') {
					tabuleiro[4][0] = simbolo;
					contador++;
				} else {
					System.out.println("Essa posicao ja foi marcada, tente novamente.");
					continue;
				}
				break;
			case 8:
				if (tabuleiro[4][2] == ' ') {
					tabuleiro[4][2] = simbolo;
					contador++;
				} else {
					System.out.println("Essa posicao ja foi marcada, tente novamente.");
					continue;
				}
				break;
			case 9:
				if (tabuleiro[4][4] == ' ') {
					tabuleiro[4][4] = simbolo;
					contador++;
				} else {
					System.out.println("Essa posicao ja foi marcada, tente novamente.");
					continue;
				}
				break;
			}

			System.out.println(" ");

			for (int i = 0; i < tabuleiro.length; i++) {
				for (int j = 0; j < tabuleiro[i].length; j++) {
					System.out.print(tabuleiro[i][j]);
				}

				System.out.println(" ");
			}

			System.out.println(" ");

			if (contador == 9) {
				System.out.println("Velha!");
				scan.close();
				break;
			}

			for (int i = 0; i < 5; i += 2) {
				if (tabuleiro[i][0] == simbolo && tabuleiro[i][2] == simbolo && tabuleiro[i][4] == simbolo) {
					venceu = true;
					if (jogador1) {
						System.out.println("Jogador 1 venceu!");
						break;
					} else {
						System.out.println("Jogador 2 venceu!");
						break;
					}
				}
			}

			for (int i = 0; i < 5; i += 2) {
				if (tabuleiro[0][i] == simbolo && tabuleiro[2][i] == simbolo && tabuleiro[4][i] == simbolo) {
					venceu = true;
					if (jogador1) {
						System.out.println("Jogador 1 venceu!");
						break;
					} else {
						System.out.println("Jogador 2 venceu!");
						break;
					}
				}
			}

			if (tabuleiro[0][0] == simbolo && tabuleiro[2][2] == simbolo && tabuleiro[4][4] == simbolo) {
				venceu = true;
				if (jogador1) {
					System.out.println("Jogador 1 venceu!");
					break;
				} else {
					System.out.println("Jogador 2 venceu!");
					break;
				}
			}

			if (tabuleiro[0][4] == simbolo && tabuleiro[2][2] == simbolo && tabuleiro[4][0] == simbolo) {
				venceu = true;
				if (jogador1) {
					System.out.println("Jogador 1 venceu!");
					break;
				} else {
					System.out.println("Jogador 2 venceu!");
					break;
				}

			}

			jogador1 = !jogador1;
		}
	}

}