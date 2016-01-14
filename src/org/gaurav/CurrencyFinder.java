package org.gaurav;

import net.webservicex.Country;
import net.webservicex.CountrySoap;

public class CurrencyFinder {

	public static void main(String[] args) {
		Country countryService  = new Country();
		CountrySoap countrySoap = countryService.getCountrySoap();
		 String countries = countrySoap.getCountries();
		System.out.println(countries);

	}

}
