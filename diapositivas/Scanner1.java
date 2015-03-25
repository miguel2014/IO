package diapositivas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		//Vamos a leer un archivo
		File inFile=new File("/home/matinal/prueba.txt");
		try (Scanner in=new Scanner(inFile);){
			String valorLeido;
			while (in.hasNext()){
				valorLeido=in.next();
				System.out.println(valorLeido);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
