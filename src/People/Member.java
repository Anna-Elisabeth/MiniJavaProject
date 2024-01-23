package People;

public class Member extends People {

	public Member() {
		super();
	}

	public Member

	(String firstName, String surname, String address, long telephone) {
		super(firstName, surname, address, telephone);
		setFirstName(firstName);
		setSurname(surname);
		setAddress(address);
		setTelephone(telephone);

	}

	@Override
	public String toString() {
		return "Member [getId()=" + getId() + ", getFirstName()=" + getFirstName() + ", getSurname()=" + getSurname()
				+ ", getAddress()=" + getAddress() + ", getTelephone()=" + getTelephone() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
