package at.fhj.iit;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Assert.*;

public class StringStackTest
{
    public Stack s;
    
    @Before
    public void setup() throws Exception
    {
        s = new StringStack(5); // keep size of 5 !!
    }
    
    /**
     * tests if stack is empty after initialization
     * 
     * use assert
     * - assertTrue to check it's empty
     */
    @Test
    public void testIsEmpty() throws Exception
    {
    	if(s.isEmpty()) {
    		Assert.assertTrue(true);
    	}
    }
    
    /**
     * tests if stack is empty after pushing
     * 
     * use assert
     * - assertFalse to check it's not empty
     */
    @Test
    public void testIsNotEmpty() throws Exception
    {
    	if(!s.isEmpty()) {
    		Assert.assertFalse(true);
    	}
    }

    /**
     * tests push and pop function
     * 
     * do following test
     * - use push, 1 or x times
     * - use pull, as often as you use push
     * - use isEmpty to check that's empty again
     * - assert every content of the stack in the correct ordering
     * @throws Exception 
     */
    @Test
    public void testPushPop() throws Exception
    {
    	s.push("AMK");
    	s.pop();
    	s.isEmpty();
    }
    
//    Tests if Stack pops from top to bottom  
    @Test
    public void popOrder() throws Exception
    {
    	s.push("Word1");
    	s.push("Word2");
    	Assert.assertEquals("Word2", s.pop());
    }
    
//  Checks if pushed strings get lost in a stack with multiple strings
    @Test
    public void dataLoss() throws Exception
    {
    	for(int i = 0; i < 5; i++) {
    		s.push("String");
    	}
    	int count = 0;
    	while(s.isEmpty() == false) {
    		s.pop();
    		count++;
    	}
    	Assert.assertEquals(5, count);
    }
    /**
     * Feel Free to insert other test cases for the String Stack Implementation !!!
     */
    
}
