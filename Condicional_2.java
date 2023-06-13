public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("Condicionais2");

		int idade = 16;
		int quantPessoas = 3;
		boolean acompanhado = quantPessoas >= 2;

		if (idade >= 18 && acompanhado) {

			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Voce nao pode entrar");
		}

	}
}