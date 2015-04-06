package ejercicios;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejercicio3 {
	public static void main(String[] args) {
		//Creamoe l fichero de texto donde escribir los numeros
		File outFile1 =new File("/home/matinal/Escritorio/ejer3.txt");
		//Creamos el streamreader para volcar los datos
		try (
				PrintWriter out=new PrintWriter(new BufferedOutputStream(new FileOutputStream(outFile1)),true);){
			//Escribimos los datos
			for (int i = 250; i < 271; i++) {
				//out.write(i);
				out.println(i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Vamos a leer el fichero
		//No hace falta crear un nuevo descriptor de ficheros(file)
		//pero si hay que crear el flujo de entrada
		try (
				BufferedReader in=new BufferedReader(new FileReader(outFile1));){
			String c="";
			while((c=in.readLine())!=null){
				System.out.print(c+" - ");	
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
