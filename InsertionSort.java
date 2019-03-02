public class InsertionSort implements SortingAlgorithm
{
	public void sort1(int [] a)
	{
		 
        int b = a.length; 
        for (int i=1; i<b; ++i) 
        { 
            int key = a[i]; 
            int j = i-1; 
  
            // move the elements of arr[0 to i-1] which are bigger/greater than key
            // they have to go to one place ahead of where they are currently
            
            while (j>=0 && a[j] > key) 
            { 
                a[j+1] = a[j]; 
                j = j-1; 
            } 
            a[j+1] = key; 
         
    	} 
	}

    void sort(int []a)
    {
        sort1();
    }
}