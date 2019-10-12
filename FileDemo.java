package ClassDefination;

import java.io.FileReader;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		
		FileReader fr;
		try {
		fr=new FileReader("/home/student/Kiran/emp.json");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
			
		}
		fr.close();
		}
		catch (IOException e) {
			
			e.printStackTrace();
			// TODO: handle exception
		}

	}

}
