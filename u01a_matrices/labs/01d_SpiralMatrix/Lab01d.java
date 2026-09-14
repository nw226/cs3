//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Lab01d
{
	public static void main( String args[] ) throws IOException
	{
		File file = new File("lab01d.dat");
      Scanner scanner = new Scanner(file);
      while(scanner.hasNextInt()){
               SpiralMatrix test = new SpiralMatrix(scanner.nextInt());
               test.createSpiral();
               out.println(test);
               }
	}
}

