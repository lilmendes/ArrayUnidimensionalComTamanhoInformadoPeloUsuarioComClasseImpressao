package pacote;

public class Impressao {
	public static void imprimir(String str) {//classe para imprimir em string
		System.out.print(str); 
	}
	public static void imprimir(double str) {//classe para imprimir em double
		System.out.printf("%.2f", str);
	}		   
	public static void imprimir(int str) {   //classe para imprimir em int
		System.out.print(str); 
	}

	public static void imprimir(double[] vet1) {//método para imprimir todos os elementos de vetores em double. 
		for (int i = 0; i<vet1.length ;i++) {
			System.out.println(" elemento " + (i+1) + " é " + vet1[i]);	
		}
	}
		public static void imprimir(String[]vet1) {//método para imprimir todos os elementos de vetores em string. 
			for (int i = 0; i<vet1.length ;i++) {
				System.out.println(" elemento " + (i+1) + " é " + vet1[i]);	
			}
	}
			public static void imprimir(int[]vet1) {//método para imprimir todos os elementos de vetores em string. 
				for (int i = 0; i<vet1.length ; i++) {
					System.out.print(vet1[i] + (" "));	

		}	
}	//Criando um novo método para imprimir todos os elementos dos vetores. 
}
