package co.yohan.tgms.test;

import javax.swing.JOptionPane;

public class IoManager {
	
	public String readString(String message){
	return JOptionPane.showInputDialog(message);
	}
	
	public int readInt(String message){
		return Integer.parseInt(this.readString(message));	
	}
	
	public double readDouble(String message){
		return Double.parseDouble(this.readString(message));	
	}
	
	public float readFloat(String message){
		return Float.parseFloat(this.readString(message));
	}
	
	public long readLong(String message){
		return Long.parseLong(this.readString(message));
	}
	
	public short readShort(String message){
		return Short.parseShort(this.readString(message));
	}
	
	public char readChar(String message){
		return message.charAt(0);
	}
	
	public void muestraCad(String message){
		JOptionPane.showMessageDialog(null, message);
	}
	
	public double[] leerVertorDobles(String message, int tam) {
		double []vector = new double[tam];
		this.muestraCad(message);
		for (int i = 0; i < vector.length; i++) {
			vector[i] = this.readDouble(null);
		}
		return vector;
	}
	
	public int[][] leerMatrizInt(String message, int fil, int col){
		int [][]matriz = new int[fil][col];
		this.muestraCad(message);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = this.readInt(null);
			}
		}
		return matriz;
	}
	
	public void escribeVectorDobles(double []vector) {
		String cadena = "";
		for (int i = 0; i < vector.length; i++) {
			cadena += "| " +  vector[i] + " |" + "\n";
		}
		this.muestraCad(cadena);
	}
	
	public void escribeMatrizInt(int matriz[][] ){
		String cadena = "";
		for (int i = 0; i < matriz.length; i++) {
			if (i%3==0 && i != 0) {
				cadena += "-------------------------------------------\n";
			}
			for (int j = 0; j < matriz[0].length; j++) {
				if (j%3==0 && j != 0) {
					cadena += "|  " + matriz[i][j] + "   ";
				} else {
					cadena += matriz[i][j] + "    ";
				}
			}
			cadena += "\n";
		}
		this.muestraCad(cadena);
	}
	
	public int[] leerVertorInt(String message, int tam) {
		int []vector = new int[tam];
		this.muestraCad(message);
		for (int i = 0; i < vector.length; i++) {
			vector[i] = this.readInt(null);
		}
		return vector;
	}
	
	public void escribeVectorInt(int []vector) {
		String cadena = "";
		for (int i = 0; i < vector.length; i++) {
			cadena += "| " +  vector[i] + " |" + "\n";
		}
		this.muestraCad(cadena);
	}
	
	public void escribeVectorChar(char []vector) {
		String cadena = "";
		for (int i = 0; i < vector.length; i++) {
			cadena += i + " " +  vector[i] + " \n" ;
		}
		this.muestraCad(cadena);
	}
	
	public void escribeMatriz(int matriz[][], int matriz2 [][], char vector[]){
		String cadena = "Matriz 1 \n";
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) 
				cadena += matriz[i][j] +"    ";
			cadena += "\n";
		}
		cadena += "Matriz 2 \n";
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) 
				cadena += matriz2[i][j] +"    ";
			cadena += "\n";
		}
		cadena += " Fijas(F) - Picas(P) - NoEsta(E)\n";
		for (int i = 0; i < vector.length; i++) {
			cadena += i + " " +  vector[i] + "\n";
		}
		this.muestraCad(cadena);
	}

}
