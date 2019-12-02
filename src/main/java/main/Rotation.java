package main;

public class Rotation {
	
	public static void Rotate() {
		
		int [][] matrix = {
				{10,11,6},
				{7,7,12},
				{11,9,10}
				};
		
		int size = matrix.length;

		for (int[] i : matrix)	{
			for (int j : i)	{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		
		System.out.println("\n");

	
		for(int x = 0; x < size/2; x++)
		{
			for(int y = x; y < size - x - 1; y++)
			{
				int nx = size - 1 - x;
				int ny = size - 1 - y;
				
				int swapVal = matrix[x][y];
				matrix[x][y] = matrix[ny][x];
				matrix[ny][x] = matrix[nx][ny];
				matrix[nx][ny] = matrix[y][nx];
				matrix[y][nx] = swapVal;
			}
		}
		
		for (int[] i : matrix)	{
			for (int j : i)	{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}

	}
}