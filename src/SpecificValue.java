public class SpecificValue//created class to test if an array contains a specific value.
{
    public static boolean contains(int[] arr, int item)//using boolean condition for true or false condition
    {
        for (int n : arr)
        {
            if (item == n)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args)//main method
    {
        int[]array = {1,2,3,4,5,6,7,8,9,10};//getting the array
        System.out.println(contains(array,5));//given value to check the specific value
        System.out.println(contains(array,20));//given value to check the specific value
    }


}
