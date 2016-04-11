package ua.in.dergachovda.less07;
import ua.in.dergachovda.*;

public class Spiral {
	
	public static void main (String[] args) {
		
		int n = 10;
		int i = 0;
		int[][] m = new int[n][n];
		int x = 0;//m.length >> 1;
		int y = 0;//m[x].length >> 1;
		
		while (x < m.length) {
			while (y < m[x].length) {
				i++;
				m[x][y] = i;
				y++;
			}
			y = 0;
			x++;
		}
		
		Utils.printArray2(m);
		
	}
	
}
