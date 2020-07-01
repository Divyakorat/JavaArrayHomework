import java.util.Arrays;

public class Equality//created class test the equality of two arrays.
{
    public static void main(String[] args)//main method
    {
        int arr1[]={1,2,3,4,5,};
        int arr2[]={1,2,3,4,5,};

        if(Arrays.equals(arr1,arr2))//testing equqlity of arr1 and arr2
            System.out.println( "Same");
        else
        System.out.println("Not same");

    }
}
