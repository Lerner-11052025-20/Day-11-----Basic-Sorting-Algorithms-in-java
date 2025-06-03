public class CountingSort 
{
    public static void countingSortASC(int nums[])
    {
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<nums.length ; i++)
        {
            if(max < nums[i])    max = nums[i];
        }

        int countFREQ[] = new int[max+1];
        for(int i=0 ; i<nums.length ; i++)
        {
            countFREQ[nums[i]]++ ;
        }

        int j=0;                // element< max+1 pan chale
        for(int element=0 ; element<countFREQ.length ; element++)
        {
            while (countFREQ[element] > 0) 
            {
                nums[j] = element;// index as the element
                j++;
                countFREQ[element]--;
            }
        }
    }







    public static void countingSortDESC(int nums[])
    {
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<nums.length ; i++)
        {
            if(max < nums[i])    max = nums[i];
        }

        int countFREQ[] = new int[max+1];
        for(int i=0 ; i<nums.length ; i++)
        {
            countFREQ[nums[i]]++ ;
        }

        int j=0;                // element< max+1 pan chale
        for(int element=countFREQ.length-1 ; element>=0 ; element--)
        {
            while (countFREQ[element] > 0) 
            {
                nums[j] = element;// index as the element
                j++;
                countFREQ[element]--;
            }
        }
    }

    public static void printArray(int nums[])
    {
        for(int i=0 ; i<nums.length ; i++)  System.out.print(nums[i]+ " ");
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7, 10};
        printArray(arr);
        countingSortASC(arr);
        printArray(arr);
        countingSortDESC(arr);
        printArray(arr);
    }    
}
