    int select(int arr[], int itr)
	{
        // code here such that selectionSort() sorts arr[]
        int maxIdx = 0;
        for (int j = 0; j <= arr.length - itr; j++) 
        {
            if (arr[j] > arr[maxIdx])
            {
                maxIdx = j;
            }
        }
        
        return maxIdx;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for (int itr = 1; itr <= n - 1; itr++)
	    {
	        int maxIdx = select(arr, itr);
	        
	        // swap
	        // maxIdx and (n - itr)
	        int temp = arr[maxIdx];
	        arr[maxIdx] = arr[n - itr];
	        arr[n - itr] = temp;
	    }
	}