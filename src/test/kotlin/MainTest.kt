import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertContentEquals

class MainTest {
    @Test
    fun whenGetCoins_thenReturnFullSetOfCoins() {
        //when
        val result = getCoins()

        //then
        assertContentEquals(intArrayOf(100, 50, 20, 10, 5, 2, 1), result)
    }

    @Test
    fun givenNegativeValue_whenCalculateSmallestChange_thenThrowException() {
        //when/then
        assertThrows<IllegalArgumentException> { calculateSmallestChange(-1) }
    }

    @Test
    fun givenZeroValue_whenCalculateSmallestChange_thenReturnZero() {
        //when
        val result = calculateSmallestChange(0)

        //then
        assertContentEquals(intArrayOf(), result)
    }

    @Test
    fun givenValueOfOne_whenCalculateSmallestChange_thenReturnArrayOfOneElementWithValue1() {
        //when
        val result = calculateSmallestChange(1)

        //then
        assertContentEquals(intArrayOf(1), result)
    }

    @Test
    fun givenValueOfTwo_whenCalculateSmallestChange_thenReturnArrayOfOneElementWithValue2() {
        //when
        val result = calculateSmallestChange(2)

        //then
        assertContentEquals(intArrayOf(2), result)
    }

    @Test
    fun givenValueOfThree_whenCalculateSmallestChange_thenReturnArrayOfOneElementWithValue3() {
        //when
        val result = calculateSmallestChange(3)

        //then
        assertContentEquals(intArrayOf(2, 1), result)
    }

    @Test
    fun givenValueOfFour_whenCalculateSmallestChange_thenReturnArrayOfOneElementWithValue4() {
        //when
        val result = calculateSmallestChange(4)

        //then
        assertContentEquals(intArrayOf(2, 2), result)
    }

    @Test
    fun givenValueOfFive_whenCalculateSmallestChange_thenReturnArrayOfOneElementWithValue5() {
        //when
        val result = calculateSmallestChange(5)

        //then
        assertContentEquals(intArrayOf(5), result)
    }

    @Test
    fun givenValueOfSix_whenCalculateSmallestChange_thenReturnArrayOfOneElementWithValue6() {
        //when
        val result = calculateSmallestChange(6)

        //then
        assertContentEquals(intArrayOf(5, 1), result)
    }
}