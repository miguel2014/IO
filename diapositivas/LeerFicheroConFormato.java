package diapositivas;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeerFicheroConFormato {
@SuppressWarnings("deprecation")
public static void main(String[] args) {
	//Fichero de entrada:
	File inFile=new File("/home/matinal/nombres_mujer.txt");
	//Stream elegido:dataInputStream porque contiene datos con formato en este caso String
	DataInputStream in=null;
	//Abrimos el stream ,usamos el buffer y fileinputStream
	try {
		in=new DataInputStream(new BufferedInputStream(new FileInputStream(inFile)));
		//leemos string
		String leido;
		while((leido=in.readLine())!=null) //no se usa porque tenemos clases de stream para character streamreader
			System.out.println(leido);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally{
		if (in!=null)
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
}
