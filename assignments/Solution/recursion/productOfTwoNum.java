
public class productOfTwoNum {
	static int product(int n1, int n2) 
	{ 
		if (n1 < n2) 
			return product(n2, n1);
		else if (n2 != 0) 
			return (n1 + product(n1, n2 - 1)); 
		else
			return 0; 
	} 
	
	public static void main (String[] args) 
	{ 
		int n1 = 5, n2 = 2; 
		System.out.println(product(n1,n2)); 
	} 

}
