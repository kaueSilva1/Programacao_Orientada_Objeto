package LojaTI;

public class TesteComputador {
	public static void main(String[] args) {
		 Teclado t = new Teclado (1232, "Loghtech","preto");
		 Monitor mon = new Monitor("AFB876","Samsung","preto" );
		 Gabinete g = new Gabinete("4587HHY","Loghtech","preto");
		 Mouse m = new Mouse("HGY6654","Microsoft","preto");
		 Computador cp = new Computador("76TRDE35");
		 cp.ImprimeComputador();
		 t.ImprimeTeclado();
		 mon.ImprimeMonitor();
		 g.ImprimeGabinete();
		 m.ImprimeMouse();
		 cp.ImprimeComputador();

		}
}
