// Final Project CSIT 211: Web Scrapper
// Names:  Rachada Chairangsaris(Bay),  Oluwatobiloba Odebo(Toby),  Matt Kline

	import java.io.IOException;
	import java.util.*;
	

	import org.jsoup.Jsoup;
	import org.jsoup.nodes.Document;
	import org.jsoup.nodes.Element;
	import org.jsoup.select.Elements;

	public class IMDBMethodsWithCode extends AbstractScrapper {
			

			public Object[] doScrapping (String url)
			{
				super.toString();

				Document website = null;
				
				try 
				{	website = Jsoup.connect(url).get();	} 
				catch (IOException ioe) 
				{	ioe.printStackTrace();	}
				
				Elements element = website.select("tbody.lister-list");
				Elements rows = element.select("tr");

				
				Queue<String> dataQueue1 = new LinkedList<String>();
				Queue<String> dataQueue2 = new LinkedList<String>();
				
				int count = 0;

				for (Element row : rows) 
				{
				Elements column1 = row.select("td.titleColumn");
				Elements column3 = row.select("td.ratingColumn strong");
				
				String rankAndTitle =  column1.text();
				String rate =  column3.text();	
				
				count++;

				dataQueue1.add(rankAndTitle  + "\t" + rate );
				dataQueue2.add( rate + "\t" + rankAndTitle );
				}		
			
			String[] array1 = new String [count];
			String[] array2 = new String [count];
			
			for (int j = 0 ; j< count; j++) // transfer data from queue to array
			{
				String RankTiTleRate = dataQueue1.remove();	
				array1 [j] = RankTiTleRate;
				
				String RateRankTiTle = dataQueue2.remove();	
				array2 [j] = RateRankTiTle;
			}
			
			return new Object[] {array1, array2} ;
			}
			
			
			public Object[] sortRatesLowToHigh(Object[] object)
			{
				return super.sortAtoZ(object, 1);
			}
			
			
			public Object[] sortRatesHighToLow(Object[] object)
			{
				return super.sortZtoA(object, 1);
		    }
			
			
			
		public Object[] sortLastToFirst (Object[] obj)
		{
			String[] array1 = (String[]) obj[0];
			Stack<String> stack1 = new Stack<String>();  // using Stack to sort from last to first 
														//since the regular sort doesn't work in this case 
														// and since the original is already sort from first to last.
			
			
			int count = 0;
			
			for (int i = 0; i < array1.length ; i++)
			{
				String eachMovie = array1 [i];	
				stack1.push(eachMovie);
				count++;
			}
			
			String[] array2 = new String [count];
			
			for (int j = 0; j< count ; j++)
			{
				array2[j] = stack1.pop();
			}
			
			return new Object[] {array2};		}
			
		
	}



