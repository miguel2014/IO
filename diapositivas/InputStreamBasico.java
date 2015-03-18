package diapositivas;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringBufferInputStream;

@SuppressWarnings("deprecation")
public class InputStreamBasico {
	public static void main(String[] args) {
		String frase1="Esto";
		StringBufferInputStream in1=new StringBufferInputStream(frase1);

		String frase2="Esto es una frase";
		StringBufferInputStream in2=new StringBufferInputStream(frase2);
		int c;
		c=in1.read(); System.out.println(c+" "+(char)c);
		c=in1.read(); System.out.println(c+" "+(char)c);
		c=in1.read(); System.out.println(c+" "+(char)c);
		c=in1.read(); System.out.println(c+" "+(char)c);
		c=in1.read(); System.out.println(c+" "+(char)c);
		System.out.println("=======================================");
		//int c=in.read();
		//System.out.println(c);
		//System.out.println((char)c);
		while ((c=in2.read())!=-1) {
			System.out.println(c+" "+(char)c);	
		}
		System.out.println("=======================================");
		
		String frase3="Esto avdñ,:avdascxz";
		byte[] arraybytes=frase3.getBytes();
		System.out.println(arraybytes[0] +" "+(char) arraybytes[0]);
		ByteArrayInputStream in3=new ByteArrayInputStream(arraybytes, 2, 10);
		while ((c=in3.read())!=-1) {
			System.out.println(c +" "+(char) c);	
		}
		try {
			in1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			in2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
