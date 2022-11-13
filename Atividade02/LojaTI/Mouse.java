package LojaTI;

public class Mouse {
	private String cod;
	 private String fabricante;
	 private String cor;

	 public Mouse(String cod,String cor, String fabricante){
	 this.cod = cod;
	 this.fabricante = fabricante;
	 this.cor = cor;
	 }
	 public Mouse(){
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

	 public void ImprimeMouse(){
	 System.out.println(cod);
	 System.out.println(cor);
	 System.out.println(fabricante);
	 }
	}
