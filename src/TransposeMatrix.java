public class TransposeMatrix {
    public static void main(String args[]) {
        //creating matrix
        int original[][] = {{1,3,4}, {2,4,3}, {3,4,5}};
        System.out.println("printing matrix without transpose:");
        //Code to transpose a matrix
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(original[i][j]+" ");
            }
            System.out.println();//new line
        }
        System.out.println("printing matrix after transpose:");
        for(int i=0;i<3;i++) {
            for (int j=0;j <3;j++) {
                System.out.print(original[j][i]+" ");
            }
            System.out.println();//new line
        }
    }
}