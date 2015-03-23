package diapositivas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader2 {

	public static void main(String[] args) {
		//solo para archivos de texto
		File inFile = new File("/home/matinal/nombres_mujer.txt");
		//stream elegido FileReader, lo envolvemos con BufferedReader
		//Lo vamos a escribir en un fichero:
		File outFile = new File("/home/matinal/nombres_mujer_back.txt");
		//lectura del mismo
		//Trabajamos con jdk 7 nos permite iniciar los stream en el bloque try catch
		//y no hace falta cerrarlos en un bloque finally
		try (BufferedReader in=new BufferedReader(new FileReader(inFile));
			BufferedWriter out=new BufferedWriter(new FileWriter(outFile))){
				String lineaLeida;
				while ((lineaLeida=in.readLine())!=null) {
					out.write(lineaLeida+"\n");
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Termina el programa");
	}
}
