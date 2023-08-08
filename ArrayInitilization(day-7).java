/**program to display   Array Initilization
 * 
 */
package nums;

public class ArrayInitilization {

	public static void main(String[] args) {
		int[] marks= {87,90,96,83,57,78};
		System.out.println(marks);
		System.out.println("no of subject ="+ marks.length);
		System.out.println();
		
		//---array iteration using loop---
		for(int i=0;i<marks.length;i++) {
			System.out.println("mark for subject =" + (i+1) + "=" +marks[i]);
			}
		System.out.println();
		
			//---array iteration using  for loop---
			for(int i=0;i<marks.length;i++) {
				System.out.println("mark for subject =" + (i+1) + "=" +marks[i]);
			}
						System.out.println();
						//....array iteration using enhance for loop/for each loop---
						System.out.println("marks obtain------");
						for(int mark: marks) {
							System.out.print(mark +" | ");
						}
						System.out.println();
						System.out.println( marks[5]);
						
							
						
	
		
		
		
		
		
		

	}

		}
	
