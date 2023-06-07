package conta;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao = 0;

		while (true) {

			System.out.println("********************************************************"
					+ "\n\n                BANCO DO BRAZIL COM Z                \n\n"
					+ "********************************************************");
			System.out.println("\n            1 - Criar Conta" + "\n            2 - Listar todas as Contas"
					+ "\n            3 - Buscar Conta por Numero" + "\n            4 - Atualizar Dados da Conta"
					+ "\n            5 - Apagar Conta" + "\n            6 - Sacar"
					+ "\n            7 - Transferir valores entre Contas" + "\n            8 - Depositar"
					+ "\n            9 - Sair\n");
			System.out.println("********************************************************");
			System.out.println("\n             Entre com a opção desejada:\n");

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("\nBanco do Brazil com Z - O seu futuro começa aqui!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Criar Conta \n\n");

				break;
			case 2:
				System.out.println("Listar todas as Contas \n\n");

				break;
			case 3:
				System.out.println("Consultar dados da Conta \n\n");

				break;
			case 4:
				System.out.println("Atualizar dados da Conta \n\n");

				break;
			case 5:
				System.out.println("Apagar a Conta \n\n");

				break;
			case 6:
				System.out.println("Saque \n\n");

				break;
			case 7:
				System.out.println("Depósito \n\n");

				break;
			case 8:
				System.out.println("Transferência entre Contas \n\n");

				break;
			default:
				System.out.println("\nOpção Inválida\n");
				break;

			}

		}
	}

}
