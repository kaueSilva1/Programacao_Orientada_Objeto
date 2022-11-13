package uscs;

public class Empregado {

	public String Nome;
	public String Endereco;
	public double ValorHora;
	public int QtHora;
	public double Salario;

	public Empregado(String Nome, String Endereco, double ValorHora, int QtHora, double Salario) {

		this.Nome = Nome;
		this.Endereco = Endereco;
		this.ValorHora = ValorHora;
		this.QtHora = QtHora;
		this.Salario = Salario;

	}

	public void MostrarEmpregado() {
		System.out.println("Nome: " + Nome + " " + "\nEndereco: " + Endereco);
	}

	public void CalcularSalario() {
		Salario = (QtHora*ValorHora);
	}

	protected void MostrarSalario() {
		Salario = (QtHora*ValorHora);
		System.out.println("Salario: " + "R$" + Salario);
	}

}