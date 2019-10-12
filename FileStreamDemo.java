package ClassDefination;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileStreamDemo {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br=null;
		BufferedWriter bw=null;
		File f=new File("/home/student/Kiran/emp.json");
		File f1=new File("/home/student/Kiran/emp1.json");
		if(f.exists())
		{
			if(f.canRead())
			{
				if(f.length()>100)
				{
					br=new BufferedReader(new FileReader(f));
					bw=new BufferedWriter(new FileWriter(f1)); 
					String i;
					while((i=br.readLine())!= null)
					{
						bw.write(i);
						bw.newLine();
						
						
					}
					bw.flush();
					br.close();
				}
				else
				{
					br=new BufferedReader(new FileReader(f));
					bw=new BufferedWriter(new FileWriter(f1)); 
					int i;
					while((i=br.read())!=-1)
					{
						bw.write(i);
						
						
					}
					bw.flush();
					br.close();
				}
			}
		}
		

	}

}
