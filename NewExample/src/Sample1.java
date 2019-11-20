import java.util.Scanner;

public class Sample1 {
	public void start(int num1,int num2) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("The frst number is:");
		num1=scanner.nextInt();
		System.out.println("the second number is:");
		num2=scanner.nextInt();
		System.out.println("the operator is:(+,-,*,/,%)");
		char op=scanner.next().charAt(0);
		switch (op) {
		case '+':System.out.println("the result is :"+(num1+num2));
			break;
		case '-':System.out.println("the result is :"+(num1-num2));
	        break;
		case '*':System.out.println("the result is :"+(num1*num2));
	        break;
		case '%':System.out.println("the result is :"+(num1%num2));
	        break;
		case '/':System.out.println("the result is :"+(num1/num2));
	        break;
		default:System.out.println("The operator s not matching");
			break;
		}
		
	}

}
