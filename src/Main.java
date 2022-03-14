import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();

		int opcao = 0;
		while (opcao != 5) {
			System.out.println("          Seja bem vindo ao Samuel Banks");
			System.out.println();
			System.out.println("Escolha uma opção abaixo para iniciarmos o Atendimento:");
			System.out.println();
			System.out.println("1-Abertura Conta");
			System.out.println("2-Depósito");
			System.out.println("3-Saque");
			System.out.println("4-Extrato");
			System.out.println("5-Sair");
			System.out.println();
			opcao = entrada.nextInt();
			System.out.println();
			switch (opcao) {

			case 1:
				System.out.println("Escolha tipo de conta: ");
				System.out.println("1-Conta Corrente");
				System.out.println("2-Conta Poupança");
				int tipoConta = entrada.nextInt();
				if (tipoConta == 1) {
					System.out.println();
					System.out.println("Digite seu nome");
					entrada.nextLine();
					String nome = entrada.nextLine();
					Cliente titular = new Cliente();
					titular.setNome(nome);

					cc = new ContaCorrente(titular);
					cc.imprimirExtrato();
					System.out.println();
				} else if (tipoConta == 2) {
					System.out.println();
					System.out.println("Digite seu nome");
					entrada.nextLine();
					String nome = entrada.nextLine();
					Cliente titular = new Cliente();
					titular.setNome(nome);

					cp = new ContaPoupanca(titular);
					cp.imprimirExtrato();
					System.out.println();

				}
				break;
			case 2:
				System.out.println("Escolha tipo de conta: ");
				System.out.println("1-Conta Corrente");
				System.out.println("2-Conta Poupança");
				int tipoDep = entrada.nextInt();
				if (tipoDep == 1) {
					System.out.println();
					System.out.println("Entre com valor: ");
					entrada.nextLine();
					double dep = entrada.nextDouble();
					cc.depositar(dep);
					cc.imprimirExtrato();
					System.out.println();
				} else if (tipoDep == 2) {
					System.out.println();
					System.out.println("Entre com valor: ");
					entrada.nextLine();
					double dep = entrada.nextDouble();
					cp.depositar(dep);
					cp.imprimirExtrato();
					System.out.println();
				}
				break;
			case 3:
				System.out.println("Escolha tipo de conta: ");
				System.out.println("1-Conta Corrente");
				System.out.println("2-Conta Poupança");
				int tipoSaq = entrada.nextInt();
				if (tipoSaq == 1) {
					System.out.println();
					System.out.println("Entre com valor: ");
					entrada.nextLine();
					double saq = entrada.nextDouble();
					cc.sacar(saq);
					cc.imprimirExtrato();
					System.out.println();
				} else if (tipoSaq == 2) {
					System.out.println();
					System.out.println("Entre com valor: ");
					entrada.nextLine();
					double saq = entrada.nextDouble();
					cp.sacar(saq);
					cp.imprimirExtrato();
					System.out.println();
				}
				break;
			case 4:
				System.out.println("Escolha tipo de conta: ");
				System.out.println("1-Conta Corrente");
				System.out.println("2-Conta Poupança");
				int tipoExt = entrada.nextInt();
				if (tipoExt == 1) {
					System.out.println();

					cc.imprimirExtrato();
					System.out.println();
				} else if (tipoExt == 2) {
					System.out.println();

					cp.imprimirExtrato();
					System.out.println();
				}
				break;
			case 5:

				System.out.println();
				System.out.println("Obrigado pela preferência.");
				System.out.println();

			default:

				if (opcao != 5) {
					System.out.println();
					System.out.println("Entre com um valor válido.");
					System.out.println();
				}

			}

		}
		entrada.close();
	}

}
