package LibraryItems;

import java.util.Objects;

public class Map extends Item {

	private String geographicArea;

	public Map() {
		super();
	}

	public Map(String title, String author, int publicationDate, String geographicArea) {
		super(title, author, publicationDate);
		this.geographicArea = geographicArea;
	}

	public String getGeographicArea() {
		return geographicArea;
	}

	public void setGeographicArea(String geographicArea) {
		this.geographicArea = geographicArea;
	}

	@Override
	public String toString() {
		return "Map [geographicArea=" + geographicArea + ", getGeographicArea()=" + getGeographicArea() + ", lateFee()="
				+ lateFee() + ", getId()=" + getId() + ", getTitle()=" + getTitle() + ", getAuthor()=" + getAuthor()
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
		Map other = (Map) obj;
		return Objects.equals(geographicArea, other.geographicArea);
	}

}
