public class InsertionSort 
{
    public static void insertionSortASC(int nums[])
    {
        int prev, curr;
        for(int i=1 ; i<nums.length ; i++)
        {
            curr=nums[i]; // curr value = 4
            prev=i-1; // prev=0; i-1 = 1-1 = 0
            while(prev>=0 && nums[prev]>curr)
            {
                nums[prev+1] = nums[prev];
                // 0th idndex ni value 1st index per nana mathi mota ma
                // 5 4 hato to have 5 5 thase
                prev--; //0-1 = -1
            }
            nums[prev+1] = curr;
            // -1+1 = 0        curr = index 1 --> value 4 store karaveli
        }
    }
    public static void insertionSortDESC(int nums[])
    {
        int prev, curr;
        for(int i=1 ; i<nums.length ; i++)
        {
            curr=nums[i];
            prev=i-1;
            while(prev>=0 && nums[prev]<curr)
            {
                nums[prev+1] = nums[prev];
                prev--; 
            }
            nums[prev+1] = curr;
        }        
    }

    public static void printArray(int nums[])
    {
        for(int i=0 ; i<nums.length ; i++)  System.out.print(nums[i]+ " ");
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr[] = {5, 4, 1, 3, 2};
        printArray(arr);
        insertionSortASC(arr);
        printArray(arr);
        insertionSortDESC(arr);
        printArray(arr);
    }    
}
