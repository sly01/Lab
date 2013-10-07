import java.until.Scanner;

public class calc {

 public static void main(String[] args){

	String choice;
	int num1,num2;


	Scanner sc = new Scanner(System.in);

	System.out.println("Please enter the first number=");
	num1 = sc.nextInt();
	System.out.println("Please enter the second number=");
	num2 = sc.nextInt();
	System.out.println("Please enter the operator=");
	choice = sc.next();

	switch(choice)
	{
		case "+" : System.out.printf("Result=%d",(num1+num2));
			   break;
		case "-" : System.out.printf("Result=%d",(num1-num2));
			   break;
		case "*" : System.out.printf("Result=%d",(num1*num2));
			   break;
		case "/" : System.out.printf("Result=%d",(num1/num2));
			   break;

	}	

}

}
