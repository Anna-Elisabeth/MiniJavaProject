package LibraryItems;

import java.util.Objects;

public abstract class Item implements Comparable<Item> {

//	fields
	private String title;

	private String author;

	private int publicationDate;

	private boolean borrowed;

	private int id;

	private static int count = 1;

//	constructors
	public Item() {
		super();
		this.id = ++count;
		borrowed = false;

	}

	public Item(String title, String author, int publicationDate)

	{
		super();
		this.id = ++count;
		setTitle(title);
		setAuthor(author);
		setPublicationDate(publicationDate);
		borrowed = false;

	}

//	getters/setters

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(int publicationDate) {
		this.publicationDate = publicationDate;
	}

	public boolean isBorrowed() {
		return borrowed;
	}

	public void setBorrowed(boolean borrowed) {
		this.borrowed = borrowed;
	}
//	methods

	public abstract float lateFee();

	@Override
	public String toString() {
		return "Item [title=" + title + ", author=" + author + ", publicationDate=" + publicationDate + ", borrowed="
				+ borrowed + ", id=" + id + ", getId()=" + getId() + ", getTitle()=" + getTitle() + ", getAuthor()="
				+ getAuthor() + ", getPublicationDate()=" + getPublicationDate() + ", isBorrowed()=" + isBorrowed()
				+ ", lateFee()=" + lateFee() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public int compareTo(Item o) {
		return this.title.compareTo(o.title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(author, other.author) && publicationDate == other.publicationDate
				&& Objects.equals(title, other.title);
	}

}
