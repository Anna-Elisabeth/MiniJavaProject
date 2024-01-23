package AllItems;

import java.util.ArrayList;

import LibraryItems.Item;

public class TotalLibrary {

	private String council;

	private ArrayList<Item> items = new ArrayList<>();

	private ArrayList<Item> borrowed = new ArrayList<>();

	public void checkOut(Item item) {

		item.setBorrowed(true);

		borrowed.add(item);

	}

	public void checkIn(Item item) {

		item.setBorrowed(false);
		borrowed.remove(item);

	}

	public TotalLibrary() {
		super();
	}

	public TotalLibrary(String council) {
		super();
		this.council = council;

	}

	public String getCouncil() {
		return council;
	}

	public void setCouncil(String council) {
		this.council = council;
	}

	public void addItem(Item item) {

		items.add(item);
	}

	public void removeItem(Item item) {

		items.remove(item);
	}

	public void removeItem(int index) {

		items.remove(index);
	}

	@Override
	public String toString() {
		return "TotalLibrary [council=" + council + ", items=" + getItems() + ", borrowed=" + borrowed
				+ ", getCouncil()=" + getCouncil() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
