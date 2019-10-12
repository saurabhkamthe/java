package ClassDefination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleDemo {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br;
		br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter charcater");
		System.out.println("'q' as quit");
		int i;
		while((i=br.read())!='q')
		{
			System.out.print((char)i);
			
		}
		
		br.close();
		

	}

}
