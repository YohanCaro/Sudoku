package co.yohan.tgms.test;

import co.yohan.gms.model.Operator;
import co.yohan.gms.utilities.Utilities;

public class TestOperator {

	public static void main(String[] args) {
		Operator operator = new Operator();
		IoManager io = new IoManager();
		
//		int vec2[] = {1,2,3,4,5,6,7,8,9};
		//int vec[] = operator.fillArray(Utilities.extraRow(operator.getMatrix(), 0));
//		int row[] = Utilities.extraRow(operator.getMatrix(), 0);
		
//		int matriz[][] = operator.extraMatriz(1, 2);
//		int matriz2[][] = operator.arrayToMatriz(vec2);
//		int matriz3[][] = Utilities.matRandom();
		
//		System.out.println(operator.verSubMatriz(matriz));
						
		io.escribeMatrizInt(operator.getMatrix());
		
//		operator.changeRow(0, vec2);
//		operator.changeCol(0, vec2);
//		io.escribeMatrizInt(matriz3);
		
		//io.escribeVectorInt(row);
		//io.escribeMatrizInt(matriz);
	}

}
