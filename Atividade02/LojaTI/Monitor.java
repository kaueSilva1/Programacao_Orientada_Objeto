package LojaTI;

public class Monitor {
	private String cod;
	 private String cor;
	 private String fabricante;

	 public Monitor(String cod,String cor, String fabricante){
	 this.cod = cod;
	 this.cor = cor;
	 this.fabricante = fabricante;
	 }
	 public Monitor(){
	 }
	 public String getCod() {
	 return cod;
	 }
	 public void setCod(String cod) {
	 this.cod = cod;
	 }
	 public String getCor() {
	 return cor;
	 }
	 public void setCor(String cor) {
	 this.cor = cor;
	 }
	 public String getFabricante() {
	 return fabricante;
	 }
	 public void setFabricante(String fabricante) {
	 this.fabricante = fabricante;
	 }

	 public void ImprimeMonitor(){
	 System.out.println(cod);
	 System.out.println(cor);
	 System.out.println(fabricante);
	 }
}
