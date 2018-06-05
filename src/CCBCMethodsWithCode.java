// Final Project CSIT 211: Web Scrapper
// Names:  Rachada Chairangsaris(Bay),  Oluwatobiloba Odebo(Toby),  Matt Kline

import java.io.IOException;
import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class CCBCMethodsWithCode extends AbstractScrapper {
	
	public Object[] doScrapping (String url) // defined scraping method
	{
		super.toString();

		Document website = null;
		
		try 
		{	website = Jsoup.connect(url).get();	} 
		catch (IOException ioe) 
		{	ioe.printStackTrace();	}
		
		Elements element = website.getElementsByTag("ul");
		Elements rows = element.select("li.acalog-course span");

		Queue<String> dataQueue1 = new LinkedList<String>();
		Queue<String> dataQueue2 = new LinkedList<String>();
		
		int count = 0;

		for (Element row : rows) 
		{
			Elements columns = row.select("a");
			String course =  columns.text();
			String credits = row.select("strong").text();
			
			dataQueue1.add(course+ "\t" + credits);
			dataQueue2.add(credits+ "\t" + course);
			count++;
		}		
	
	String[] array1 = new String [count];
	String[] array2 = new String [count];
	
	for (int j = 0 ; j< count; j++) // transfer data from queue to array
	{
		String eachCourse = dataQueue1.remove();	
		array1 [j] = eachCourse;
		String eachCredits = dataQueue2.remove();	
		array2 [j] = eachCredits;
	}
	
	return new Object[] {array1, array2} ;
	}
	
	
	
	
	
	public Object[] sortCreditsLowtoHigh(Object[] object)
	{
		return super.sortAtoZ(object, 1);
	}
	
	
	
	public Object[] sortCreditsHightoLow(Object[] object)
	{
		return super.sortZtoA(object, 1);
    }
	
	
	
	
}

