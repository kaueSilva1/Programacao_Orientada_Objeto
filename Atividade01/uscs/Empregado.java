package uscs;

public class Empregado {
private String cargo;
private String nome;
private int codigo;
private double salario;

public Empregado(String Cargo, String Nome, double Salario){
nome = Nome;
cargo = Cargo;
salario = Salario;
}
public Empregado(){
}
private static int cod=1;{
this.codigo= cod;
cod++;
}
public void ImprimeEmpregado(){
System.out.printf("Empregado: %s\n\t", nome);
System.out.printf("Cargo: %s\n\t",cargo);
System.out.printf("Codigo: %d\n\t",codigo);
System.out.printf("Salario: %.2f\n\n",salario);
}
public String getNome() {
return nome;
}
public void setNome(String nome) {
this.nome = nome;

}
public String getCargo() {
return cargo;
}
public void setCargo(String cargo) {
this.cargo = cargo;
}
public int getCodigo() {
return codigo;
}
public void setCodigo(int codigo) {
this.codigo = codigo;
}
public double getSalario() {
return salario;
}
public void setSalario(double salario) {
this.salario = salario;
}
public void TotalEmpregados(){
System.out.printf("Total de empregados %s",codigo);
}
}