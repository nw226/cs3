//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class FancyWord
{
	private char[][] mat;

	public FancyWord()
	{
		mat=new char[0][0];
	}

   public FancyWord(String word)
	{
   mat = new char[word.length()][word.length()];
   for(int c=0;c<word.length();c++){
      mat[0][c]=word.charAt(c);      
      mat[word.length()-1][c]=word.charAt(c);}
	
   
   for(int r=1;r<word.length()-1;r++){
      mat[r][r]=word.charAt(r);
      mat[r][word.length()-1-r]=word.charAt(word.length()-1-r);}
   
   }
   public String toString()
	{
      String output="";
		for(int r=0; r<mat.length; r++)
		{
			for(int c=0; c<mat[r].length; c++)
			{
				output+=mat[r][c]+" ";
			}
			output+="\n";
		}    
		return output;
	}

}

