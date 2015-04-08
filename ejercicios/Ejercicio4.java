package ejercicios;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio4 {
	public static void main(String[] args) {
	//Creamos el descriptor del fichero
	File inFile=new File("/media/matinal/DAM/Programacion/T12 I-O en Java/libros.csv");
	List<Libros> lista=new ArrayList<Libros>(); //Lista Total Libros
	//La caracteristica mas importante de las colecciones Set
	// No se pueden repetir los objetos que contienen
	Set <Libros> listaDiezLibros =new HashSet<Libros>();
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
	//System.out.println(lista);

	//Debemos sacar 10 libros al azar y añadirlas a la nueva lista
	//Debemos sacar 10 libros al azar y añadirlas a la nueva lista
		do {
			int posicionLibroLista=(int) (Math.random()*lista.size());
			listaDiezLibros.add(lista.get(posicionLibroLista));
		}while(listaDiezLibros.size()<11);
		System.out.println(listaDiezLibros);
		//Vamos a crear el fichero de salida
		File outFile =new File("/home/matinal/Escritorio/archivo.dat");
		//Creamos el stream de salida
		try (ObjectOutputStream out=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(outFile)));
				){
			out.writeObject(listaDiezLibros);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Vamos a ller los datos del fichero archivo.dat
		//Hay que crear un stream pero de entrada
		try (ObjectInputStream in=new ObjectInputStream(new BufferedInputStream(new FileInputStream(outFile)));
				){
			Set <Libros> objetoLeido=(Set<Libros>) in.readObject();
			System.out.println(objetoLeido);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
}
class Libros implements Serializable{
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
