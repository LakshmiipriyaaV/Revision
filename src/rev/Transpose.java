package rev;

public class Transpose{
    public static void main(String args[])
    {
        
        int arr[][] = {{19,25,32},{40,54,62},{70,20,60}}, res[][] = new int[3][3];
        int row, col ;
        System.out.print("The matrix elements are : ");
        printMatrix(arr);
        
        for(row=0;row<3;row++)
            for(col=0;col<3;col++)
            {   
                res[col][row]= arr[row][col];
            }   
        System.out.print("\n\nThe transpose of the matrix : ");
        printMatrix(res);
    }
    
    static void printMatrix(int arr[][])
    {
        int row, col;
        
        for(row=0;row<3;row++)
        {
           
            System.out.print("\n");
            for(col=0;col<3;col++)
            {
                System.out.print(arr[row][col]+" ");
            }
        }
    }
}