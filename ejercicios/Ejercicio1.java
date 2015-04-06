package ejercicios;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio1 {
public static void main(String[] args) {
		//Vamos a crear un fichero de salida
		File outFile1 =new File("/home/matinal/Escritorio/ejer1a.txt");
		File outFile2 =new File("/home/matinal/Escritorio/ejer1b.txt");
		//Añadimos un buffer intermedio para mejorar el intermedio
		//Usamos estilo jdk 1.7 se cierran los stream solos
		try (BufferedOutputStream out1=new BufferedOutputStream(new FileOutputStream(outFile1));
				DataOutputStream out2=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(outFile2)))) {
			//Añadimos los 20 numeros al fichero
			for (int i = 20; i < 41; i++) {
				out1.write(i);
				out2.writeInt(i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
