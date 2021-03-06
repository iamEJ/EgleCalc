package lt.vtmc.ems;

import java.util.Scanner;

public class AppMenu {
    private char exit;
    private Scanner input = new Scanner(System.in);

	

    public void mainMenu() throws Exception {
        // TODO
	System.out.println("Simple Java calculator ver. 1.0");
        while (exit != 'y') {           
            arithmeticCalculateMenu();
            exitMenu();
        }
    }

    private void arithmeticCalculateMenu() throws Exception {
        // TODO
        System.out.print("First number: ");
        double x = Double.parseDouble(input.next());
        System.out.print("Second number: ");
        double y = Double.parseDouble(input.next());
        System.out.print("Operator: ");
        String op = input.next();

        double z = 0;

        if (op.equals("+")) {
            z = x + y;
        } else if (op.equals("-")) {
            z = x - y;
        } else if (op.equals("*")) {
            z = x * y;
        } else if (op.equals("/")) {
		if(y==0) {
        	     System.out.println("Error! Dividing by zero is not allowed.");
        	}
            z = x / y;
        } else {
            throw new Exception("Operator not recognized");
        }
        System.out.println("Result: " + z);
    }

    private void exitMenu() {
        // TODO
        System.out.println("Continue (y/n): ");
        String read = input.next().toLowerCase();
        char close = read.charAt(0);
        switch (close) {
            case 'y':
                exit = 'n';
		break;
            case 'n':
                exit = 'y';
                System.out.println("Good luck!");
		break;
            default:
                System.out.println("Wrong symbol!");
                exit = 'n';
        }
    }
}
