package co.yohan.gms.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import co.yohan.gms.utilities.Utilities;

/**
 * Clase SudokuCSVDAO - Clase que guarda y carga un archido de numeros
 * 
 * @version 1.0 - 20/10/2018
 * @author Yohan Caro
 *
 */
public class SudokuCSVDAO {
	
	/**
	 * Guarda una lista de matrices en un archico
	 * @param list
	 * @param ruta
	 * @throws IOException
	 */
	public void escribirList(ArrayList<int[][]> list, String ruta) throws IOException {
		
		if (list != null && !list.isEmpty()) {
			File  file = new File(ruta);
			FileOutputStream outputStream = new FileOutputStream(file);
			OutputStreamWriter writer = new OutputStreamWriter(outputStream);
			
			for (int[][] is : list) {
				writer.write(Utilities.matToString(is) + " ");
			}
			
			writer.close();
			outputStream.close();
		}
	}
	
	/**
	 * Clase que lee una lista de matrices
	 * @param ruta
	 * @return
	 * @throws IOException
	 */
	public ArrayList<int[][]> leerList(String ruta) throws IOException {
		ArrayList<int[][]> list = new ArrayList<>();
		
		int[][] mat = new int[9][9];
		BufferedReader br = new BufferedReader(new FileReader(ruta));
		String linea = br.readLine();	
	    
	    String[] vector = linea.split(" ");	 
	    	
	    for (int i = 0; i < 20; i++) {
			mat = Utilities.stringToMatriz(vector[i], ' ');
		    list.add(mat);
		}
	    
   	 	br.close();
		
		return list;
	}
	


}
