package assignment1_10513826;
public class ElseAndIf {
    public static void main( String[] args )
	{
		int people = 30;
		int cars = 40;
		int buses = 15;

		if ( cars > people )
		{
			System.out.println( "We should take the cars." );
		}
		if ( cars < people )
		{
			System.out.println( "We should not take the cars." );
		}
		else
		{
			System.out.println( "We can't decide." );
		}


		if ( buses > cars )
		{
			System.out.println( "That's too many buses." );
		}
		else if ( buses < cars )
		{
			System.out.println( "Maybe we could take the buses." );
		}
		else
		{
			System.out.println( "We still can't decide." );
		}


		if ( people > buses )
		{
			System.out.println( "All right, let's just take the buses." );
		}
		else
		{
			System.out.println( "Fine, let's stay home then." );
		}

	}
}
/*Q1 The if statement tests a condition and if it is satisfied, the code block in the
curly brasis is executed. If the statement is false, the compiler jumps to the else if 
statement and tests the condition.

Q2 When the else is erased from the else if statement, the if is considered as a new condition
to be tested, hence the next else statement is executed when the condition for the if statement 
is not satisfied
*/