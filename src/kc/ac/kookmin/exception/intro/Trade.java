package kc.ac.kookmin.exception.intro;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Trade {
	
public void readFile() {
	
	BufferedReader in = null;
	
	String path = "C:\\exercise\\a.txt"; //user ���� ������ �ѱ��̶� �����Ƿ� ���⿡ ������
	System.out.println(path);
	String file=null;
	try{
		
		in = new BufferedReader(new FileReader(path));
		
	
	while((file=in.readLine())!=null){ //
	System.out.println(file);
	}

		
	}catch(Exception e){
		System.out.println("Error:" +e);
		
	}
	finally{
		try {
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
	}



