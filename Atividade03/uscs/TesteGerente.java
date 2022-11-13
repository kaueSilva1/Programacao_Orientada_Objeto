package uscs;

public class TesteGerente {
	public static void main(String[] args) {
		System.out.println("---------------Funcionario----------------------");
		Empregado e = new Empregado("Antonio", "Rua Brasil, 130", 50, 230, 0);
		e.MostrarEmpregado();
		e.MostrarSalario();
		System.out.println("----------------Gerente-------------------------");
		Gerente b = new Gerente("Carlos", "Rua Silvio Torres, 36", 50, 230, 0);
		b.MostrarGerente();
		b.MostrarSalario2();

		System.out.println("------------------Secretária---------------------");
		Gerente recp = new Gerente("Ana", "Rua Oliveira Lima,99", 25, 150, 0);
		recp.MostrarSecretaria();
		recp.MostrarSalario2();
	}
}