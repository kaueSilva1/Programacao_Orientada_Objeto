package uscs;

public class Teste {
	public static void main(String[] args){
		Empregado empegrado1 = new Empregado("Michael Pedro","Analista de Quaidade",3508.000);

		Empregado empregado2 = new Empregado();
		empregado2.setNome("Maria Merge");
		empregado2.setCargo("Auxiliar Tecnico");
		empregado2.setSalario(1200.00);
		empregado2.ImprimeEmpregado();
		empregado2.TotalEmpregados();
		}
		}