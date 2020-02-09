package RssFeed;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadRssFeed implements Runnable{

	private Object lock;
	
	public ReadRssFeed(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		
		  synchronized (lock) {
			  
			  File f1=new File("D:\\a.rss"); //Creation of File Descriptor for input file
		      String[] words=null;  //Intialize the word Array
		      try {
		    	  FileReader fr = new FileReader(f1);  //Creation of File Reader object
			      BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
			      String line;     
			      String istinput="<imageLink>";   // Input word to be searched 
			      while((line =br.readLine())!=null)
			      {
			    	  
			    	  words=line.split(" ");  //Split the line using space
			          for (String word : words) 
			          {
			        	  //System.out.println("line"+word);   
			        	  if (word.equals(istinput))   //Search for the given word
			                 {
			                	 System.out.println("image like is"+words[1]);
			                 }
			          }
			      } 
		      }catch(IOException e) {e.printStackTrace();}
			
		  }
	}

}
