package ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio6 {
	public static void main(String[] args) {
		//Descriptor del fichero de texto
		String path1="/media/matinal/DAM/Programacion/T6 Estructuras de control/Ejercicios";
		String path2="/home/matinal/Escritorio";
		
		File inFile=new File(path1+"/Cadena.java");
		//Dos ficheros de salida
		File outFile1=new File(path2+"/Cadena1.java");
		File outFile2=new File(path2+"/Cadena2.java");
		//Creamos un array de 1024 bytes de tipo char
		char[] parte1=new char[1024];//Añadimos la primera parte del fichero
		//Tamaño del segundo array es el tamaño del fichero menos el tamaño del primer array
		char[] parte2=new char[(int) (inFile.length()-parte1.length)];
		
		//Stream de lectura y escritura
		try (BufferedReader in=new BufferedReader(new FileReader(inFile));
				BufferedWriter out1=new BufferedWriter(new FileWriter(outFile1));
				BufferedWriter out2=new BufferedWriter(new FileWriter(outFile2))
				){
			//Añadir los primeros 1024 al array
			in.read(parte1);
			//Escribimos en el fichero de salida1
			out1.write(parte1);
			out1.flush();
			//El resto al segundo array
			in.read(parte2, parte1.length, parte2.length);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}
