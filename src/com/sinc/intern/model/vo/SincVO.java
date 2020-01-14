package com.sinc.intern.model.vo;

public class SincVO {
	private String id, pwd, name;
	
	public SincVO() {
		super();
	}
	public SincVO(String id, String pwd, String name) { // 필요에 따라 객체를 생성할 수 있는 parameter 수 조절
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}
	/* getter & setter */
	public String getId() { return id; }
	public void setId(String id) { this.id = id; }

	public String getPwd() { return pwd; }
	public void setPwd(String pwd) { this.pwd = pwd; }

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	
	public void printAll() {
		System.out.println(id + "\t" + pwd + "\t" + name);
	}
}
