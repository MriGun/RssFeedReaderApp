package RssFeed;

import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JaxbRssReader {

	public static void main(String[] args) throws JAXBException, MalformedURLException,IOException {
		
		JAXBContext context = JAXBContext.newInstance(Rss.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Rss r = (Rss) unmarshaller.unmarshal(new URL("http://rss.cnn.com/rss/edition.rss"));
		FileWriter myWriter = new FileWriter("D:\\a.rss");
		List<Item> items = r.c.items;
		for(Item it : items)
		{
			System.out.println("Title"+it.title);
			System.out.println("---Link---"+it.link);
			try {
				myWriter.write("Title:"+it.title+"\n");
				myWriter.write("Link:"+it.title+"\n");
				myWriter.write("Descripption:"+it.description+"\n");
			}catch(IOException e) {e.printStackTrace();}
			
			try {
				List<MediaContent>mcs =   it.media.getMediaContentList();
				for(MediaContent mc : mcs)
				{
					myWriter.write("<imageLink> "+mc.getImageUrl()+" </imageLink>\n");
				}
			}catch(Exception e) {e.printStackTrace();}
			
		}
		
		myWriter.close();

	}

}
