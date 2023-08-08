/** program  to display   palindrome
@ since  day -6
**/
package techzenure;
import java.util.Scanner;
public class Palindrome
{
  private static final String Text = null;
  public static boolean Palindrome(String Text) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a word: ");
    Text=input.next();
     System.out.println();
    Text = Text.toLowerCase();
       
        String reverse = new StringBuilder(Text).reverse().toString();
        if( Text.equals(reverse)){
          return true;
        }else{
          return false;
        }
    }
    
  public static void main(String[] args) {
        System.out.println(Palindrome(Text));
    }
}

	       



	   



	


