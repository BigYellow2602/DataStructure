package dataStructure;

import java.util.Stack;

public class StackIO
{
	static void StackPrint(String[] letters)
	{
		Stack<String> stk = new Stack<>() ;
		for(int i=0 ; i<letters.length ; i++ )
		{
			stk.push(letters[i] + " ") ;
		}
		
		System.out.println(stk);
		
		while(! stk.isEmpty())
			{
			System.out.println(stk.pop());
			}
	}

}
