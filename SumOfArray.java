 
public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		int[] a = {12,45,65,78,399};
		
		//1st way with object. no need to give "static" in method
		//SumOfArray b = new SumOfArray();
		
		
		//2nd way no need to create object if we give static in method
		
	 System.out.println(getSum(a));
		
	}

	
  public static int getSum(int[] a)
  {
  	int sum = 0 ;
	  for (int i=0 ; i<a.length ; i++)
	  {
		   sum = sum + a[i];
		 
	  }
	return sum ; 
  }
}
