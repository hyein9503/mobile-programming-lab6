package kr.ac.kookmin.exception.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 Makes numbered.txt the same as original.txt, but with each line numbered.
*/
public class AddLineNumber
{
   public static void main(String[] args)
   {
       String path = "c:\\exercise\\"; //user 안에 폴더가 한글이름이라서 오류나서 여기에 저장
       System.out.println(path);
       String str=null;
       int numberline=1;
      try
      {
         BufferedReader inputStream = 
               new BufferedReader(new FileReader(path+"original.txt"));
         PrintWriter outputStream = 
               new PrintWriter(new FileOutputStream(path+"numbered.txt"));
         
           while((str=inputStream.readLine()) != null)
           {
        	          	
        	outputStream.write(numberline+" ");
        	outputStream.println(str);

        	numberline++;
                
           }
           
           inputStream.close( );
           outputStream.close( );
      }catch(Exception e){
    	  
    	  System.out.println("Error:" +e);
      }
      
   

   }
}
