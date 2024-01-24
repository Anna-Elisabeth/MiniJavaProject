package App;

import java.util.Collections;

import AllItems.TotalLibrary;
import LibraryItems.Book;
import LibraryItems.Item;
import LibraryItems.Map;
import LibraryItems.Thesis;
import People.Member;

public class App {

	public static void main(String[] args) {

		Member member1 = new Member("Tom", "Little", "1 Mousehold Lane, Squeaktown", 384499L);

		Item book = new Book("The Chimp Paradox", "Steve Peters", 2012, false);
		Item map = new Map("OS", "OS", 1999, "West Wales");
		Item thesis = new Thesis("The Ways of Women in Transnational Auditory Performativity", "Louise Shelley", 2018,
				"Birmingham");

		Item book2 = new Book("Cold Comfort Farm", "Stella Gibbons", 1932, false);
		Item map2 = new Map("OS", "OS", 2012, "Snowdonia");
		Item thesis2 = new Thesis("Discovering where madness lies", "Julienne Trump", 2021, "Durham");
		Item book3 = new Book("Cold Comfort Farm", "Stella Gibbons", 1932, false);

//		System.out.println(book);
//		System.out.println(map);
//		System.out.println(thesis);

		TotalLibrary library1 = new TotalLibrary("Wolverhampton");

		library1.addItem(thesis);
		library1.addItem(map);
		library1.addItem(book);
		library1.addItem(book2);
		library1.addItem(thesis2);
		library1.addItem(map2);
//		library1.removeItem(book2);

		TotalLibrary lending1 = new TotalLibrary("Wolverhampton loans");

		lending1.checkOut(thesis);
		lending1.checkOut(book);
		lending1.checkIn(book);

		System.out.println(library1);
		System.out.println(book2.equals(book3));

		Collections.sort(library1);

		System.out.println("Items sorted by title:" + library1);

//		System.out.println(member1);

	}

}
