package ClassDefination;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class BufferDemo1 {

	public static void main(String[] args) {
		BufferedWriter bw;
		
		try
		{
			bw=new BufferedWriter(new FileWriter("/home/student/Kiran/kkc.txt")); 
			
			bw.write("hello");
			bw.newLine();
			bw.write("kiran");
			bw.newLine();
			bw.flush();
			bw.close();
			
			
		}
		catch (IOException e) {
			// TODO: handle exception
		}
		
	}

}
