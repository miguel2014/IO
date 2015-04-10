package ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Date;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		//Fichero de entrada 
		File inFile=new File("/home/matinal/Escritorio/geografia1.csv");
		//Al ser fichero de texto uso Scanner para ller
		try (
				Scanner in=new Scanner(inFile);){
			in.useDelimiter(";");
			String id=in.next();
			String latitude=in.next();
			String longitude=in.next();
			String elevation=in.next();
			String name=in.next();
			String url=in.next();
			String year=in.next();
			String leido="";
			double longitudDouble,latitudDouble;
			int altitudInt;
			while(in.hasNext()){
				latitude=in.next();
				latitudDouble=Double.parseDouble(latitude);
				/*longitude=in.next();
				longitudDouble=Double.parseDouble(longitude);
				elevation=in.next();
				altitudInt=Integer.parseInt(elevation);
				name=in.next();
				url=in.next();
				year=in.next();
				*/
				
				}
		} catch (FileNotFoundException  |NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
class Localidad{
	private String id;
	private double latitude;
	private double longitude;
	private int elevation;
	private String name;
	private String url;
	private String year;
	public Localidad(String id, double latitude, double longitude,
			int elevation, String name, String url, String year) {
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
		this.elevation = elevation;
		this.name = name;
		this.url = url;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Localidad [id=" + id + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", elevation=" + elevation
				+ ", name=" + name + ", url=" + url + ", year=" + year + "]";
	}
	
	
}