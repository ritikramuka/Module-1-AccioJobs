    static void insert(int arr[],int itr)
    {
        // Your code here
        for (int j = itr; j >= 1; j--)
        {
            if (arr[j] < arr[j - 1])
            {
                //swap j, j - 1
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
            else 
            {
                break;
            }
        }
    }
    //Function to sort the array using insertion sort algorithm.
    public void insertionSort(int arr[], int n)
    {
        //code here
        for (int itr = 1; itr <= n - 1; itr++)
        {
            insert (arr, itr);
        }
    }