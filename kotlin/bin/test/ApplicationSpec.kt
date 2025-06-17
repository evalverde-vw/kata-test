import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class ApplicationTest {

    @Test
    fun itShouldFail() {
        assertTrue(false) // test intentionally fails like `true shouldBe false`
    }

    @Test
    fun itShouldSucceed() {
        assertTrue(true)
    }

    @ParameterizedTest
    @ValueSource(booleans = [true, false])
    fun paramTest(value: Boolean) {
        println("Running with: $value")
        assertTrue(value || !value) // dummy assertion: always true
    }
}
