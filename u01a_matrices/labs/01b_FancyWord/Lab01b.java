//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab01b
{
	public static void main( String args[] ) throws IOException
	{
      File file = new File("lab01b.dat");
      Scanner scanner = new Scanner(file);
      int max =scanner.nextInt();
      scanner.nextLine();
      for(int i=0;i<max;i++){
               FancyWord test = new FancyWord(scanner.nextLine());
               out.println(test);
	}
}
}
