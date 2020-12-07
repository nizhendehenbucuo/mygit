package com.nnxy.team3;

public class Chenzhenshen {
	private String id;
	private String name;
	private boolean sex;
	private String love;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public String getLove() {
		return love;
	}
	public void setLove(String love) {
		this.love = love;
	}
	@Override
	public String toString() {
		return "Chenzhenshen [学号：" + id + ", 姓名：" + name + ", 性别：" + sex + ", 爱好：" + love + "]";
	}
    public static void main(String[] arcy) {
		Chenzhenshen c1=new Chenzhenshen();
		c1.id="20160217105";
	}
}

