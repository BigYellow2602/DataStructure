package dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueIO
{
	static void QueuePrint(int[] num)
	{
		Queue<Integer> I = new LinkedList<>() ;
		
		for(int i=0 ; i<num.length ; i++)
		{
			I.add(num[i]) ;
		}
		
		System.out.println(I);
		
		while(! I.isEmpty())
		{
			System.out.println(I.poll());
		}
	}

}
