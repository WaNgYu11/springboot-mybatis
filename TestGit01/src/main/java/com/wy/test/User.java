package wy.hr.entity;

public class User {
	private Integer uno;// INT PRIMARY KEY AUTO_INCREMENT,#用户编号
	
	private String ucode;// VARCHAR(50) NOT NULL,
	private Employee employee;
	private String uname;// VARCHAR(10) NOT NULL,#用户姓名
	private String upassword;// VARCHAR(20) NOT NULL,#用户密码
	private String upic;// VARCHAR(100) NOT NULL,#用户头像
	private String uphone;// VARCHAR(11) NOT NULL,#用户电话
	private Role role;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Integer getUno() {
		return uno;
	}

	public void setUno(Integer uno) {
		this.uno = uno;
	}

	public String getUcode() {
		return ucode;
	}

	public void setUcode(String ucode) {
		this.ucode = ucode;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public String getUpic() {
		return upic;
	}

	public void setUpic(String upic) {
		this.upic = upic;
	}

	public String getUphone() {
		return uphone;
	}

	public void setUphone(String uphone) {
		this.uphone = uphone;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
