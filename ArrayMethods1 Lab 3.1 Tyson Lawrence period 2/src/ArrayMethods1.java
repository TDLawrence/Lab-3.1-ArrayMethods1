import java.util.Arrays;

public class ArrayMethods1 {

	public static void main(String[]args)
	{//Testing arrays
		int[]test1= {1,4,4,5,2,4,3,17,0};
		double[]test2= {1.1,4.1,4.2,5.0,2.0,4.0,3.0,17.0,0.0};
		String[]test3= {"zebra","tortilla","abba","foo","bar","aba"};
		
		//Insertion sort test
		long start=System.nanoTime();
		insertionSort(test1);
		long end=System.nanoTime();
		long time=end-start;
		System.out.println("Test 1 took: "+time+"nanoseconds.}");
		System.out.println(Arrays.toString(test1));
		
		//Selection Sort Test
		start=System.nanoTime();
		selectionSort(test2);
		end=System.nanoTime();
		time=end-start;
		System.out.println("Test 2 took: "+time+"nanoseconds.}");
		System.out.println(Arrays.toString(test2));
		
		//Bubble Sort Test
		start=System.nanoTime();
		bubbleSort(test3);
		end=System.nanoTime();
		time=end-start;
		System.out.println("Test 3 took: "+time+"  nanoseconds.}");
		System.out.println(Arrays.toString(test3));
	}
	
	
	public static void insertionSort(int[]list1)
	{ for(int n=list1.length-1;n>0;n--)
	   {if (list1[n]<list1[n-1])
	     {swap(list1,n,n-1);}
	   if(list1[n]==list1[n-1])
		 {n=n-1;}	 
	   
		 
	 }
		
	}
	public static void bubbleSort(String[]list1)
	{int swap=list1.length;
	 while(swap>0)
	 {  swap=0;
		for(int n=0;n<list1.length;n++)
	   { 
		 if ((list1[n].compareTo(list1[n+1]))>0)
		  {swap(list1,n,n+1);	
	       swap++;}
	    if ((list1[n].compareTo(list1[n+1]))<=0)
		  {n=n+1;}	
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
		     {curmin=list1[p];
		     minIndex=p;}
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
