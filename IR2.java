public class TesteIR2 {

	public static void main(String[] args) {

		double sal = 3800.0;

		if (sal >= 1900.0 && sal <= 2800.0) {
			System.out.println("A aliquota é de 7%");
			System.out.println("Pode deduzir até R$ 142");
		} else if (sal >= 2800.01 && salario <= 3751.0) {
			System.out.println("A aliquota é de 15%");
			System.out.println("Pode deduzir até R$ 350");
		} else if (sal >= 3751.01 && salario <= 4664.0) {
			System.out.println("A aliquota é de 22.5%");
			System.out.println("Pode deduzir até R$ 636");
		}
	}
}

// 1900.0 até 2800.0 o IR é de 7.5% e pode deduzir R$ 142
// 2800.01 até 3751.0 o IR é de 15% e pode deduzir R$ 350
// 3751.01 até 4664.00 o IR é de 22.5% e pode deduzir R$ 636