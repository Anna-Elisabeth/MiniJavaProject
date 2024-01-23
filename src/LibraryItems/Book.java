package LibraryItems;

public class Book extends Item {

	private boolean bookerPrize;

	public Book() {

		super();
	}

	public Book(String title, String author, int publicationDate, boolean bookerPrize) {
		super(title, author, publicationDate);
		this.bookerPrize = bookerPrize;
	}

	public boolean isBookerPrize() {
		return bookerPrize;
	}

	public void setBookerPrize(boolean bookerPrize) {
		this.bookerPrize = bookerPrize;
	}

	@Override
	public String toString() {
		return "Book [bookerPrize=" + bookerPrize + ", isBookerPrize()=" + isBookerPrize() + ", lateFee()=" + lateFee()
				+ ", getId()=" + getId() + ", getTitle()=" + getTitle() + ", getAuthor()=" + getAuthor()
				+ ", getPublicationDate()=" + getPublicationDate() + ", isBorrowed()=" + isBorrowed() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	@Override
	public float lateFee() {

		return 1.20F;

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return bookerPrize == other.bookerPrize;
	}

}
