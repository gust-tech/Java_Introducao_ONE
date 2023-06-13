public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Condicionais");

		int idade = 18;
		int quantPessoas = 3;

		if (idade >= 18) {

			System.out.println("Você tem mais que 18 anos");
			System.out.println("Seja bem vindo");
		} else {
			if (quantiPessoas >= 2) {
				System.out.println("Voce nao tem 18, mas pode entrar, " + "porque está acompanhado");
			} else {

				System.out.println("Infelizmente voce nao pode entrar");
			}

		}
	}
}