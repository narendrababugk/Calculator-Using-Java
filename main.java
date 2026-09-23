import java.util.Scanner;

public class main{
	public static void main(String[] args){
	String symb;
	Double val;
	
	method c=new method();
	System.out.println("\n\tSimple Calculator");
	
    System.out.println("\nEnter operator (+, -, *, /, %,C)");
	
	
	Scanner sc=new Scanner(System.in);

	while(true){
		System.out.print("\nEnter operator: ");
        symb = sc.next();
		switch(symb){
			case "+":
			System.out.print("Enter operand: ");
			val=sc.nextDouble();
			c.add(val);
			break;
			
			case "-":
			System.out.print("Enter operand: ");
			val=sc.nextDouble();
			c.sub(val);
			break;
			
			case "*":
			System.out.print("Enter operand: ");
			val=sc.nextDouble();
			c.mul(val);
			break;
			
			case "/":
			System.out.print("Enter operand: ");
			val=sc.nextDouble();
			c.div(val);
			break;
			
			case "%":
			System.out.print("Enter operand: ");
			val=sc.nextDouble();
			c.mod(val);
			break;
			
			case "C":
			val=01.0;
			c.clear(val);
			break;
			
			default:
			System.out.println("Invalid operation! please try again");
			System.exit(0);
		}
	}

	}
}
			
			