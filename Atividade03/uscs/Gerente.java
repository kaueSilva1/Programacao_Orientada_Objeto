package uscs;

public class Gerente extends Empregado {

	public Gerente(String Nome, String Endereco, double ValorHora, int QtHora, double Salario) {

		super(Nome, Endereco, ValorHora, QtHora, Salario);
	}

	public void MostrarGerente() {

		System.out.println("\nGerente: " + Nome + " " + "\nEndereco: " + Endereco + " " + "\nValor Horas: " + ValorHora
				+ " " + "\nQuantidade horas feitas: " + QtHora);

	}

	public void MostrarSecretaria() {
		System.out.println("\nFuncionario(a): " + Nome + " " + "\nEndereco: " + Endereco + " " + "\nValor Horas: "
				+ "R$" + ValorHora + " " + "\nQuantidade Horas feitas: " + QtHora);

	}

	protected void MostrarSalario2() {
		Salario = (QtHora*ValorHora) + 2000;
		System.out.println("Salario com Bonus: " + "R$" + Salario);
	}

}