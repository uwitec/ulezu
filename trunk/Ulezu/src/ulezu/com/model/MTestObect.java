package ulezu.com.model;

import java.util.Date;

public class MTestObect {
	private String user;
	private int age;
	private String sex;
	private Date bir;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBir() {
		return bir;
	}
	public void setBir(Date bir) {
		this.bir = bir;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "user:" + user + ";age:" + age + ";sex:" + sex + ";bir:" + bir.toString();
	}
	
	public static void main(String[] args) {
		MTestObect m = new MTestObect();
		m.setAge(12);
		m.setBir(new Date());
		m.setSex("男");
		m.setUser("秦伟");
		System.out.println(m);
	}
}
