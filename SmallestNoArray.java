
public class SmallestNoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] a = {{8,7,9},{4,5,6},{1,3,2}};
		int min = a[0][0];
		for(int i=0; i<3;i++) {
			for (int j=0; j<3; j++) {
				if(a[i][j]<min) {      // to print biggest no a[i][j]>min
					min=a[i][j];
				}
			}
		}
		System.out.println("samllest no in array is " + min );
	}

}
