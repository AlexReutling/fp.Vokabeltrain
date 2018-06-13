package VokabelnLernen;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Collections;
import java.util.Map;

public class Algorithmus 
{
	SortedMap<String , String> mapvocs = new TreeMap<>();
	
	
	public Algorithmus()
	{
		
	}
	
	public void addVocab(String deutsch, String englisch) throws AlgorithmusException
	{
		
		if(!mapvocs.containsKey(deutsch) && !mapvocs.containsValue(englisch))
		{
			mapvocs.put(deutsch, englisch);
		}
		else
		{
			throw new AlgorithmusException("Dieses Wort existiert bereits");
		}
	}
	
	
	
	public void testWord(String germanw, String englishw) throws AlgorithmusException
	{
		
		if(mapvocs.containsKey(germanw))
		{
			for(Map.Entry<String, String> m : mapvocs.entrySet())
			{
				if(m.getKey().equals(germanw) && m.getValue().equals(englishw))
				{
					
				}
				else
				{
					throw new AlgorithmusException("Falsches Wort");
				}
			}
		}
		else
		{
			throw new AlgorithmusException("Dieses Wort wurde nicht gespeichert");
		}
	
	}
	
	public String getKey(String word) throws AlgorithmusException
	{
		String w = null;
		
		if(mapvocs.containsValue(word))
		{
			for(Map.Entry<String, String> m : mapvocs.entrySet())
			{
				if(m.getValue().equals(word))
				{
					w = m.getKey();
				}
			}
		}
		else
		{
			throw new AlgorithmusException("Dieses Wort gibt es nicht");
		}
		
		return w;
	}
	
	public String getValue(String word) throws AlgorithmusException
	{
		String w = null;
		
		if(mapvocs.containsKey(word))
		{
			for(Map.Entry<String, String> m : mapvocs.entrySet())
			{
				if(m.getKey().equals(word))
				{
					w = m.getValue();
				}
			}
		}
		else
		{
			throw new AlgorithmusException("Dieses Wort gibt es nicht");
		}
		
		return w;
	}
	
	public void deleteVocabs()
	{
		mapvocs.clear();
	}
	
	public String getVocabs()
	{
		return mapvocs.toString();
	}
	
	
	
}