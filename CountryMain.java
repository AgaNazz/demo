package aaaaa;
import java.util.ArrayList;

public class CountryMain {

	public static void main(String[] args) {

		Countries countries = new Countries();

		ArrayList<String> indianStates = new ArrayList<>();
		indianStates.add("Maharashtra");
		indianStates.add("Karnatka");
		indianStates.add("Goa");

		ArrayList<String> usStates = new ArrayList<>();
		usStates.add("California");
		usStates.add("Arizona");
		usStates.add("AlasKa");

		countries.listingCountry("India", indianStates);
		countries.listingCountry("US", usStates);

	
		System.out.println(countries.getCountry("India"));

		System.out.println(countries.getCountry("Srilanka"));

		;
		countries.listCountryBefore("India");

		
		countries.listCountryAfter("US");

	}


	}


