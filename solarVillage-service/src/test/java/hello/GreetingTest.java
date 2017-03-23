package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class GreetingTest {

	private Greeting greeter = new Greeting(1, "Approved");

	@Test
	public void greeterSaysHello() {
		assertThat(greeter.getContent(), containsString("Approved"));
	}

//	@Test
//	public void getElectricalRequestStatus() {
//		assertThat.(greeting.getContent(), containsString("Approved"));
//	}
}
