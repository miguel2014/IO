package diapositivas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class FileString {
	public static void main(String[] args) {
		//Recepcionar un flujo de bytes desde un archivo
		//Escogemos como inputStream FileInputStream
		//previamente debemos crear un objeto File
		String path="/home/matinal/out.txt";
		File inFile=new File(path);
		FileInputStream in=null;
		String textoARecibir="";
		try {
			in=new FileInputStream(inFile);
			int c;
			while ((c=in.read())!=-1)
				textoARecibir+=(char)c;
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
		System.out.println(textoARecibir);
		
	}
}
