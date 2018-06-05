// Final Project CSIT 211: Web Scrapper
// Names:  Rachada Chairangsaris(Bay),  Oluwatobiloba Odebo(Toby),  Matt Kline

public abstract class AbstractScrapper {
	
	protected String website, target;
	
	public  String exportToExcel (String arr)
	{
		String result = arr; // this part we will learn later
	    return result;
	}	
	
	
	public abstract Object[] doScrapping (String url); // need to add specific code for each web page
	
	
	
	
	public Object[] sortAtoZ(Object[] object, int n) // sort A-Z
	{
	String[] array1 = (String[]) object[n];
	int b, c;
    String temp;

    for (b = 0; b < array1.length - 1; b++) // citation: https://mathbits.com/MathBits/Java/arrays/ABCSort.htm
    {
        for (c = b+1; c < array1.length; c++)
        {  
                 if (array1[b].compareToIgnoreCase(array1[c]) > 0) // sorting A-Z
                  {                            // ascending sort
                      temp = array1 [b];
                      array1[b] = array1[c];    // swapping
                      array1[c] = temp; 
                  }
        }
    }

    return new Object[] {array1};
    
	}
	

	
	public Object[] sortZtoA(Object[] object, int n)  // sort Z-A
	{
	String[] array1 = (String[]) object[n];
	int b, c;
    String temp;

    for (b = 0; b < array1.length - 1; b++) // citation: https://mathbits.com/MathBits/Java/arrays/ABCSort.htm
    {
        for (c = b+1; c < array1.length; c++)
        {  
                 if (array1[b].compareToIgnoreCase(array1[c]) < 0) // sorting Z-A
                  {                            // ascending sort
                      temp = array1 [b];
                      array1[b] = array1[c];    // swapping
                      array1[c] = temp; 
                  }
        }
    }

    return new Object[] {array1};
	}
	
	
	

	public Object[] search (Object[] obj, String search) // search 
	{
		search = search.toLowerCase();

		String[] array1 = (String[]) obj[0];
		String[] array2 = new String[array1.length];
		String searchElement;
		int count = 0;
		
		for (int a = 0; a < array1.length; a++)
		{
			if (array1[a].toLowerCase().contains(search)) 
	    	{
				count++;
				searchElement = array1[a];
				for (int b = 0; b < count; b++)
				array2[a] = searchElement;
				
			}
			}
		return new Object[] {array2};
		}
	
	
	
	
	
	public String print (Object[] obj) //print in console
	{
		String	result = "";
		
			String[] array1 = (String[]) obj[0];
	
			for (int a = 0; a < array1.length; a++)
				
		    {
				if (array1[a] != null)
		    	{
		    		System.out.println(array1[a]);
		    		result += array1[a] + "\n";
		    	}	
		    }
			return result;
		
			
	}
	
	
	
	
}

