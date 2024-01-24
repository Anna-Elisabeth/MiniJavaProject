package People;

public class People {

	private String firstName;

	private String surname;

	private String address;

	private long telephone;

	private int id;

	private static int count = 1000;

	public People() {
		super();
		this.id = ++count;

	}

	public People(String firstName, String surname, String address, long telephone) {
		super();
		this.firstName = firstName;
		this.surname = surname;
		this.address = address;
		this.telephone = telephone;
		this.id = ++count;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getTelephone() {
		return telephone;
	}

	public void setTelephone(long telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "People [firstName=" + firstName + ", surname=" + surname + ", address=" + address + ", telephone="
				+ telephone + ", getFirstName()=" + getFirstName() + ", getSurname()=" + getSurname()
				+ ", getAddress()=" + getAddress() + ", getTelephone()=" + getTelephone() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
