package com.sun.builder;

/**
 * 
 * @author sthambi
 * Name: Sundar Thambidurai
 * Email: imsundart@gmail.com
 *
 */
public class BuilderTester {

	public static void main(String[] args) {
		Person p1 = Person.builder().setFirstName("Sundar").setLastName("T").setPersonId(109).setGender(GENDER.MALE).build();
		Person p2 = Person.builder().setFirstName("Suganya").setGender(GENDER.FEMALE).build();
		System.out.println(p1);
		System.out.println(p2);
	}

}
