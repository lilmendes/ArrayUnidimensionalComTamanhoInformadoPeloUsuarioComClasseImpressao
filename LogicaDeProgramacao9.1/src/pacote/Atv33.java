package pacote;
import java.util.Scanner;
public class Atv33 {

	public static void main(String[] args) {
		
	int tam = obterValor();
  	int[]c = Obtersequencia(tam);
	Impressao.imprimir(c);
	
	}

public static int[] Obtersequencia(int tam) {
int[]sequencia = new int [tam];
	for (int i = 0; i < sequencia.length;i++) {
	sequencia[i] = i+1;
	
	}
	return sequencia;
	}
public static int obterValor(){
	Scanner sc = new Scanner(System.in); 
	System.out.println("usuario informe o valor");
	   return sc.nextInt();}


}