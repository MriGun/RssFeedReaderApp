package RssFeed;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="item")
public class Item {
	String title;
	String link;
	String description;
	String author;
	String category;
	String comments;
	String enclosure;
	String guid;
	String pubDate;
	String source;

    @XmlElement(name = "group", namespace="http://search.yahoo.com/mrss/")
	Media media;
	public long getDate(){
		if(pubDate!=null)return new Date().parse(pubDate);
		else return -1;
	}

}
