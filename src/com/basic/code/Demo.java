package com.basic.code;
public class Demo {
	private String Name;
	private String City;
	private int Age;
	private int Salary;
	
	void setName(String Name)
	{
		this.Name=Name;
	}
	
	String getName()
	{
		return Name;
	}
	
	void setCity(String City)
	{
		this.City=City;
	}
	
	String getCity()
	{
		return City;
	}
	
	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public static void main(String[] args) {
		
	Demo d=new Demo();
	d.setName("Lalit Kumar");
	d.setCity("Bpl");
	d.setAge(22);
	d.setSalary(22000);
	System.out.println(d.getName()+"\n"+d.getCity()+"\n"+d.getAge()+"\n"+d.getSalary());
		
	}
}