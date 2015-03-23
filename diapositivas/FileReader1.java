package diapositivas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader1 {

	public static void main(String[] args) {
		//solo para archivos de texto
		File inFile = new File("/home/matinal/nombres_mujer.txt");
		//stream elegido FileReader, lo envolvemos con BufferedReader
		BufferedReader in =null;
		//Lo vamos a escribir en un fichero:
		File outFile = new File("/home/matinal/nombres_mujer_back.txt");
		BufferedWriter out = null;
		//lectura del mismo
		try {
			in =new BufferedReader(new FileReader(inFile));
			out = new BufferedWriter(new FileWriter(outFile));
			//usamos el int para leer el código del caracter
			int c;
			while ((c=in.read())!=-1)
					out.write(c);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (in != null)
				try {
						in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}