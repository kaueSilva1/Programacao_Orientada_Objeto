package LojaTI;

public class Computador {
	private String cod;

	 public Computador(String cod){
	 this.cod = cod;
	 }

	 public Computador(){
	 }
	 public String getCod() {
	 return cod;
	 }
	 public void setCod(String cod) {
	 this.cod = cod;
	 }

	 Teclado t = new Teclado();
	 Mouse m = new Mouse();
	 Monitor mon = new Monitor();
	 Gabinete g = new Gabinete();

	 public void ImprimeComputador(){
	 System.out.println(cod);
	 System.out.println(t.getFabricante());
	 System.out.println(m.getFabricante());
	 System.out.println(g.getFabricante());

	 }
}
