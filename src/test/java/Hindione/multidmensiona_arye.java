package Hindione;

public class multidmensiona_arye {

	private static int j;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[][] a= new int [3][2];
//		
//		a[0][0]=12;
//		a[0][1]=13
//				
//				;
//		a[1][0]=14;
//		a[1][1]=15;
//		
//		a[2][0]=16;
//		a[2][1]=17;
//		
		int [][] a= {{12,13},{14,15},{16,17},{18,19}};
		
	System.out.println("no of rows:"+ a.length);
	System.out.println("no of colum:"+ a[0].length);
	
	for(int i=0; i<a.length;i++)
	{
		for (int j=0; j<a[0].length; j++);
		System.out.println(a[i][j]);
	}
		
		
	}
	
	}


