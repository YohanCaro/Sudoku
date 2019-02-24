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

public class SudokuCSVDAO {
	
	public void escribirList(ArrayList<int[][]> list, String ruta) throws IOException {
		
		if (list != null && !list.isEmpty()) {
			File  file = new File(ruta);
			FileOutputStream outputStream = new FileOutputStream(file);
			OutputStreamWriter writer = new OutputStreamWriter(outputStream);
			
			for (int[][] is : list) {
				writer.write(this.matToString(is) + " ");
			}
			
			writer.close();
			outputStream.close();
		}
	}
	
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
	
	public String matToString(int[][] mat) throws IOException {
		String sal = "";
		for (int i = 0; i < mat.length; i++) {
			sal += "" + mat[i][0] + mat[i][1] +  mat[i][2] +  mat[i][3] + mat[i][4] 
					+ mat[i][5] + mat[i][6] + mat[i][7] + mat[i][8];
		}
		
		return sal;
	}

}
