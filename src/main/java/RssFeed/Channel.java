package RssFeed;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="channel")

public class Channel {
	@XmlElement(name="item")
	ArrayList<Item> items = new ArrayList<Item>();
	String title;
	String link;
	String description;
	Channelimage image;
	

}