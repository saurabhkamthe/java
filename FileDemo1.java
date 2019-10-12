package ClassDefination;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileDemo1 {

	public static void main(String[] args) {
		FileWriter fr;
		BufferedReader br;
		try {
		fr=new FileWriter("/home/student/Kiran/kkc.txt");
		br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter string");
		String i;
		while(!(i=br.readLine()).equals("quit"))
		{
		
			fr.write(i);
			
		}
		fr.close();
		}
		catch (IOException e) {
			
			e.printStackTrace();
			// TODO: handle exception
		}

	}

}
