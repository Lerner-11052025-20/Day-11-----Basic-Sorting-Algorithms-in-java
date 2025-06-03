public class SelectionSort 
{
    public static void selectionSortASC(int nums[])
    {
        int minPosIndex;
        for(int i= 0 ; i<nums.length-1 ; i++)
        {
            minPosIndex = i;
            for(int j=i+1 ; j<nums.length ; j++)
            {
                if(nums[minPosIndex] > nums[j])
                {
                    minPosIndex = j;
                }
            }
            int t = nums[minPosIndex];
            nums[minPosIndex] = nums[i];
            nums[i] = t;
        }
    }
    public static void selectionSortDESC(int nums[])
    {
        int mixPosIndex;
        for(int i= 0 ; i<nums.length-1 ; i++)
        {
            mixPosIndex = i;
            for(int j=i+1 ; j<nums.length ; j++)
            {
                if(nums[mixPosIndex] < nums[j])
                {
                    mixPosIndex = j;
                }
            }
            int t = nums[mixPosIndex];
            nums[mixPosIndex] = nums[i];
            nums[i] = t;
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
        selectionSortASC(arr);
        printArray(arr);
        selectionSortDESC(arr);
        printArray(arr);
    }    
}
