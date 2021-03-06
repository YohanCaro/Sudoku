package co.yohan.gms.persistence;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Sudokus - Taleros
 * 
 * @version 1.0 - 29/01/2019
 * @author Yohan Caro
 *
 */
public class Sudokus {
	
	private List<int[][]> sudokus;
	
	public Sudokus() {
		sudokus = new ArrayList<>();
		this.addSudokus();
	}
	
	public void addSudokus() {
		int[][] mat = { {0,0,8, 2,0,0, 0,0,5},
		  		{0,2,0, 0,0,0, 0,0,9},
		  		{5,1,0, 0,0,6, 0,0,0},
		  		   
		  		{0,0,5, 0,0,7, 0,9,0},
		  		{0,0,7, 0,0,9, 0,0,0},
		  		{0,8,0, 0,0,0, 3,0,0},
		  		   
		  		{0,0,0, 9,6,0, 0,0,4},
		  		{0,0,9, 3,0,0, 8,0,2},
		  		{4,3,0, 7,0,0, 0,0,0} };
		
		int[][] mat2 = { {0,0,0, 0,8,4, 0,0,0},
  		   		{0,0,7, 0,0,0, 1,0,0},
  		   		{6,0,0, 9,0,2, 0,3,0},
  		   
  		   		{0,0,0, 0,0,8, 0,1,5},
  		   		{4,0,0, 0,0,5, 2,0,8},
  		   		{0,0,0, 1,0,0, 6,0,7},
  		   
  		   		{0,0,0, 3,0,0, 0,0,1},
  		   		{0,6,8, 0,0,0, 0,0,3},
  		   		{7,0,0, 0,9,0, 0,0,0} };
		
		int[][] mat3 = { {0,4,6, 0,5,0, 0,0,8},
  		   		{0,1,0, 4,3,0, 0,0,0},
  		   		{8,9,0, 0,0,0, 7,0,0},
  		   
  		   		{5,0,0, 0,0,0, 4,0,1},
  		   		{0,0,0, 0,6,0, 0,0,3},
  		   		{0,0,8, 0,0,4, 0,5,2},
  		   
  		   		{0,0,3, 6,0,0, 0,0,0},
  	 			{0,0,0, 1,0,0, 0,0,0},
  	  			{9,5,0, 7,0,0, 2,0,6} };
		
int[][] mat4 = { {0,9,3, 0,8,2, 5,0,0},
  		   		 {4,0,0, 0,6,9, 7,1,0},
  		   		 {6,5,1, 0,3,0, 0,0,2},
  		   
  		   		 {3,0,7, 0,4,6, 0,0,0},
  		   		 {0,2,0, 8,1,0, 3,7,0},
  		   		 {8,4,0, 0,0,0, 9,0,0},
  		   
  		   		 {0,3,0, 4,0,0, 0,0,7},
  	 			 {2,6,0, 3,0,0, 0,0,0},
  	  			 {0,0,0, 0,0,8, 4,0,5} };
	
	int[][] mat5 = { {3,4,5, 0,1,0, 0,0,2},
		   		 	 {6,0,0, 0,0,0, 1,0,0},
		   		     {0,0,0, 0,3,6, 0,0,5},
		   
		   		     {0,0,7, 0,0,0, 0,0,0},
		   		     {0,0,0, 0,2,0, 0,4,6},
		   		     {0,0,0, 6,0,5, 0,0,9},
		   
		   		     {0,0,6, 0,0,9, 0,0,3},
	 			     {4,0,0, 0,6,0, 0,5,0},
	  			     {0,8,3, 0,5,0, 4,9,1} };
	
	int[][] mat6 = { {1,0,0, 0,0,0, 0,3,6},
  		 	 	   	 {5,0,6, 0,0,0, 0,0,0},
  		 	 	     {0,8,0, 0,4,0, 0,0,9},
  
  		 	 	     {0,0,0, 0,3,7, 4,0,5},
  		 	 	     {0,0,0, 5,0,0, 0,0,8},
  		 	 	     {0,1,0, 0,0,4, 3,6,0},
  
  		 	 	     {0,0,0, 0,0,0, 0,0,0},
  		 	 	     {3,0,0, 0,0,0, 5,0,7},
  		 	 	     {6,9,0, 2,8,0, 0,0,0} };
	
	int[][] mat7 = { {0,5,0, 0,9,0, 0,0,0},
					 {9,7,0, 5,0,1, 0,0,8},
					 {0,0,8, 2,6,0, 0,0,0},
 
					 {1,0,0, 0,3,8, 0,9,2},
					 {3,0,0, 1,0,0, 8,0,0},
					 {0,8,0, 0,0,0, 0,3,0},
 
					 {0,0,0, 0,0,9, 0,0,1},
					 {0,0,0, 6,0,0, 0,0,3},
					 {0,0,0, 0,2,0, 9,7,4} };
	
	int[][] mat8 = { {7,0,0, 1,4,0, 0,2,0},
 		 	 		 {5,0,0, 0,0,0, 0,0,9},
 		 	 		 {2,0,0, 0,0,3, 0,0,0},
 
 		 	 		 {0,0,6, 0,0,1, 0,0,0},
 		 	 		 {0,0,0, 2,9,0, 3,0,8},
 		 	 		 {9,0,0, 0,0,0, 0,6,1},
 
 		 	 		 {0,4,0, 0,7,0, 9,3,0},
 		 	 		 {6,0,0, 0,0,0, 0,7,0},
 		 	 		 {8,0,0, 6,0,2, 4,0,5} };
	
	int[][] mat9 = { {0,0,0, 0,0,7, 0,6,4},
 		 	 		 {2,0,0, 0,0,0, 7,0,8},
 		 	 		 {8,0,6, 0,0,1, 0,0,0},
 
 		 	 		 {0,0,8, 0,0,6, 0,3,7},
 		 	 		 {4,0,0, 0,0,0, 0,9,0},
 		 	 		 {0,0,0, 3,0,0, 2,0,6},
 
 		 	 		 {3,0,0, 2,0,9, 0,0,0},
 		 	 		 {0,0,2, 0,0,3, 0,0,0},
 		 	 		 {5,9,0, 0,6,8, 3,7,0} };
	
	int[][] mat10 = { {2,5,6, 9,0,3, 1,0,0},
 		 	 		  {0,0,1, 7,0,0, 0,0,2},
 		 	 		  {0,0,0, 4,2,0, 3,0,7},
 
 		 	 		  {0,0,0, 3,0,6, 9,0,0},
 		 	 		  {5,0,0, 0,0,0, 0,0,3},
 		 	 		  {0,0,7, 0,0,0, 0,0,0},
 
 		 	 		  {0,2,3, 0,0,0, 6,0,0},
 		 	 		  {0,0,0, 0,0,0, 5,0,0},
 		 	 		  {0,8,0, 1,3,0, 0,0,4} };
	
	int[][] mat11 = { {7,0,0, 1,0,4, 0,0,8},
 		 	 		  {1,4,0, 0,0,8, 0,0,9},
 		 	 		  {2,0,0, 0,0,9, 5,0,0},
 
 		 	 		  {5,0,0, 0,0,0, 0,8,0},
 		 	 		  {3,0,2, 6,0,0, 0,4,0},
 		 	 		  {8,0,4, 0,0,0, 1,0,0},
 
 		 	 		  {0,0,0, 4,0,0, 0,0,6},
 		 	 		  {0,7,0, 0,0,0, 0,0,0},
 		 	 		  {6,5,0, 0,0,7, 0,9,3} };
	
	int[][] mat12 = { {7,0,9, 0,1,0, 0,8,2},
 		 	 		  {0,0,0, 2,0,0, 4,0,0},
 		 	 		  {6,0,0, 8,0,0, 0,0,5},
 
 		 	 		  {0,8,0, 0,2,0, 0,0,0},
 		 	 		  {2,0,0, 0,5,8, 0,0,9},
 		 	 		  {0,0,0, 0,9,0, 0,6,8},
 
 		 	 		  {4,0,0, 0,0,0, 0,0,0},
 		 	 		  {8,0,0, 4,0,7, 0,0,1},
 		 	 		  {3,0,5, 9,0,0, 7,0,0} };
	
	int[][] mat13 = { {0,8,0, 7,0,6, 4,2,0},
 		 	 		  {0,0,0, 0,0,0, 8,6,0},
 		 	 		  {0,0,0, 2,0,8, 0,9,5},
 
 		 	 		  {4,0,9, 1,0,7, 0,0,0},
 		 	 		  {0,3,0, 4,2,0, 0,0,0},
 		 	 		  {0,5,0, 0,0,0, 0,0,0},
 
 		 	 		  {1,0,0, 0,0,0, 0,4,7},
 		 	 		  {0,4,0, 0,0,0, 3,0,6},
 		 	 		  {0,7,6, 0,0,0, 0,1,0} };
	
	int[][] mat14 = { {8,0,0, 0,2,0, 3,1,5},
 		 	 		  {0,9,0, 0,7,0, 0,0,2},
 		 	 		  {0,0,0, 0,8,3, 0,0,0},
 
 		 	 		  {0,8,0, 0,0,0, 0,0,4},
 		 	 		  {5,0,0, 0,0,4, 2,0,1},
 		 	 		  {0,0,0, 0,0,0, 6,0,9},
 
 		 	 		  {4,0,7, 0,0,0, 0,0,0},
 		 	 		  {9,0,0, 0,0,0, 1,4,3},
 		 	 		  {1,0,8, 0,0,2, 7,0,6} };
	
	int[][] mat15 = { {4,7,0, 0,8,0, 6,0,5},
					  {0,2,0, 0,0,0, 0,8,7},
					  {0,3,0, 0,0,0, 0,0,0},
 
					  {9,0,0, 7,2,3, 0,0,8},
					  {2,4,0, 8,0,0, 7,0,0},
					  {3,0,0, 5,9,0, 0,0,0},
 
					  {0,6,0, 0,3,0, 5,7,0},
					  {0,0,0, 0,0,0, 0,0,0},
					  {0,9,0, 1,7,0, 0,0,4} };
	
	int[][] mat16 = { {0,7,0, 9,0,3, 0,5,8},
 		 	 		  {0,9,8, 5,0,4, 0,0,6},
 		 	 		  {0,0,5, 0,0,0, 3,0,0},
 
 		 	 		  {0,8,0, 0,3,0, 0,0,0},
 		 	 		  {0,0,0, 7,0,0, 0,0,5},
 		 	 		  {2,4,0, 0,0,0, 0,0,0},
 
 		 	 		  {8,3,0, 0,0,5, 4,0,7},
 		 	 		  {0,0,0, 0,8,1, 0,0,0},
 		 	 		  {9,1,6, 0,0,0, 0,0,0} };
	
	int[][] mat17 = { {0,0,0, 9,0,2, 4,0,3},
 		 	 		  {0,0,0, 0,0,0, 0,0,0},
 		 	 		  {8,0,0, 0,0,6, 0,0,0},
 
 		 	 		  {1,0,0, 6,9,0, 7,8,2},
 		 	 		  {0,5,0, 0,2,0, 0,6,0},
 		 	 		  {6,0,8, 0,0,0, 0,3,9},
 
 		 	 		  {0,0,4, 0,5,0, 0,0,0},
 		 	 		  {2,0,6, 4,0,0, 0,0,8},
 		 	 		  {3,0,0, 0,0,0, 2,0,0} };
	
	int[][] mat18 = { {1,5,0, 0,2,7, 0,0,8},
 		 	 		  {0,9,0, 8,0,0, 0,0,6},
 		 	 		  {0,4,2, 0,1,0, 9,0,5},
 
 		 	 		  {2,0,0, 0,0,0, 3,0,0},
 		 	 		  {0,0,0, 0,3,0, 0,8,0},
 		 	 		  {3,0,0, 1,0,6, 0,0,7},
 
 		 	 		  {0,2,7, 0,0,8, 0,0,0},
 		 	 		  {0,0,0, 0,0,4, 0,0,0},
 		 	 		  {9,0,0, 0,0,0, 0,0,4} };
	
	int[][] mat19 = { {5,0,0, 0,1,0, 0,0,0},
					  {0,0,6, 0,0,0, 0,1,8},
					  {0,0,0, 0,0,4, 9,0,0},
 
					  {0,0,0, 3,0,0, 0,0,0},
					  {1,0,0, 0,0,0, 0,0,7},
					  {0,6,4, 8,0,7, 0,0,5},
 
					  {7,0,8, 0,0,0, 0,0,4},
					  {9,0,0, 0,2,0, 0,0,0},
					  {0,5,0, 9,0,0, 2,7,1} };
	
	int[][] mat20 = { {2,0,4, 0,6,0, 0,0,8},
 		 	 		  {0,8,0, 0,0,0, 0,6,7},
 		 	 		  {0,0,0, 0,2,0, 0,4,0},
 
 		 	 		  {0,0,0, 0,0,3, 0,0,0},
 		 	 		  {7,0,2, 0,0,0, 0,0,0},
 		 	 		  {3,0,6, 2,0,8, 0,5,0},
 
 		 	 		  {0,2,3, 0,8,9, 0,0,1},
 		 	 		  {0,0,0, 0,0,6, 9,0,0},
 		 	 		  {1,0,8, 0,0,0, 4,0,0} };
		
	sudokus.add(mat);
	sudokus.add(mat2);
	sudokus.add(mat3);
	sudokus.add(mat4);
	sudokus.add(mat5);
	sudokus.add(mat6);
	sudokus.add(mat7);
	sudokus.add(mat8);
	sudokus.add(mat9);
	sudokus.add(mat10);
	sudokus.add(mat11);
	sudokus.add(mat12);
	sudokus.add(mat13);
	sudokus.add(mat14);
	sudokus.add(mat15);
	sudokus.add(mat16);
	sudokus.add(mat17);
	sudokus.add(mat18);
	sudokus.add(mat19);
	sudokus.add(mat20);
	
	}
	
	public List<int[][]> getSudokus() {
		return sudokus;
	}
		
}
