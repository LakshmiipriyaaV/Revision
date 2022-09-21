package rev;

public class EqualMatrices
{
    public static void main(String args[])
    {
       
        int mat1[][] = {{19,25,32},{40,54,62},{70,20,60}};
        int mat2[][] =  {{50,15,10},{98,45,78},{23,73,50}};
        int row, col ;
        boolean flag = true;
        
        System.out.print("\nMatrix 1");
        printMatrix(mat1);
        System.out.print("\nMatrix 2");
        printMatrix(mat2);
        
        for(row=0;row<3;row++)
            for(col=0;col<3;col++)
            {   
                
                if(mat1[row][col]!=mat2[row][col])
                {
                    
                    flag = false;
                    break;
                }
            }
        if(flag)
            System.out.println("\n\nBoth the matrices are equal");
        else
            System.out.println("\n\nBoth the matrices are not equal");
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
        System.out.print("\n");
    }
}
