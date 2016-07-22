package cn.com.serveyou.xqy.peixun.chapter2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

class Person {
	// ƒÍ¡‰
	private Integer age;
	//–’√˚
	private String name;
	
	public Person(Integer age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return age.intValue() * 17 + 37;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Person))
			return false;
		Person p = (Person)obj;
		
		boolean bAge = (age == p.age || (age != null && age.equals(p.age)));
		boolean bName = (name == p.name || (name != null && name.equals(p.name)));
		return bAge && bName;
	}

}


public class SetTest {

	@Test
	public void testHashSet() {
		Set<Person> persons = new HashSet<Person>();
		System.out.println(persons.add(new Person(1, "a")));
		System.out.println(persons.add(new Person(3, null)));
		System.out.println(persons.add(new Person(3, null)));
		System.out.println(persons.add(new Person(2, "b")));
		System.out.println(persons.add(new Person(2, "b")));
	}
	
	@Test
	public void testTreeSet() {
		Set<String> names = new TreeSet<String>();
		
	}
}
