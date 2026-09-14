//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab01a
{
	public static void main( String args[] ) throws IOException
	{
      File file = new File("lab01a.dat");
      Scanner scanner = new Scanner(file);
      int number=1;
      int max =scanner.nextInt();
      for(int i=0;i<max;i++){
               number = scanner.nextInt();
               PascalsTriangle test = new PascalsTriangle(number+1);
               test.createTriangle();
               out.print(test);}
	}
}

