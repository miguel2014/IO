package diapositivas;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StringFile {
	public static void main(String[] args) {
		//Stream entrada String -> ByteArrayInputStream
		String frase="Esto es una frase #ñ 嗨\n";
		//Convertimos a un array de byte
		byte[] array=frase.getBytes();
		//Creamos el inputStream
		ByteArrayInputStream in=new ByteArrayInputStream(array);
		//Vamos a volcar ese flujo de bytes(stream) a un archivo
		//Primero vamos a crear el fichero
		String path="/home/matinal/out.txt";
		File outFile=new File(path);
		//Creamos el flujo de bytes de salida outputStream
		//obviamente sera FileOutputStream
		FileOutputStream out=null;
		try {
			 out=new FileOutputStream(outFile);
			int c;
			while ((c=in.read())!=-1){
				out.write(c);
			}	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if (out !=null){
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (in!=null){
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	
	}
}
