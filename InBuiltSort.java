import java.util.Arrays;
import java.util.Collections;   // Collection & Collections BOTH ARE DIFFERENT CHHE IN JAVA

public class InBuiltSort 
{
    public static void printArray(int nums[])
    {
        for(int i=0 ; i<nums.length ; i++)  System.out.print(nums[i]+ " ");
        System.out.println();
    }
    public static void printArray(Integer nums[])
    {
        for(int i=0 ; i<nums.length ; i++)  System.out.print(nums[i]+ " ");
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr[] = {5, 4, 1, 3, 2};
        printArray(arr);
        Arrays.sort(arr, 1,4);   //4 is excluded hovathi 4-1 = 3 measn 1 2 3  
        printArray(arr);
        Arrays.sort(arr);
        printArray(arr);
        
        Integer bigArr[] = {5,1,6,7,3,5,3,2};
        printArray(bigArr);
        Arrays.sort(bigArr, 0,3, Collections.reverseOrder());
        printArray(bigArr);
        Arrays.sort(bigArr, Collections.reverseOrder());
        printArray(bigArr);

    }    
}
