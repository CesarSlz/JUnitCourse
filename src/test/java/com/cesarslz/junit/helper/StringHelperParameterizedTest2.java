package com.cesarslz.junit.helper;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest2 {
	
	StringHelper helper = new StringHelper();
	
	private String input;
	
	public StringHelperParameterizedTest2(String input) {
		this.input = input;
	}
	
	@Parameters
	public static Collection<String[]> testConditions (){
		String[][] conditions = { {"ABCD"}, {"ABAB"} };
		return Arrays.asList(conditions);
	}
	
	// ABCD => false, ABAB => true, AB => true, A => false
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame(input));
	}
	
	
	
	

}
