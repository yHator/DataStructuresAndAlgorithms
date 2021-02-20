import java.util.*; 
public class binSearch{

    static boolean binarySearch(int a[], int n, int x) //static method so I don't need to create obj to call it
    {
        int lo, mid, hi;

        lo = 0;
        hi = n-1;

        while(lo <= hi)
        {
            mid = (lo + hi)/2;

            if(a[mid] == x)
                return true;
            if(a[mid] < x)
                lo = mid+1;
            else
                hi = mid - 1;
        }
        return false;
    }

    //from Geeks for Geeks
    static int recursiveBinSearch(int arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
            // If the element is present at the 
            // middle itself 
            if (arr[mid] == x) 
                return mid; 
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (arr[mid] > x) 
                return recursiveBinSearch(arr, l, mid - 1, x); 
  
            // Else the element can only be present 
            // in right subarray 
            return recursiveBinSearch(arr, mid + 1, r, x); 
        } 
  
        // We reach here when element is not present 
        // in array 
        return -1; 
    } 
    
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4}; //change this array to test

        boolean res = binarySearch(arr,4,1);
        if (res)
            System.out.println("Found!");
        else
            System.out.println("Not found!");

        int pos = recursiveBinSearch(arr, 0, 3, 1);
        if (pos > -1)
            System.out.println("Found!");
        else
            System.out.println("Not found!");

    }
}