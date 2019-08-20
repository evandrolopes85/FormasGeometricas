package evandro.exercicio;

import java.util.Scanner;

public class TestaFormas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int quant;
		
		System.out.println("Quantas formas deseja criar?");
		quant = Integer.parseInt(teclado.nextLine());
		
		FormaGeometrica[] formas = new FormaGeometrica[quant];
		
		for(int i = 0; i < formas.length; i++) {
			//char ch;
			System.out.println("Qual forma deseja criar?\n\t1-Quadrado\n\t2-Retangulo\n\t3-Circulo");
			quant = Integer.parseInt(teclado.nextLine());
			switch(quant) {
				case 1 :
					System.out.println("Digite o valor do lado");
					formas[i] = new Quadrado(Double.parseDouble(teclado.nextLine()));
					break;
				case 2 : 
					double base = 0.0;
					double altura = 0.0;
					System.out.println("Digite o valor da base");
					base = Double.parseDouble(teclado.nextLine());
					System.out.println("Digite o valor da altura");
					altura = Double.parseDouble(teclado.nextLine());
					formas[i] = new Retangulo(base,altura);
				break;
				case 3 : 
					System.out.println("Digite o valor do raio");
					formas[i] = new Circulo(Double.parseDouble(teclado.nextLine()));
			}
		}
		
		for(FormaGeometrica f : formas) {
			System.out.println(f.toString());
			System.out.printf("Area %.2f\n",f.calculaArea());
			System.out.printf("Perimetro %.2f\n", f.calculaPerimetro());
			
			System.out.println();
		}
	}

}
