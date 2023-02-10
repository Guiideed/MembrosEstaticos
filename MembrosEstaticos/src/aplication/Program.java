package aplication;
import java.util.Scanner;
import java.util.Locale;
import utilidades.Calculo;


public class Program {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println("Insira o valor do raio: ");
		double raio = leitor.nextDouble();
		
		double c = Calculo.circunferencia(raio);
		
		double v = Calculo.volume(raio);
		
		System.out.println("Circunferencia: " + c);
		System.out.println("Volume: " + v);
		System.out.println("Valor de pi " + Calculo.PI);
		
		leitor.close();
		
		
		
	}
	

}
