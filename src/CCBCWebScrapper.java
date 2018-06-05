// Final Project CSIT 211: Web Scrapper
// Names:  Rachada Chairangsaris(Bay),  Oluwatobiloba Odebo(Toby),  Matt Kline




public class CCBCWebScrapper extends CCBCMethodsWithCode {
	
	public String CCBCScrapAndPrint (String url)
	{
		String result = super.print(super.doScrapping(url));
		return result;
	}	
	
	public String CCBCScrapAndSortAtoZ (String url)
	{
		String result = super.print(super.sortAtoZ(super.doScrapping(url), 0));
		return result;
	}
	
	public String CCBCScrapAndSortZtoA (String url)
	{
		String result = super.print(super.sortZtoA(super.doScrapping(url), 0));
		return result;
	}
	
	public String CCBCScrapAndSortCreditsLowToHigh (String url)
	{
		String result = super.print(super.sortCreditsLowtoHigh(super.doScrapping(url)));
		return result;
	}
	
	public String CCBCScrapAndSortCreditsHighToLow (String url)
	{
		String result = super.print(super.sortCreditsHightoLow(super.doScrapping(url)));
		return result;
	}
	
	public String CCBCScrapAndSearch (String url, String search)
	{
		String result = super.print(super.search(super.doScrapping(url), search));
		return result;	
	}
}	