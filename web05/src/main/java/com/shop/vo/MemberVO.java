package com.shop.vo;

public class MemberVO {
	private int seq;
	private String userId;
	private String pw;
	private String email;
	private String question;
	private String answer;
	private String regDate;
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getUserid() {
		return userId;
	}
	public void setUserid(String userId) {
		this.userId = userId;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getRegdate() {
		return regDate;
	}
	public void setRegdate(String regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "MemVO [seq=" + seq + ", userId=" + userId + ", pw=" + pw + ", email=" + email + ", question=" + question
				+ ", answer=" + answer + ", regDate=" + regDate + "]";
	}
	
}		
