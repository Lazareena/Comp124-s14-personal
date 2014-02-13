package edu.macalester.comp124.hello;

import edu.macalester.comp124.palindrome.Palindrome;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class PalindromeTest {

    @Test
	public void testPalindrome1() {

        Palindrome pal = new Palindrome();
        assertTrue(pal.isPalindrome("racecar"));
        assertFalse(pal.isPalindrome("racecarz"));
        // After you finish, you should be able to uncomment these lines and pass the test.
//		Palindrome pal = new Palindrome();
//		assertTrue(pal.isPalindrome("racecar"));
//		assertFalse(pal.isPalindrome("racecarz"));
	}
	
	/*
	 * Write your own test methods below to test for fancier palindromes.
	 * Like the method above, each method be preceded by @Test
	 */
}
