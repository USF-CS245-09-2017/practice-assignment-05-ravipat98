// Ravi Patel
// assignment 5
// quicksort algorithm
public class QuickSort implements SortingAlgorithm
{
    public void sort(int[] a)
    {
        // TODO Auto-generated method stub
        quicksort(a,0,a.length-1);
        
    }
    
    private void quicksort(int[] arr, int left, int right)
    {
        // TODO Auto-generated method stub
        if(left < right)
        {
            int part = partition(arr,left,right);
            quicksort(arr,left,part-1);
            quicksort(arr,part+1,right);
        }
        
    }
    
    private int partition(int[] arr, int left, int right)
    {
        // TODO Auto-generated method stub
        if(left < right)
        {
            int pivot = left;
            int i = left +1;
            int j = right;
            while ( i < j)
            {
                while(i <= right && arr[i] <= arr[pivot])
                {
                    ++i;
                }
                while(j >= i && arr[j] > arr[pivot])
                {
                    --j;
                }
                
                if(i <= right && i < j)
                {
                    swap(arr,i,j);
                }
                
            }
            swap(arr,pivot,j);
            return j;
        }
        return left;
    }
    
    private void swap(int[] arr, int i, int j)
    {
        // TODO Auto-generated method stub
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    
}
