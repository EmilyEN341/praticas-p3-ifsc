package pratfixIII;

public class ContaCorrenteMain {
	public static void main(String[] args) {
		ContaCorrente c = new ContaCorrente();
		c.nomeTitular = "Emily Elisabeth Neves";
		c.cpf = 11077090919l;
		c.numConta = 123454321l;
		c.saldo = 1000.0;

		c.mostrarDados();

		c.deposit(300.0);
		c.sacar(100.0);

		c.mostrarDados();

	}
}