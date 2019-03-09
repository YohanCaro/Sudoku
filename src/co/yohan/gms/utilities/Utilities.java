package co.yohan.gms.utilities;

import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Clase Utilities - Mucho que comentar (°- °)/
 * 
 * @version 1.3 - 20/10/2018
 * @author Yohan Caro
 *
 */
public class Utilities {
		
	public static void showMessageWarning(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Warning!", JOptionPane.WARNING_MESSAGE);
	}

	public static void showMessageError(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Error!", JOptionPane.ERROR_MESSAGE);
	}
	
	public static void showMessageInfo(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Information!", JOptionPane.INFORMATION_MESSAGE);
	}

	public static Integer convertStringtoInt(String data) {
		try {
			if (data != null && !data.isEmpty()) {
				return Integer.parseInt(data);
			}
		} catch (NumberFormatException e) {
			showMessageError("No se puede convertir la cadena: "+ data +" a numero ");
		}
		return null;
	}
	
	public static Short convertStringToShort(String data) {
		try {
			if (data != null && !data.isEmpty()) {
				return Short.parseShort(data);
			}
		} catch (NumberFormatException e) {
			showMessageError("No se puede convertir la cadena: "+ data +" a numero ");
		}
		return null;
	}
	
	public static Byte convertStringToByte(String data) {
		try {
			if (data != null && !data.isEmpty()) {
				return Byte.parseByte(data);
			}
		} catch (NumberFormatException e) {
			showMessageError("No se puede convertir la cadena: "+ data +" a numero ");
		}
		return null;
	}
	
	public static boolean isNumeric(String cadena) {
        boolean resultado;
        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
        return resultado;
    }
	
	public static String cutLastChars(int n, String cad) {
		String outString = "";
		
		for (int i = 0; i < n; i++) {
			outString += cad.charAt(i);
		}
		
		return outString;
	}
	
	/**
	 * Number random
	 * @param limI
	 * @param limS
	 * @return
	 */
	public static int nRandom(int limI, int limS){
		int numer = (int) (Math.random()*(limI-limS+1)+limS);
		return numer;
	}
	
	public static int contNumberOnArray(int n, int vec[]) {
		int counter = 0;
		for (int i = 0; i < vec.length; i++) {
			if(n == vec[i] && n != 0) {
				counter++;
			}
		}
		return counter;
	}
	
	public static String matToString(int[][] mat) throws IOException {
		String sal = "";
		for (int i = 0; i < mat.length; i++) {
			sal += "" + mat[i][0] + mat[i][1] +  mat[i][2] +  mat[i][3] + mat[i][4] 
					+ mat[i][5] + mat[i][6] + mat[i][7] + mat[i][8];
		}
		
		return sal;
	}
	
	public static boolean isNumberOnArray(int n, int vec[]) {
		return (contNumberOnArray(n, vec) >= 2)?false:true;
	}
	
	public static int contNumberOnMatrix(int n, int mat[][]) {
		int counter = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if(n == mat[i][j])
					counter++;
			}
		}
		return counter;
	}
	
	 /** Extraer fila
	 * @param matriz
	 * @param row
	 * @return
	 */
	public static int[] extraRow(int matriz[][], int row) {
		int vec[] = new int[matriz.length];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (i == row) {
					vec[j] = matriz[i][j];
				}
			}
		}
		return vec;
	}
	
	/**
	 * Extraer una columna
	 * @param matriz
	 * @param col
	 * @return
	 */
	public static int[] extraCol(int matriz[][], int col) {
		int vec[] = new int[matriz.length];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (j == col) {
					vec[i] = matriz[i][j];
				}
			}
		}
		return vec;
	}
	
	public static int[][] matRandom() {
		int[][] mat2 = new int[3][3];
		int ale = 0;
		
		for (int i = 0; i < mat2.length; i++) {
			for (int k = 0; k < mat2[0].length; k++) {
				mat2[i][k] = ale;
				
				while(contNumberOnMatrix(ale, mat2)!= 1){
					ale = nRandom(0, 10);
					mat2[i][k] = ale;
//					this.vecesN(ale, mat2);
				}
			}
		}
		
		return mat2;
	}
	
	public static int[] stringToVector(String cad, char separator) {
		int[] array = new int[9];
		
		for (int i = 0; i < cad.length(); i++) {
			if (cad.charAt(i) != separator) {
				array[i] = (cad.charAt(i) - 48);
			}
		}
		return array;
	}
	
	public static int[][] stringToMatriz(String cad, char separator) {
		int[][] mat = new int[9][9];
		int cont = 0;
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (cad.charAt(cont) != ' ' && cont < cad.length()) {
					mat[i][j] = (cad.charAt(cont) - 48);
					cont++;
				}
			}
		}
		return mat;
	}
 	
	public static void changeRow(int row, int[] vec, int[][] matrix) {
		for (int j = 0; j < vec.length; j++) {
			matrix[row][j] = vec[j];
		}
	}
	
	public static void changeCol(int col, int[] vec, int[][] matrix) {
		for (int i = 0; i < vec.length; i++) {
			matrix[i][col] = vec[i];
		}
	}
	
}