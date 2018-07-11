package com.sun.builder;

/**
 * 
 * @author sthambi
 * Name: Sundar Thambidurai
 * Email: imsundart@gmail.com
 *
 */
public class Person {

	private int personId;
	private String firstName;
	private String lastName;
	private GENDER gender;

	/**
	 * @return the personId
	 */
	public int getPersonId() {
		return personId;
	}

	/**
	 * @param personId
	 *            the personId to set
	 */
	public void setPersonId(int personId) {
		this.personId = personId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the gender
	 */
	public GENDER getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(GENDER gender) {
		this.gender = gender;
	}
	
	/**
	 * 
	 * @return the PersonBuilder object
	 */
	public static PersonBuilder builder() {
		return new PersonBuilder(new Person());
	}

	public static class PersonBuilder {
		private Person person;

		/**
		 * @param person
		 */
		public PersonBuilder(Person person) {
			super();
			this.person = person;
		}

		/**
		 * 
		 * @param id
		 * @return the builder with Person Id
		 */
		public PersonBuilder setPersonId(int id) {
			person.setPersonId(id);
			return this;
		}

		/**
		 * 
		 * @param firstName
		 * @return the builder with First Name
		 */
		public PersonBuilder setFirstName(String firstName) {
			person.setFirstName(firstName);
			return this;
		}

		/**
		 * 
		 * @param lastName
		 * @return the builder with Last Name
		 */
		public PersonBuilder setLastName(String lastName) {
			person.setLastName(lastName);
			return this;
		}

		/**
		 * 
		 * @param gender
		 * @return the builder with Gender
		 */
		public PersonBuilder setGender(GENDER gender) {
			person.setGender(gender);
			return this;
		}

		public Person build() {
			return person;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [personId=").append(personId).append(", firstName=").append(firstName).append(", lastName=").append(lastName)
				.append(", gender=").append(gender).append("]");
		return builder.toString();
	}

}
