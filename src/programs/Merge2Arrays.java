package programs;

public class Merge2Arrays {
	public static void main(String[] args) {
		
	int[] a= {2,3,1,8,5};
	int[] b= {9,3,5,7,8};
	int[] c= new int[a.length+b.length];
	int d=0;
	int e=0;
	for (int i=0; i<a.length;i++, d++)
	{
		c[d]=a[i];
		System.out.print(c[d]+",");
	}
	for (int j=0; j<b.length; j++, e++)
	{
		c[a.length+e]=b[j];
		System.out.print(c[(a.length)+e]);
	}
	
	}

}
