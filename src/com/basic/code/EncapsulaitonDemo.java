package com.basic.code;
public class EncapsulaitonDemo {
	
private String name;
private String city;
private int age;

public void setName(String name)
{
this.name=name;
}


public String getName()
{
return name;
}


public void setCity(String city)
{
this.city=city;
}


public String getCity()
{
return city;
}


public void setAge(int age)
{
this.age=age;
}


public int getAge()
{
return age;
}


public static void main(String[] args) {
	
	
EncapsulaitonDemo e=new EncapsulaitonDemo();
e.setName("amarjeet");
e.setCity("Hyd");
e.setAge(22);
System.out.println(e.getName()+"\n"+e.getCity()+"\n"+e.getAge()
);


}
}
