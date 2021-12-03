
public class News {

	int newsid;
	String postedbyuser;
	String commentsbyuser;
	String comment;
	
	News(int newsid,String postedbyuser,String commentsbyuser,String comment)
	{
		this.newsid=newsid;
		this.postedbyuser=postedbyuser;
		this.commentsbyuser=commentsbyuser;
		this.comment=comment;
		
	}

	@Override
	public String toString() {
		return "News [newsid=" + newsid + ", postedbyuser=" + postedbyuser + ", commentsbyuser=" + commentsbyuser
				+ ", comment=" + comment + "]";
	}
	
}
