public class DuplicateValues //created class  to find the duplicate values of an array of integer values.
{
    public static void main(String[] args)//main method
    {
        int arr[]= new int[]{10,20,30,20,50,40,30,40,};//Initialize array
        System.out.println("dublicate element in given array:");
        //Searches for duplicate element
        for(int i =0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }

    }



}
