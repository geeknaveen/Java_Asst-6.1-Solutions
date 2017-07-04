/*Declare an integer array of size 10. Initialize using for loop with 1 to 10, and print 
all even numbers from an array. */

package asst6_1;

/*
 * Java array is an object the contains elements of similar data type. It is a data structure where we store similar elements. 
 * We can store only fixed set of elements in a java array.
 * 
 * Array in java is index based, first element of the array is stored at 0 index.
 * */
public class ArrayDemo {

	public static void main(String[] args) {
		
		int a[]=new int[10]; //giving declaration 
		
		//We are creating loop for adding values to the array.
		for(int i=0;i<a.length;i++) {
			a[i] = i+1;
		}
		
		System.out.println("Even numbers between 1-10 are:");
		//We're looping thru the array
		for(int i = 0 ; i < a.length ; i++)
        {
			//Condition to find even numbers
            if(a[i] % 2 == 0)
            {
                System.out.print(a[i]+"\n");
            }
        }
	}

}
