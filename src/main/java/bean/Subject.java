package bean;

public class Subject extends School implements java.io.Serializable {
	private String school; //学生名
	private String cd; //コース番号
	private String name;
	
	public String getSchool() {
		return school;
	}
	public String getCd() {
		return cd;
	}
	public String getName() {
		return name;
	}
	
	public void setSchool(String school) {
		this.school= school;
	}
	public void setCd(String cd) {
		this.cd = cd;
	}
	public void setName(String name) {
		this.name = name;
	}

}