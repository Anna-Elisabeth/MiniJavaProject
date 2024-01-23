package LibraryItems;

import java.util.Objects;

public class Thesis extends Item {

	private String university;

	public Thesis() {
		super();
	}

	public Thesis(String title, String author, int publicationDate, String university) {
		super(title, author, publicationDate);
		setTitle(title);
		setAuthor(author);
		setPublicationDate(publicationDate);
		this.university = university;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	@Override
	public String toString() {
		return "Thesis [university=" + university + ", getUniversity()=" + getUniversity() + ", lateFee()=" + lateFee()
				+ ", getId()=" + getId() + ", getTitle()=" + getTitle() + ", getAuthor()=" + getAuthor()
				+ ", getPublicationDate()=" + getPublicationDate() + ", isBorrowed()=" + isBorrowed() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	@Override
	public float lateFee() {

		return 2.20F;

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Thesis other = (Thesis) obj;
		return Objects.equals(university, other.university);
	}

}
