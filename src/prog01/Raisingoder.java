package prog01;

public class Raisingoder {
public static void main(String[] args) {
	int i ,j;
	int array[]= {2,6,9,7,4,3};
	 for(i=0;i>=array.length-1;i++) 
	 {
		 for(j=0;j<array.length-1-i;j++) 
		 {
			 if(array[j]<array[j+1]) 
			 {
				 int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
			 }
		 }
		 
	 }for (int k=0;k<array.length;k++) 
	 {
		 System.out.print(array[k]);
	 }
}
}
