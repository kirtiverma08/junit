package com.lti.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class Suite1 {
public String message="KIRTI";
JUnitMessage junitmessage=new JUnitMessage(message);

	@Test
public void testUnitMessage() {
		System.out.println("JUnit Message is printing");
         	junitmessage.printMessage();
		
	}
@Test 
public void testJUnitHiMessage() {
	message="Hi"+message;
	System.out.println("Junit hi message is printnig");

	assertEquals(message,junitmessage.printHiMessage());
	System.out.println("suite test is successful"+message);
}
}
