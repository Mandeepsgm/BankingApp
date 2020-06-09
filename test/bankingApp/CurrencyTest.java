package bankingApp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import bankingApp.Currency;

public class CurrencyTest {

	/* Example currencies:
	 * 	CAD = Canadian dollar
	 * 	EUR = Euros
	 * 	GBP = Great British Pounds
	 * 	HKD = Hong Kong Dollars
	 */
	public Currency CAD, EUR, GBP, HKD;

	@Before
	public void setUp() throws Exception {
		// Setup some test currencies to use in the below test cases
		CAD = new Currency("CAD", 0.75);
		EUR = new Currency("EUR", 1.14);
		HKD = new Currency("HKD", 0.13);
	}

	@Test
	public void testGetName() {
		// Write the test case for testing the getName() function
		assertEquals("CAD", CAD.getName());
		assertNotEquals("ERU",EUR.getName());
	}

	@Test
	public void testGetRate() {
		assertEquals(0.80, CAD.getRate(),0.10);
		assertEquals(0.75, CAD.getRate(),0.0);
		assertNotEquals(0.80, CAD.getRate(),0.0);
	}

	@Test
	public void testSetRate() {
		CAD.setRate(0.87);
		assertEquals(0.87, CAD.getRate(),0.10);
	}

	@Test
	public void testValueInUSD() {
		// @TODO: Write the test case for testing the valueInUSD() function
		assertEquals(114, EUR.valueInUSD(100),0.10);
		assertEquals(75.0,CAD.valueInUSD(100),0.10);
		assertEquals(13.0,HKD.valueInUSD(100),0.10);
	}

	@Test
	public void testValueInThisCurrency() {
		// @TODO: Write the test case for testing the valueInThisCurrency() function
		// For this function, you should:
		// 1. Assert the value of the "other" currency
		// 2. Get the value in "this" currency
		// 3. Assert that the value in "this" currency is correct
		// You will end up with 2 assert() statements in this function.


		assertEquals(17.33, HKD.valueInThisCurrency(100, CAD),0.10);
		assertEquals(576.9, CAD.valueInThisCurrency(100, HKD),0.10);

		assertEquals(152, EUR.valueInThisCurrency(100, CAD),0.10);
		assertEquals(65.78, CAD.valueInThisCurrency(100, EUR),0.10);



		assertEquals(11.4, HKD.valueInThisCurrency(100, EUR),0.10);
		assertEquals(876.9, EUR.valueInThisCurrency(100, HKD),0.10);


	}

}