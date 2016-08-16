package com.sap.junit.matchers;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.either;

import org.junit.Test;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

public class MatchersTest {

	@Test
	public void matchetsTest(){
		int x = 3;
		String responseString = "color : blue";
		List<String> myList = new ArrayList<String>();
		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		
		assertThat(x, is(3));
		assertThat(x, is(not(4)));
		assertThat(responseString, either(containsString("color")).or(containsString("colour")));
		assertThat(myList, hasItem("3"));
	}
}