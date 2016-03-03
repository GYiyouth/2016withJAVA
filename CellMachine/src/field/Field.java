package field;
import java.awt.List;
import java.util.ArrayList;

import cell.Cell;

public class Field {
	private int width;
	private int heigth;
	private Cell[][] field;

	public Field(int width, int heigth) {
		this.width = width;
		this.heigth = heigth;
		this.field = new Cell[heigth][width];
	}
	
	public int getHeigth(){
		return heigth;
	}
	
	public int getWigth(){
		return width;
	}
	
	public Cell get(int row, int col){
		return this.field[row][col];
	}
	public Cell place( int row, int col, Cell cell){
		Cell ret = this.field[row][col];
		this.field[row][col] = cell;
		return ret;
	}
	
	public Cell[] getNeighbour(int row, int col){
		Cell cell = this.field[row][col];
//		Cell [] neighbors = new     这里不能用数组，因为长度其实是不确定的
		ArrayList<Cell>neighbours = new ArrayList<Cell>();
		for(int i = -1; i<2 ; i++){
			for(int j=-1 ; j<2 ; j++){
				int row1 = row + i;
				int col1 = col + j;
				if( row1>=0 && row1<this.field.length && col1>=0 && col1<this.field[row1].length &&(row1 != col1 ))
					neighbours.add(this.field[row1][col1]);
			} // for
		} // for
		return (Cell[]) neighbours.toArray(new Cell[neighbours.size()]);
	} // getNeighbour
	
	public void clear(){
		for(int i=0; i<field.length; i++)
			for(int j=0; j<field[i].length; j++)
				field[i][j] = null;
	}
}
