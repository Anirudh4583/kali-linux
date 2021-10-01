import java.util.*;

public class BucketSort {
    
    //have to learn DSA ITS HIGH TIME NOW
    void sort(int a[]){
        
        int max =a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max)
                max=a[i];
        }
        int[] Bucket = new int[max + 1];
        int[] sorted_nums = new int[a.length];
         for (int i = 0; i < a.length; i++)
          Bucket[a[i]]++;
          int outPos = 0;
         for (int i = 0; i < Bucket.length; i++)
              for (int j = 0; j < Bucket[i]; j++)
                  sorted_nums[outPos++] = i;
    }
    
    

    void call(int[] a){
        BucketSort ob = new BucketSort();
        int temp[] = new int[a.length];
        for(int i=0;i<a.length;i++)
            temp[i]=a[i];
        
            long start = System.nanoTime();
            ob.sort(temp);
            long end = System.nanoTime();
            System.out.println(end-start+" nano seconds");
    }
    
    

	public static void main(String args[]) 
	{ 
		Random rand = new Random();
        Scanner sn = new Scanner(System.in);
        BucketSort ob = new BucketSort();
        System.out.println("enter the number of elements of array");
        int m = sn.nextInt();
        int[] a=new int[m];
        
        
        //random array A
        for(int k=0;k<a.length;k++){
            a[k]=rand.nextInt(900);
        }

        System.out.println("time taken by A Array");
        ob.call(a);

        
	} 
} 


