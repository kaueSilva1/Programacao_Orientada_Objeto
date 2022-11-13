package LojaTI;

public class Teclado {
	private int cod;
	 private String fabricante;
	 private String cor;
	 public Teclado(int cod,String cor, String fabricante){
	 this.cod = cod;
	 this.cor = cor;
	 this.fabricante = fabricante;
	 }
	 public Teclado(){
	 }
	 public int getCod() {
	 return cod;
	 }
	 public void setCod(int cod) {
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

	 public void ImprimeTeclado(){
	 System.out.println(cod);
	 System.out.println(cor);
	 System.out.println(fabricante);
	 }
	}
