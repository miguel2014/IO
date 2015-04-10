package ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio7 {
	public static void main(String[] args) {
		//Descriptor del fichero de texto
		String path="/home/matinal/Escritorio";
		
		File outFile=new File(path+"/Cadena3.java");
		//Dos ficheros de entrada
		File inFile1=new File(path+"/Cadena1.java");
		File inFile2=new File(path+"/Cadena2.java");
		try (BufferedReader in1=new BufferedReader(new FileReader(inFile1));
				BufferedReader in2=new BufferedReader(new FileReader(inFile2));
				BufferedWriter out=new BufferedWriter(new FileWriter(outFile))) {
			//Vamos a leer String con readLine
			String linea="";
			String texto="";
			String texto1="";
			while ((linea=in1.readLine())!=null){
				texto+=linea+"\n";
			}	
				String definitivo1=texto.substring(0, texto.length()-1);
				out.write(definitivo1);
				out.flush();
				
			while ((linea=in2.readLine())!=null){
				texto1+=linea+"\n";
			}	
			String definitivo2=texto1.substring(0, texto1.length()-1);
			out.write(definitivo2);
			out.flush();
		
				
				
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}
