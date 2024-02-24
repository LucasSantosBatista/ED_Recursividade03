package view;
import controller.VetorController;

public class Main {
	public static void main (String[] arqs) {
		int vetor[] = {2, 6, 7, 1, 9 , 4};
		int tamanho = vetor.length;
		
		VetorController vCont = new VetorController();
		int soma = vCont.somaVetor(vetor, tamanho);
		System.out.println(soma);
	}
}
