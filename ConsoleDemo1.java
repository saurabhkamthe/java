package ClassDefination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleDemo1 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br;
		br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter String");
		System.out.println(" 'quit'");
		String i;
		while(!(i=br.readLine()).equals("quit"))
		{
			System.out.println(i);
			
		}
		
		br.close();
		

	}

}
