package diapositivas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GuardarObjetos {
	public static void main(String[] args) {
		
	
	List<Personas> listado=new ArrayList<Personas>();
	Personas p1=new Personas("hola1",5);
	Personas p2=new Personas("hola2",6);
	Personas p3=new Personas("hola3",7);
	Personas p4=new Personas("hola4",8);
	Personas p5=new Personas("hola5",9);
	listado.add(p1);
	listado.add(p2);
	listado.add(p3);
	listado.add(p4);
	listado.add(p5);
	//Vamos a guardar esa lista en un fichero
	//Primero creamos el objeto
	try (ObjectOutputStream out1=new ObjectOutputStream(new FileOutputStream(
			new File("/home/matinal/objeto.dat")));){
		out1.writeObject(listado);
	} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println("Termina el programa");
}
}
class Personas implements Serializable{
	private String nombre;
	private int edad;
	public Personas(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "GuardarObjetos [nombre=" + nombre + ", edad=" + edad + "]";
	}		
	
}
