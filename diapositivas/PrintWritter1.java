package diapositivas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class PrintWritter1 {
	public static void main(String[] args) {
		String texto="Esto es un texto  que vamos a enviar al fichero ¥ñÓ\n";
		File inFile = new File("/home/matinal/nombres_mujer.txt");
		File outFile = new File("/home/matinal/nombres.txt");
		
		//Vamos a añadir a un flujo de salida el string texto y las 10 primeras lineas
		//de infile
		//Trabajamos try catch con jdk 7
		try (BufferedReader in=new BufferedReader(new FileReader(inFile));
			PrintWriter out=new PrintWriter(outFile, "UTF-8")){
				//uso readLine que suministra bufferedreaader en la lectura del fichero
				//uso write para escribir los String
			out.write(texto);
			//Vamos a añadir 10 lineas del archivo de entrada 
			String lineaLeida;
			List <String> lista=new ArrayList<String>();
			for (int i = 0; i < 10; i++) {
				lineaLeida=in.readLine();
				if (lineaLeida==null)
					break;
				out.write(lineaLeida+"\n");
				lista.add(lineaLeida);
			}
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		System.out.println("Termina lectura/escritura");
	}
}
