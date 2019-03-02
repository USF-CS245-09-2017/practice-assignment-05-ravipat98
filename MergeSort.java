//Ravi Patel
// Merge sort
// assignment 5


import java.util.Arrays;
public class MergeSort implements SortingAlgorithm
{
	
    
    
        
        @Override
        public void sort(int[] a)
        {
            // TODO Auto-generated method stub
            if(a.length>1)
            {
                int left[] =  getL(a);
                int right[] = getR(a);
                
                sort(left);
                sort(right);
                merge(a,left,right);
            }
        }
        
        private void merge(int[] arr, int[] left, int[] right) {
            // TODO Auto-generated method stub
            
            int ai= 0;
            int ri =  0;
            int li = 0;
            
            while(li < left.length && ri < right.length)
            {
                if(left[li] < right[ri])
                {
                    arr[ai++] = left[li++];
                }
                else
                {
                    arr[ai++] = right[ri++];
                }
            }
            
            while(ri < right.length)
            {
                arr[ai++]= right[ri++];
            }
            
            while(li< left.length)
            {
                arr[ai++] =left[li++];
            }
            
            
        }
        
        
        private int[] getR(int[] a) {
            // TODO Auto-generated method stub
            
            return Arrays.copyOfRange(a,(a.length/2), a.length );
        }
        
        private int[] getL(int[] a) {
            // TODO Auto-generated method stub
            return Arrays.copyOfRange(a, 0, (a.length/2));
        }












}
