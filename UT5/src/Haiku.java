import java.util.Arrays;
import java.util.Scanner;


public class Haiku {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String [] versos= new String[40];
		int numVersos=0;
		
		System.out.println("Generador Haiku");
		System.out.println("Escribe versos (*=fin)");
		String verso="";
		
		while(true){
			verso=teclado.nextLine();
			if(!verso.equals("*")){
				versos[numVersos]=verso;
				numVersos++;
			} else break;
		}
		
		System.out.println("Versos leidos");
		System.out.println(Arrays.toString(versos));
		System.out.println(numVersos);
		
		for(int i=0;i<3;i++){
			int aleatorio;
			aleatorio= (int)(Math.random()*numVersos);
			System.out.println(versos[aleatorio]);
		}

	}

}
