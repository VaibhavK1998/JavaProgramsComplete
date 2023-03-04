package Array;

public class OneDimensionalArray { 

	public static void main(String[] args) {
		int[] ar= {10,20,30,40,50,60,70,80,90,100};
		
	//int size=ar.length;// this ar.length keyword return the size of array(it is use to find out the size of array) its a complementry
	//System.out.println("size of array= "+size);
		
	for(int a=0; a<10;a++) {// by using this for loop we can print total array
		//for(int a=0; a<ar.length;a++)
		int k=ar[a];
		System.out.println("k : "+k);
		//System.out.println("ar["+a+"]="+ar[a]);//standard  syntax for prnting array index and its value
	}	
	 exa2() ;
		}
	public static void exa2() {
	//data type[] variableName=new data type[size]   (this is second syntax of one Dimensional array)
		int ar[]=new int[5];//declaration
		ar[0]=50;
		ar[1]=70;
		ar[2]=80;
		ar[3]=60;
		ar[4]=50;
		
		int sum=ar[0]+ar[1];
		System.out.println("addition of array= "+sum);
	for(int c=0; c<5;c++) {
	System.out.println("ar["+c+"]="+ar[c]); 
	
	}
	
	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


