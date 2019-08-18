package practice

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Q0xPalindromeTest {

    /**
     * Checks if a word is a palindrome
     *
     * @param word to check
     * @return true if word is palindrome, false if otherwise
     */
    fun isPalindrome(word: CharArray) : Boolean {
        var start = 0
        var end = word.size - 1

        while(start < end) {
            if (word[start] != word[end]) {
                return false
            }
            start += 1
            end -= 1
        }
        return true
    }

    @Test
    fun testIsPalindrome() {
        val words = arrayOf("Anna","Civic","Kayak","Level","Madam","Mom","Noon","Racecar","Radar","Redder","Refer","Repaper","Rotator","Rotor","Sagas","Solos","Stats","Tenet","Wow")
        for (word in words) {
            assertTrue(isPalindrome(word.toLowerCase().toCharArray()))
        }

        val nonWords = arrayOf("AnnaBell","Civics","Kayaking","Levels")
        for (word in nonWords) {
            assertFalse(isPalindrome(word.toCharArray()))
        }
    }
}