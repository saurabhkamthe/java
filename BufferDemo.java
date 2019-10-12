package ClassDefination;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferDemo {

	public static void main(String[] args) {
		BufferedReader br;
		
		try
		{
			br=new BufferedReader(new FileReader("/home/student/Kiran/emp.json"));
			String i;
			while((i=br.readLine())!= null)
			{
				System.out.println(i);
				
			}
			br.close();
			
		}
		
		catch (Exception e) {
			// TODO: handle exception
		}

	}

}
