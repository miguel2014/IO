package ejercicios;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio2 {
	public static void main(String[] args) {
		//Ficheros de entrada
		File inFile1 =new File("/home/matinal/Escritorio/ejer1a.txt");
		File inFile2 =new File("/home/matinal/Escritorio/ejer1b.txt");
		//Creamos los stream estilo jdk 1.7
		//Usamos buffer para mejorar el rendimiento
		try (BufferedInputStream in1=new BufferedInputStream(new FileInputStream(inFile1));
				DataInputStream in2=new DataInputStream(new BufferedInputStream(new FileInputStream(inFile2)))){
			//Hacemos la lectura
			System.out.println("Caso de FIleInputStream");
			int c;
			while((c=in1.read())!=-1){
				System.out.print(c+" - ");
			}
			System.out.println("\nCaso de DataInputStream");
			//Usamos el metodo available que nos indica los bytes que quedan por leer
			while(in2.available()!=0){
				System.out.print(in2.readInt()+" - ");
			
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
