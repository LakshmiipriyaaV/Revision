package rev;


import java.util.Scanner; 
public class ASCII{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter character");	
        char ch= sc.next().charAt(0);
        int asciVal = ch;
		System.out.println("ASCII value of" +ch+ "is:" +asciVal);
	}

}
