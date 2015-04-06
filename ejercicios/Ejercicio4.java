package ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
	public static void main(String[] args) {
	//Creamos el descriptor del fichero
	File inFile=new File("/media/matinal/DAM/Programacion/T12 I-O en Java/libros.csv");
	List<Libros> lista=new ArrayList<Libros>();
	
	//Crear el flujo de entrada
	try (BufferedReader in=new BufferedReader(new FileReader(inFile));){
		String linea="";
		Libros libro;//Creo la referencia
		while((linea=in.readLine())!=null){
			String[] campos=linea.split(";");
			libro=new Libros(campos[0],campos[3],campos[6]);
			lista.add(libro);
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	System.out.println(lista);
	}
}
class Libros{
	private String titulo;
	private String autor;
	private String isbn;
	public Libros(String titulo, String autor, String isbn) {
		this.titulo = titulo;
		if (autor.equals(""))
			this.autor ="desconocido";
		else
			this.autor=autor;
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return "Libros [titulo=" + titulo + ", autor=" + autor + ", isbn="
				+ isbn + "]";
	}
	
}