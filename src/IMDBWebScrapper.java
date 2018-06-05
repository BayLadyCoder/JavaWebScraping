// Final Project CSIT 211: Web Scrapper
// Names:  Rachada Chairangsaris(Bay),  Oluwatobiloba Odebo(Toby),  Matt Kline


public class IMDBWebScrapper extends IMDBMethodsWithCode
{

	public String IMDBScrapAndPrint (String url)
	{
		String result = super.print(super.doScrapping(url));
		return result;
	}
	
	public String IMDBSortRatesHighToLow(String url)
	{
		String result = super.print(super.sortRatesHighToLow(super.doScrapping(url)));
		return result;
	}
	
	
	public String IMDBSortRatesLowToHigh(String url)
	{
		String result = super.print(super.sortRatesLowToHigh(super.doScrapping(url)));
		return result;
	}
	
	
	public String IMDBSortRankLastToFirst(String url)
	{
		String result = super.print(super.sortLastToFirst(super.doScrapping(url)));
		return result;
	}

	public String IMDBScrapAndSearch (String url, String search)
	{	
		String result = super.print(super.search(super.doScrapping(url), search));
		return result;
	}
}
