import java.util.Scanner;

public class view {

	public static void main(String[] args) {
		String nome = "Vitor Rafael ";
		String conta = "Corrente";
		float Saldo = 2500;
		int operacoes = 0;
		
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("************************************");
		System.out.println("Dados inicias do Cliente: \n");

		System.out.println("Nome:" + nome);
		System.out.println("Tipo de conta: " + conta);
		System.out.println("Saldo inicial: " + Saldo);




		System.out.println("************************************");

		System.out.println("Escolha a opcao deseja:");
		System.out.println("1-Consultar Saldo");
		System.out.println("2-Depositar");
		System.out.println("3-Transferir Saldo");
		System.out.println("4-Sair");
		 operacoes = scanner.nextInt();
		

		

		
		
		switch (operacoes) {
		case 1:
			
			System.out.println("saldo atual = " + Saldo);
			return;
			
		case 2:
			System.out.println("Insira o valor que deseja receber");
			break;
		case 3:
			System.out.println("Insira o valor que deseja trasferir" );
			break;
		
		default:
			break;
		}
		
	
	}

}
