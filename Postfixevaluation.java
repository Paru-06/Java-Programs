//Postfixevaluation

//Program Coding

import java.util.Stack;
public class Postfixevaluation {

    //Method to evaluate a postfix expression

    public static int evaluatePostfix (String expression){

	//Create a stack to store operands
	Stack <Integer> stack= new Stack <>();

	//Traverse each character in the expression
	for (int i =0; i<expression.length(); i++) {
	    char ch= expression.charAt(i);

	    //If the character is a digit, push it to thr stack
	    if(Character.isDigit(ch)){
		stack.push(ch-'0'); //convert char to int
	    }

	    //If the character is an operator, pop tow elements and evaluate
	    else {
		int operand2=stack.pop();
		int operand1=stack.pop();

		//perform the operation
		switch(ch){
		    case'+':
			stack.push(operand1 + operand2);
			break;
		     case'-':
			stack.push(operand1 + operand2);
			break;
		     case'*':
			stack.push(operand1 + operand2);
			break;
		     case'/':
			stack.push(operand1 + operand2);
			break;
		}
	    }
        }

        //The final result is at the top of the stack

        return stack.pop();
    }
        public static void main (String [] args) {

	    //Example postfix expression
	    String postfixExpression = "531*+2-";

	    //Evaluate the postfix expression
	    int result = evaluatePostfix (postfixExpression);

	    //Print the result
	    System.out.println ("The result of the postfix expression \""+ postfixExpression+"\" is:"+ result);
    }
}


//Output:

The result of the postfix expression "531*+2-" is:11
		    