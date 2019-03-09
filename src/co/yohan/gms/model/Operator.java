package co.yohan.gms.model;

import co.yohan.gms.utilities.Utilities;
import co.yohan.tgms.test.IoManager;

/**
 * Clase Operator - Clase que crea y resuleve un tablero
 * 
 * @version 0.4 - 20/10/2018
 * @author Yohan Caro
 *
 */
public class Operator {
	
	private int matrix[][];
	private IoManager io;
	
	/**
	 * Constructor
	 */
	public Operator() {
		matrix = new int[9][9];
		io = new IoManager();
//		this.fillMatrix();
//		this.fillEmptyMatrix();
		this.verificator(0, 0);
//		this.verificator2(0, 0);
	}
	
	/**
	 * Llena un vector con numeros del 1 al 9 aleatoriamente
	 * @param tam del vector
	 * @return array el vector
	 */
	public int[] fillArray(int tam) {
		int[] array = new int[tam];
		for (int i = 0; i < array.length; i++) {
			while (Utilities.contNumberOnArray(array[i], array) != 1 || array[i] == 0) {
				array[i] = Utilities.nRandom(0, 10);
			}
		}
		return array;
	}
	
	/**
	 * -Vuelve a 0 los elementos de un vector
	 * @param tam tamaño del vector
	 * @return array el vector
	 */
	public int[] emptyArray(int tam) {
		int[] array = new int[tam];
		for (int i = 0; i < array.length; i++) {
			array[i] = 0;
		}
		
		return array;
	}
	
