
public class ArrayMethods1 {

	public static void insertionSort(int[]list1)
	{
		
	}
	public static void bubbleSort(String[]list1)
	{int swap=0;
	 while(swap>0)
	 {for(int n=0;n<list1.length;n++)
	   { 
		 if ((list1[n].compareTo(list1[n+1]))>0)
		  swap(list1,n,n+1);	
	       swap++;
	   if ((list1[n].compareTo(list1[n+1]))==0)
		  n=n+1;	
	    }
	 }
		
	}
	public static void selectionSort(double[]list1)
	{
		
	}
	public static void swap(int[] arr,int index1,int index2)
	{int y=arr[index1];
	 arr[index1]=arr[index2];
	 arr[index2]=y;
		
	}
	public static void swap(double[] arr,int index1,int index2)
	{double y=arr[index1];
	 arr[index1]=arr[index2];
	 arr[index2]=y;
		
	}
	public static void swap(String[] arr,int index1,int index2)
	{String y=arr[index1];
	 arr[index1]=arr[index2];
	 arr[index2]=y;
		
	}
}
