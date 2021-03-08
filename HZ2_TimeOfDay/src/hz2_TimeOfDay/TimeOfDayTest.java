package hz2_TimeOfDay;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {

	@Test
	void test() {
		TimeOfDay timeofday = new TimeOfDay();
		timeofday.setUren(15);
		timeofday.setMinuten(45);
		assertEquals(15, timeofday.getUren());
		assertEquals(45, timeofday.getMinuten());
		
	}

}