	/**
	 * Llena la matriz con números aleatorios
	 */
	public void fillMatrix() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = Utilities.nRandom(0, 10);
			}
		}
	}	
	
	/**
	 * Vuelve a 0 los elementos de la matriz
	 */
	public void fillEmptyMatrix() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = 0;
			}
		}
	}	
	
	/**
	 * Big operation!
	 * Método que crea un tablero ya terminado! (En proceso)
	 */
	public void verificator(int a, int b) {
		for (int i = a; i < matrix.length; i++) {
			for (int j = b; j < matrix.length; j++) {
				matrix[i][j] = Utilities.nRandom(0, 10);
				System.out.println(matrix[i][j]);
				int number = matrix[i][j];
				int row[] = Utilities.extraRow(matrix, i);
				int col[] = Utilities.extraCol(matrix, j);
				
				while (!Utilities.isNumberOnArray(number, row) || !Utilities.isNumberOnArray(number, col) 
						|| !this.verSubMatrizWithOne(this.extraMatriz(i, j), number)) {
					System.out.println("Entro");
					if (!Utilities.isNumberOnArray(number, row)) {
						System.out.println("Row");
						
						if ((!Utilities.isNumberOnArray(number, col) || !this.verSubMatrizWithOne(this.extraMatriz(i, j), number))  
								&& ((i+j) >= 6)) {
							this.changeRow(i, this.emptyArray(9));
//							this.changeRow(i, this.fillArray(9));
							System.out.println("Row 2");
//							this.verificator(i, 0);
							j = 0;
						} else {
							matrix[i][j] = Utilities.nRandom(0, 10);
						}
//						matrix[i][j] = Utilities.nRandom(0, 10);
					} else if (!Utilities.isNumberOnArray(number, col) ) {
						 System.out.println("Col");
						if ((!Utilities.isNumberOnArray(number, row) || !this.verSubMatrizWithOne(this.extraMatriz(i, j), number))  
								&& ((i+j) >= 6)) {
							this.changeRow(i, this.emptyArray(9));
//							this.changeRow(i, this.fillArray(9));
							System.out.println("Col 2");
//							this.verificator(i, 0);
							j = 0;
						} else {
							matrix[i][j] = Utilities.nRandom(0, 10);
						}
//						 matrix[i][j] = Utilities.nRandom(0, 10);
					} else if (!this.verSubMatrizWithOne(this.extraMatriz(i, j), number)) {
						System.out.println("Mat");
						if ((!Utilities.isNumberOnArray(number, row) || !Utilities.isNumberOnArray(number, col))  
								&& ((i+j) >= 6)) {
							this.changeRow(i, this.emptyArray(9));
//							this.changeRow(i, this.fillArray(9));
							System.out.println("Mat 2");
//							this.verificator(i, 0);
							j = 0;
						} else {
							matrix[i][j] = Utilities.nRandom(0, 10);
						}
					}
					
					
					System.out.println(i + " - " + j);
					System.out.println("Cambio: " + number +" por " + matrix[i][j]);
					row = Utilities.extraRow(matrix, i);
					col = Utilities.extraCol(matrix, j);
					number = matrix[i][j];
				}
				
			}
			io.escribeMatrizInt(matrix);
		}
	}
	
	/**
	 * Verifica un tablero (En proceso)
	 * @param a
	 * @param b
	 */
	public void verificator2(int a, int b) {
		this.changeRow(0, this.fillArray(9));
		for (int i = a+1; i < matrix.length; i++) {
			this.changeRow(i, this.fillArray(9));
			for (int j = 0; j < matrix[0].length; j++) {
				io.escribeMatrizInt(matrix);
				System.out.println(i + " X");
				while (!verificator3(i, j)) {
					System.out.println(".");
					this.changeRow(i, this.fillArray(9));
				}
			}
		}
	}
	
	/**
	 * Verifica un tablero (en proceso)
	 * @param a
	 * @param b
	 * @return
	 */
	public boolean verificator3(int a, int b) {
		for (int i = a; i < matrix.length; i++) {
			for (int j = b; j < matrix.length; j++) {
				int number = matrix[i][j];
				System.out.println(i + "/" + j);
				if (!Utilities.isNumberOnArray(number, Utilities.extraCol(matrix, j)) 
						|| !this.verSubMatrizWithOne(this.extraMatriz(i, j), number)) {
					System.out.println("F");
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * Verifica una matriz de un tablero
	 * @param matriz
	 * @return
	 */
	public boolean verSubMatriz(int[][] matriz) {
		for (int k = 1; k <= 9; k++) {
			if (Utilities.contNumberOnMatrix(k, matriz) != 1) {
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * VErifica una submatriz en la que cada numero solo se repita
	 * una vez
	 * 
	 * @param matriz
	 * @param number
	 * @return
	 */
	public boolean verSubMatrizWithOne(int[][] matriz, int number) {
		if (Utilities.contNumberOnMatrix(number, matriz) != 1) {
			return false;
		}
		return true;
	}
		
	/**
	 * Extrae elementos de una matriz
	 * @param a
	 * @param b
	 * @return
	 */
	public int[][] extraMatriz(int a, int b) {
		int arra[] = new int[9];
		int cont = 0;
		int i2 = (a/3)*3;
		int j2 = (b/3)*3;
		for (int i = (a/3)*3; i < i2+3; i++) {
			for (int j = (b/3)*3; j < j2+3; j++) {
				arra[cont] = matrix[i][j];
				cont++;
			}
		}
		
		return this.arrayToMatriz(arra);
	}
	
	/**
	 * Vuelve un vector a una matriz
	 * @param vec
	 * @return
	 */
	public int[][] arrayToMatriz(int vec[]) {
		int matriz[][] = new int[3][3];
		int cont = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = vec[cont];
				cont++;
			}
		}
		return matriz;
	}
	
	/**
	 * Cambia la fila de una matriz
	 * @param row
	 * @param vec
	 */
	public void changeRow(int row, int[] vec) {
		for (int j = 0; j < vec.length; j++) {
			matrix[row][j] =  vec[j];
		}
	}
	
	/**
	 * Cambia la columna de una matriz
	 * @param col
	 * @param vec
	 */
	public void changeCol(int col, int[] vec) {
		for (int i = 0; i < vec.length; i++) {
			matrix[i][col] =  vec[i];
		}
	}
	
	/**
	 * Cambia una submatriz (3x3) en una matriz (9x9)
	 * Solo funciona en un sudoku 9x9
	 * @param row fila del primer elemento
	 * @param col columna del primer elemento
	 */
	public void changeSubMatriz(int row, int col) {
		int i2 = (row/3)*3;
		int j2 = (col/3)*3;
		
		int cont2 = 0;
		for (int i = (row/3)*3; i < i2+3; i++) {
			int cont = 0;
			for (int j = (col/3)*3; j < j2+3; j++) {
				this.matrix[i][j] = Utilities.matRandom()[cont2][cont];
				cont++;
			}
			cont++;
		}
	}
	
	/**
	 * Obtiene la matriz
	 * @return matrix matriz
	 */
	public int[][] getMatrix() {
		return matrix;
	}
	
}
