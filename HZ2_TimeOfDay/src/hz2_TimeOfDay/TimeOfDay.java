package hz2_TimeOfDay;

/**
 * Elke instantie van deze klasse stelt een tijdstip voor.
 * 
 * @invar Het aantal minuten sinds middernacht is gelijk aan zestig keer het aantal uren plus het aantal minuten.
 *     | getMinutesSinceMidnight() == 60*getUren() + getMinuten()
 */

public class TimeOfDay {
	
	/**
	 * @invar Het aantal minuten sinds de middernacht is kleiner dan 1440 en is niet negatief.
	 *     | (0 <= minutesSinceMidnight) && (minutesSinceMidnight < 1440)
	 */
	private int minutesSinceMidnight;
	
	public int getUren() {
		return minutesSinceMidnight/60;
	}
	
	public int getMinutesSinceMidnight() {
		return minutesSinceMidnight;
	}
	
	public int getMinuten() {
		return minutesSinceMidnight%60;
	}
	
	/**
	 * Stelt de uren van dit TimeOfDay-object in.
	 * 
	 * @throws IllegalArgumentException als het gegeven aantal uur kleiner is dan 0.
	 *     | uren < 0
	 * @throws IllegalArgumentException als het gegeven aantal uur groter is dan 23.
	 *     | uren > 23
	 * @post Het aantal minuten is gelijk aan het oud aantal minuten.
	 *     | getMinuten() == old(getMinuten())
	 * @post Het aantal uren van dit TimeOfDay-object is gelijk aan het gegeven aantal uren.
	 *     | getUren() == uren
	 * @post Het aantal minuten sinds de middernacht van dit TimeOfDay-object is gelijk aan zestig keer het aantal uren plus het aantal minuten van dit TimeOfDay-object.
	 *     | getMinutesSinceMidnight() == 60*getUren() + getMinuten()
	 */
	public void setUren(int uren) {
		if (uren < 0)
			throw new IllegalArgumentException("Het aantal uur is kleiner dan 0");
		else if (uren > 23)
			throw new IllegalArgumentException("Het aantal uur is groter dan 23");
		minutesSinceMidnight = 60*uren + getMinuten();
	}
	
	/**
	 * Stelt het aantal minuten sinds de middernacht van dit TimeOfDay-object in.
	 * 
	 * @throws IllegalArgumentException als het aantal minuten sinds de middernacht kleiner is dan 0
	 *     | minutesSinceMidnight < 0
	 * @throws IllegalArgumentException als het aantal minuten sinds de middernacht groter is dan 1439
	 *     | minutesSinceMidnight > 1439
	 * @post Het aantal minuten sinds de middernacht van dit Interval-object is gelijk aan het gegeven aantal minuten sinds de middernacht.
	 *     | getMinutesSinceMidnight() == minutesSinceMidnight
	 */
	public void setMinutesSinceMidnight(int minutesSinceMidnight) {
		if (minutesSinceMidnight < 0)
			throw new IllegalArgumentException("aantal minuten sinds middernacht kleiner dan 0");
		else if (minutesSinceMidnight > 1439)
			throw new IllegalArgumentException("aantal minuten sinds middernacht groter dan 1439");
		this.minutesSinceMidnight = minutesSinceMidnight;
	}
	
	/**
	 * Stelt de minuten van dit TimeOfDay-object in.
	 * 
	 * @throws IllegalArgumentException als het gegeven aantal minuten kleiner is dan 0.
	 *     | minuten < 0
	 * @throws IllegalArgumentException als het gegeven aantal minuten groter is dan 59.
	 *     | minuten > 59
	 * @post Het aantal uren is gelijk aan het oud aantal uren.
	 *     | getUren() == old(getUren())
	 * @post Het aantal minuten van dit TimeOfDay-object is gelijk aan het gegeven aantal minuten.
	 *     | getMinuten() == minuten
	 * @post Het aantal minuten sinds de middernacht van dit TimeOfDay-object is gelijk aan zestig keer het aantal uren plus het aantal minuten van dit TimeOfDay-object.
	 *     | getMinutesSinceMidnight() == 60*getUren() + getMinuten()
	 */
	public void setMinuten(int minuten) {
		if (minuten < 0)
			throw new IllegalArgumentException("Het aantal minuten is kleiner dan 0");
		else if (minuten > 59)
			throw new IllegalArgumentException("Het aantal minuten is groter dan 59");
		minutesSinceMidnight = 60*getUren() + minuten;
	}
	
	
}