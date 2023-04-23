import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
     int integer = in.nextInt();
      ArrayList<Integer>allnum = new ArrayList<Integer>();
      Integer[] array = {};
      for(int i = 0; i < integer; i++)
      {
        int set = in.nextInt();
        allnum.add(set);
      }
      array = allnum.toArray(array);
      int mCount = 0;
      int mValue = 0;
      int count = 0;
      for(int i = 0; i<array.length; i++)
      {
        count = 0;
        for(int q = 0; q<array.length; q++)
        {
          if(array[q] == array[i]) {count++;}
        }
        if(count>mCount){
          mValue = array[i];
        }
      }
      System.out.print(mValue);
    
  }
}
