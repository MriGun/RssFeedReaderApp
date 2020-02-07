package RssFeed;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class Media {
	
	//@XmlElement  //, namespace = "http://search.yahoo.com/mrss/"
	//private String content;
	@XmlElement(name = "content",namespace="http://search.yahoo.com/mrss/")
	private List<MediaContent> mediaContentList;
	
	
	public List<MediaContent> getMediaContentList() {
		return mediaContentList;
	}
	public void setMediaContentList(List<MediaContent> mediaContentList) {
		this.mediaContentList = mediaContentList;
	}
	
	
	
}
