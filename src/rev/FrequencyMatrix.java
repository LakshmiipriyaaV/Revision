package rev;

import java.util.Scanner;
public class FrequencyMatrix 
{
    public static void main(String[] args) 
    {
        int m,n;   

        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of rows in matrix:");
        m = sc.nextInt();  

        System.out.print("Enter number of columns in matrix:");
        n = sc.nextInt();  
 
        int arr[][] = new int[m][n];  
        System.out.println("Enter all the elements of matrix:");
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                arr[i][j] = sc.nextInt();     
            }
        }
        
       
        System.out.println("The Original Matrix:");
        for (int i = 0; i < m; i++)      
        {
            for (int j = 0; j < n; j++)    
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        
        int even=0,odd=0;   
        
       
        for(int i=0;i<m;i++)      
        {
            for(int j=0;j<n;j++)  
            {
                if(arr[i][j]%2==0)    
                {
                    even++;     
                }
                else
                {
                    odd++;      
                }
            }
        }
        System.out.println("Total Odd Number in the Matrix: " + odd); 
        System.out.println("Total Even Number in the Matrix: " + even); 
         
    }
}