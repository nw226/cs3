//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class MagicSquare
{
	private int[][] magicSquare;

	public MagicSquare()
	{
		setSize(0);
	}

	public MagicSquare(int size)
	{
   magicSquare=new int[size][size];
	}
	
	public void setSize(int size)
	{
   magicSquare=new int[size][size];
	}

	public void createMagic()
	{
		int num = 1;
		int r=0;
      int c=magicSquare.length/2;
      magicSquare[0][magicSquare.length/2]= num;
      for(int i=0;i<magicSquare.length*magicSquare.length;i++){
      r-=1;
      c+=1;
      num+=1;
      
      if(r<0)
         r+=magicSquare.length;
      if(c>=magicSquare.length)
         c=0;

      if(magicSquare[r][c]==0)   
         magicSquare[r][c]=num;
      else{
         r+=1;
         if(r>=magicSquare.length)
         r=0;
         magicSquare[r][c]=num;}
      magicSquare[0][magicSquare.length/2]-=magicSquare.length*magicSquare.length;
         
      }
	}

   public String toString()
	{
      String output="";
		for(int r=0; r<magicSquare.length; r++)
		{
			for(int c=0; c<magicSquare[r].length; c++)
			{
				output+=magicSquare[r][c]+" ";
			}
			output+="\n";
		}    
		return output;
	}
}

