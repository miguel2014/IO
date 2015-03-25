package diapositivas;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class AccesoAleatorio {

	public static void main(String[] args) {
		//Definimos el fichero de acceso aleatorio
		//Usando jdk 1.7 no hace falta cerrar el flujo
		try  (	RandomAccessFile fichero=new RandomAccessFile("/home/matinal/random.txt","rw");
				){
			//Inicialmente el puntero se encuentra en 0 .
			//Todo lo que escriba cambia los valores inicales
			System.out.println("Puntero inicial en "+fichero.getFilePointer());
			long tamañoInicialfichero=fichero.length();
			//Muevo el puntero
			fichero.seek(tamañoInicialfichero);
			for (int i = 0; i < 100; i++) {
				fichero.writeInt(i);
			}
			System.out.println("Tamaño del archivo :"+fichero.length());
			System.out.println("Puntero en "+fichero.getFilePointer());
			//Cambiamos la posicion del puntero
			fichero.seek(0);
			System.out.println("Valor en la posicion 0:"+fichero.readInt());
			fichero.seek(4);
			fichero.writeInt(11);
			fichero.seek(4);
			System.out.println("Valor en la posicion 1 :"+fichero.readInt());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
