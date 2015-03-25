package diapositivas;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase="Un\tNombre,33,true,444.2";
		Scanner in=new Scanner(frase);
		in.useDelimiter("\\s*,\\s*");
		String nombre=in.next();
		int edad=in.nextInt();
		boolean condicion=in.nextBoolean();
		double dinero=in.nextDouble();
		System.out.println("l");
		System.out.println("Nombre "+nombre + " edad "+ edad +" condicion "+condicion + " dinero "+dinero);
		in.close();
		
	}

}
