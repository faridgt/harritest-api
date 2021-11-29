package dev.harritest.api.apicountries.countries;

public class CountriesTest {
private String cnt;

public CountriesTest() {
}

public CountriesTest(String cnt) {
	super();
	this.cnt = cnt;
}

public String getCnt() {
	return cnt;
}

public void setCnt(String cnt) {
	this.cnt = cnt;
}

@Override
	public String toString() {
		return String.format("test of list of country content for %s for ",cnt);
	}


}
