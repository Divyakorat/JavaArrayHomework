public class AscendingOrder//created class to sorting the value in ascending order
{
    public static void main(String[] args)//main method
    {
        int array[] = new int []{6, 5, 2, 8, 1, 4};//initialize array
        int temp = 0;
        System.out.println("print element original array:"); //Displaying elements of original array
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        //Sort the array in ascending order
        for (int i = 0; i < array.length; i++)
        {
            for (int j =i+ 1; j < array.length; j++)
            {
                if (array[i] > array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }
        System.out.println();
        //Displaying elements of array after sorting
        System.out.println("Element of array sorted in ascending order:");
        for(int i=0;i< array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}

