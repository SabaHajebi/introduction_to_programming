
import java.io.FileOutputStream;

public class FileOutputStreamExample
{  
	public static void main(String args[])
	{    
		try
		{    
			FileOutputStream fout = new FileOutputStream("out.txt");    
			fout.write(65);    
			fout.close();    
			System.out.println("success...");    
		}catch(Exception e){System.err.println(e);}    
	}    
}

/*FileOutputStream: Write a string

import java.io.FileOutputStream;
public class FileOutputStreamExample
{  
  public static void main(String args[])
  {    
      try
      {    
          FileOutputStream fout=new FileOutputStream("out.txt");    
          String s="Welcome to Java";    
          byte b[]=s.getBytes(); // Converting string into byte array    
          fout.write(b);    
          fout.close();    
          System.out.println("success...");    
      }catch(Exception e){System.err.println(e);}    
  }    
}

// FileInputStream: Read a single byte

import java.io.FileInputStream;
 
public class DataStreamExample
{  
    public static void main(String args[])
    {    
        try
        {    
            FileInputStream fin = new  FileInputStream("out.txt");    
            int i = fin.read();  
            System.out.println((char)i);    
            fin.close();    
         }catch(Exception e){System.err.println(e);}    
    }    
} 

// FileInputStream: Read all bytes

import java.io.FileInputStream;
  
public class DataStreamExample
{  
    public static void main(String args[])
    {    
        try
        {    
            FileInputStream fin = new FileInputStream("out.txt");    
            int i=0;    
            while((i=fin.read())!=-1)
            {    
                System.out.print((char)i);    
            }    
            fin.close();    
            }catch(Exception e){System.err.println(e);}    
      }    
} 

/ BufferedOutputputStream: write bytes

// We are writing the textual information in the
// BufferedOutputStream object which is connected
// to the FileOutputStream object

import java.io.*;
 
public class BufferedOutputStreamExample
{    
    public static void main(String args[]) throws Exception
    {    
        FileOutputStream fout = new FileOutputStream("out.txt");    
        BufferedOutputStream bout = new BufferedOutputStream(fout);
   
        String s = "Welcome to Java";    
        byte b[] = s.getBytes();
  
        bout.write(b);    
        bout.flush();    
        bout.close();    
        fout.close();
    
        System.out.println("success");    
    }    
} 

// Unlike FileOutputStream class, you do not need
// to convert a string into a byte array

import java.io.FileWriter;
 
public class FileWriterExample
{  
    public static void main(String args[])
    {    
        try
        {    
            FileWriter fw = new FileWriter("out.txt");    
            fw.write("Welcome to Java");    
            fw.close();    
         }catch(Exception e){System.out.println(e);}
  
         System.out.println("Success...");    
     }    
} 

// Returns -1 at the end of file

import java.io.*;  
public class BufferedReaderExample
{  
    public static void main(String args[]) throws Exception
    {    
        FileReader fr = new FileReader("out.txt");    
        BufferedReader br = new BufferedReader(fr);    
  
        int i;    
        while((i=br.read())!=-1)
        {  
            System.out.print((char)i);  
        }

        br.close();    
        fr.close();    
    }    
} 
import java.io.*;
import java.util.Scanner;

public class Write
{
    public static void toDocument(FileWriter writer) throws Exception
    {

        BufferedWriter buffer = new BufferedWriter(writer);  	
	InputStreamReader r = new InputStreamReader(System.in);    
        BufferedReader br = new BufferedReader(r);   

	System.out.print("Enter next word: ");
	
	String word;
	while ((word = br.readLine()) != null && !(word.equals("done")))
	{ 
	    buffer.write(word);
	    buffer.write(" ");
	    System.out.print("Enter next word: ");
	}
	buffer.close();
    }

    public static void main(String[] args) throws Exception
    {
	FileWriter writer = new FileWriter(args[0]);  
        toDocument(writer);
    }
}
*/
