package com.sinc.intern.oop.sub.model.vo;

import com.sinc.intern.oop.model.vo.PersonVO;

public class StudentVO extends PersonVO {
	private String ssn;

	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentVO(String name, int age, char gender, String ssn) {
		super(name, age, gender);
		this.setSsn(ssn);
		// TODO Auto-generated constructor stub
	}
	
	public void setSsn(String ssn) { this.ssn = ssn; }
	public String getSsn() { return this.ssn; }
	
	public String stuInfo() {
		return super.perInfo() + "\t" + this.getSsn();
	}
	
	@Override
	public String perInfo() {
		return super.perInfo() + "\t" + this.getSsn();
	}
}
