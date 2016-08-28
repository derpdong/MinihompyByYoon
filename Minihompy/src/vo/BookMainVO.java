package vo;

import java.util.Date;

public class BookMainVO {
	private int bookNo;
	private int userNo;
	private int writerUserNo;
	private String content;
	private String writerId;
	private String writerName;
	private Date regDate;
	
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public int getWriterUserNo() {
		return writerUserNo;
	}
	public void setWriterUserNo(int writerUserNo) {
		this.writerUserNo = writerUserNo;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriterId() {
		return writerId;
	}
	public void setWriterId(String writerId) {
		this.writerId = writerId;
	}
	public String getWriterName() {
		return writerName;
	}
	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "BookMainVO [bookNo=" + bookNo + ", userNo=" + userNo + ", writerUserNo=" + writerUserNo + ", content="
				+ content + ", writerId=" + writerId + ", writerName=" + writerName + ", regDate=" + regDate + "]";
	}
}
