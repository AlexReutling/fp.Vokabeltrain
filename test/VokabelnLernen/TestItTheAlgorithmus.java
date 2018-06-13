package VokabelnLernen;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;


public class TestItTheAlgorithmus 
{

	Algorithmus al;
	
	@Before
	public void setUp()
	{
		al = new Algorithmus();
	}
	
	@Test
	public void testSaveVoc()
	{
		try {
		al.addVocab("Hund" , "Dog");
		assertEquals("Dog", al.getValue("Hund"));
		assertEquals("Hund", al.getKey("Dog"));
		}catch(AlgorithmusException e)
		{
			fail("Should not have happend");
		}
	}
	
	
	
}
