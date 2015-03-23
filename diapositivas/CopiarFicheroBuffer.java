package diapositivas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiarFicheroBuffer {
public static void main(String[] args) {
	//Originamos los file de entrada y salida
	File infile=new File ("/home/matinal/FUNCIONES.pdf"); //examen.txt
	File outfile=new File ("/home/matinal/nuevo.pdf");
	//Stream elegidos son FileInputStream y FileOutputStream
	//lo definimos como varialbes "globales" para tener acceso desde cualquier bloque
	FileInputStream in=null; //para posteriormente comprobar que es !=-1
	FileOutputStream out=null;
	//Incializamos los dos stream
	try {
		in=new FileInputStream(infile);
		out=new FileOutputStream(outfile);
		//Constrolamos el tiempo de ejecucion
		long inicio=System.nanoTime();
		//Procedemos a la lectura del inputStream
		int c; //recoge los bytes 1 a 1 hasta encontrar -1 que es el fin del stream
		while ((c=in.read())!=-1) {
			//Lo leido del inputStream lo llevamos al outputStream
			//Para ello usamos el metodo write
			out.write(c);
		}
		//Cogemos el final de ejecucion
		long fin=System.nanoTime();
		System.out.println("Fichero copiado en "+ (fin-inicio)/1000000 +" ms");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//Cerramos los flujos
	finally{
		if (in!=null)
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if (out!=null)
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
}
