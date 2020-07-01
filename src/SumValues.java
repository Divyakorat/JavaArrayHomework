public class SumValues//created class to sum values of an array.
{
    public static void main(String[] args)//main method
    {
        int array[]={10,20,30,40,50};  //Initialize array
        int sum =0;
        //Loop through the array to calculate sum of elements
        for(int i:array)
            sum += i;
        System.out.println("The sum is " + sum);
    }
}
