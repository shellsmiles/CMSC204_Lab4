/**
 * To sum the values in an array of integers
 * @author y
 */
public class ArraySum {
	
	public ArraySum() {}
	
	/**
	 * 
	 * @param a array in which the elements need to sum.
	 * @param index the number of elements in the array need to sum.
	 * @return
	 */
	public int sumOfArray (Integer[] a, int index)
	{
		if ( index <=0)
			return 0;
		else
			return a[index-1] + sumOfArray (a, index-1);
		
	}
}
