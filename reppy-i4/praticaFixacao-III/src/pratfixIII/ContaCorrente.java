package pratfixIII;

public class ContaCorrente {
	public String nomeTitular;
	public Long cpf;
	public Long numConta;
	public Double saldo;

	public void deposit(Double depo) {
		saldo = saldo + depo;
	}

	public Double sacar(Double valorSaque) {
		double retornoSaque = 0;

		if (valorSaque > saldo) {
			System.out.println("Saldo insuficiente!");
		} else {
			saldo = saldo - valorSaque;
			retornoSaque = valorSaque;
		}
		return retornoSaque;
	}

	public void mostrarDados() {
		System.out.println("Titular:" + nomeTitular);
		System.out.println("Cpf:" + cpf);
		System.out.println("Conta:" + numConta);
		System.out.println("Saldo Conta:" + saldo);
	}

}