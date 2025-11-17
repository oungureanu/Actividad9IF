package Actividad;
import java.util.Scanner;
import java.io.*;
public class ExamenOcta {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner (System.in);
		
		File file =new File ("C:\\Users\\octa\\Desktop\\pruebaexamen\\DatosIgualdad.csv");
		Scanner scfile=new Scanner (file);
		String linea=scfile.nextLine();
		int cont=0;
		
		while (scfile.hasNextLine()) {
			linea=scfile.nextLine();
			cont++;
		}
		
		String[] campos=null;
		String [] pais =new String [cont];
		String [] ubicacion =new String [cont];
		double [] trabajo= new double [cont];
		double [] dinero= new double [cont];
		double [] conocimiento= new double [cont];		
		double [] tiempo= new double [cont];
		double [] poder= new double [cont];
		double [] salud= new double [cont];
		
		cargarDatos(file,linea,campos,pais,ubicacion,trabajo,dinero,conocimiento,tiempo,poder,salud);
	}

	
	public static void cargarDatos(File file,String linea,String[] campos,String[] pais,String[] ubicacion,double[] trabajo,double[] dinero,double[] conocimiento,double[] tiempo,double[] poder,double[] salud){
		
		int i=0;
		
		try {
			Scanner scfile =new Scanner (file);
			linea=scfile.nextLine();
			while(scfile.hasNextLine()) {
				linea=scfile.nextLine();
				campos=linea.split(";");
				
			    pais[i] =campos [0];
				ubicacion[i]=campos [1];
				trabajo[i]=Double.parseDouble(campos[2]);
				dinero[i]= Double.parseDouble(campos[3]);
				conocimiento[i]= Double.parseDouble(campos[4]);	
				tiempo[i]=Double.parseDouble(campos[5]);
				poder[i]= Double.parseDouble(campos[6]);
				salud[i]=Double.parseDouble(campos[7]);
				i++;
				System.out.println(linea);
				
			}
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error");
		}
		//mas cambio
		//t43ijhtrertyjmrewty
		//linea de prueba
	}
}
