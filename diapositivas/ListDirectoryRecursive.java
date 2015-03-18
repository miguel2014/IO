package diapositivas;

import java.io.File;

public class ListDirectoryRecursive {
	//Si da fallo es por el tema de permisos en Ubuntu
	public static void main(String[] args) {
		// TODO Auto-generatd method stub
		long inicio = System.nanoTime();
		if (args.length==0) {
			System.out.println("no hay argumentos");
			System.exit(1); //Manda a la linea un 1 y no continua el programa
		}
		File fichero = new File(args[0]);
		if (fichero.isDirectory()) {
			listaArchivosRecursivamente(fichero);
		}
		else
			System.out.println(fichero.getAbsolutePath());
		long fin = System.nanoTime();
		System.out.println("Tiempo de ejecucion "+(fin-inicio)/1000000+" ms");
	}
	public static void listaArchivosRecursivamente(File dir){
		File[] listaArchivos = dir.listFiles();
		for (File file : listaArchivos) {
			if (file.isDirectory()) 
				listaArchivosRecursivamente(file);
			System.out.println(file.getAbsolutePath());
		}
	}
}
