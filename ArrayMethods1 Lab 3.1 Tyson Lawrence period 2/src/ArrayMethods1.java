
public class ArrayMethods1 {

	public static void insertionSort(int[]list1)
	{int swap=0;
	 while(swap>0)
	 {for(int n=list1.length-1;n>=0;n--)
	  {if (list1[n]<list1[n-1])
	    swap(list1,n,n-1);
	    swap++;
	   if(list1[n]==list1[n-1])
		 n=n-1;	 
	  }
		 
	 }
		
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
	 double curmin=0;
	 int minIndex=0;
	  for(int n=0;n<list1.length;n++)
		  {curmin=list1[n];
	       minIndex=n;
	        for(int p=n+1;p<list1.length;p++)
		    {if (curmin>list1[p])
		     curmin=list1[p];
		     minIndex=p;
		    }
		 swap(list1,minIndex,n);
	     }
	 
	 
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
