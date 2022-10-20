import java.util.Scanner;
public class oddcubesquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number to check: ");
		int num=sc.nextInt();
		
		int square=num*num;
		int cube=num*num*num;
		
		switch(num%2){//this will return 0 or 1
		case 0:
		    System.out.println(num+" is an Even number"+"\nsquare : "+square+"\ncube: "+cube );
		    break;
		case 1:
		    System.out.println(num+" is an Odd number"+"\nsquare : "+square+"\ncube: "+cube );
		}
		}

}