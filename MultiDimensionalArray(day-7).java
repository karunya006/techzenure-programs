/**program to display   MultiDimensionalArray 

 * 
 */
package nums;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int[][] n=new int[5][6];
		System.out.println(n);
		System.out.println();
		
		System.out.println("array size =" + n.length);
		System.out.println();
		
		for( int i=0;i<n.length;i++) {
			System.out.println("size of n[" +i+"] = " + n[i].length);
		}
	}
	

}
