//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab01c
{
	public static void main( String args[] ) throws IOException

   {
      File file = new File("lab01c.dat");
      Scanner scanner = new Scanner(file);
      
      while(scanner.hasNextInt()){
               MagicSquare test = new MagicSquare(scanner.nextInt());
               test.createMagic();
               out.println(test);
               }
   }
}

