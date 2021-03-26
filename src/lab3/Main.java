package lab3;

/*
* C3 = 0 => StringBuilder
* C17 = 5 => Надрукувати слова без повторень заданого тексту в алфавітному порядку за першою літерою.
* */

import java.util.Arrays;
import java.util.HashSet;
 
/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String text = "some very very long long text with a lot of words";
		String[] words = text.split(" ");
		String[] uniqueWords = new HashSet<String>(Arrays.asList(words)).toArray(new String[0]);
		Arrays.sort(uniqueWords);
 
		System.out.println(Arrays.toString(uniqueWords));
	}
}