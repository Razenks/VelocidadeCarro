import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Carro carro = new Carro();
		
		System.out.println("Qual é a marca do seu carro? ");
		String marca = sc.next();
		carro.setMarca(marca);
		
		System.out.println("Qual é o modelo do seu carro? ");
		String modelo = sc.next();
		carro.setModelo(modelo);
		
		System.out.println("Qual a velocidade atual do seu carro? ");
		Integer velocidadeAtual = sc.nextInt();
		carro.setVelocidadeAtual(velocidadeAtual);
		
		System.out.println("O que deseja fazer?");
		System.out.println("[1]Acelerar");
		System.out.println("[2]Frear");
		System.out.println("[3]Exibir velocidade");
		System.out.println("[0]Sair");
		
		int opcao = sc.nextInt();
		
		while(opcao!=0) {
			switch(opcao) {
			case 1:
				System.out.println("O quanto deseja acelerar? ");
				int acelerar = sc.nextInt();
				carro.acelerarCarro(acelerar);
				break;
			case 2:
				System.out.println("O quanto deseja frear? ");
				int frear = sc.nextInt();
				carro.frearCarro(frear);
				break;
				case 3:
				System.out.println("Essa é a sua velocidade atual: " +carro.getVelocidadeAtual());
				break;
			default:
				System.out.println("Numero Invalido");
			}
		System.out.println("O que deseja fazer?");
		System.out.println("[1]Acelerar");
		System.out.println("[2]Frear");
		System.out.println("[3]Exibir velocidade");
		System.out.println("[0]Sair");
		opcao = sc.nextInt();
		}
		

	}

}
