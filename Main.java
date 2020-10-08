import java.util.Scanner;
/**
 *Outputs the biggest number in an array of 10 numbers
 * @author Jackson
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //scanner for input
    Scanner input = new Scanner(System.in);

    //create an array for numbers
    int[] nums = new int[10];

    //ask for intergers
    System.out.println("Please enter in 10 integers to put into the array");

    //get numbers from the user and store them in array
    for(int i = 0; i < nums.length; i++){
      nums[i] = input.nextInt();
    }

    int bigNum = nums[0];

    //find the largest number in array
    for(int i = 0; i < 10; i++){
      if(nums[i] > bigNum){
        bigNum = nums[i];
      }
    }

    System.out.println("The largest number is " + bigNum);



    
  }
}
