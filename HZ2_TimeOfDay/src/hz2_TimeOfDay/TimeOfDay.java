package hz2_TimeOfDay;

/**
 * Elke instantie van deze klasse stelt een tijdstip voor.
 * 
 * @invar HIER IETS
 *
 */

public class TimeOfDay {
	
	/**
	 * @invar Het aantal uren is niet negatief EN niet groter dan 23.
	 * 		| (0 <= uren) && (uren <= 23)
	 */
	private int uren;
	
	/**
	 * @invar Het aantal uren is niet negatief EN niet groter dan 59.
	 * 		| (0 <= minuten) && (minuten <= 59)
	 */
	private int minuten;
	
	public int getUren() {
		return uren;
	}
	
	public int getMinuten() {
		return minuten;
	}
	
	/**
	 * Stelt de uren van dit TimeOfDay-object in.
	 * 
	 * @post Het aantal uren van dit TimeOfDay-object is gelijk aan het gegeven aantal uren.
	 *     | getUren() == uren
	 */
	public void setUren(int uren) {
		this.uren = uren;
	}
	
	/**
	 * Stelt de minuten van dit TimeOfDay-object in.
	 * 
	 * @post Het aantal minuten van dit TimeOfDay-object is gelijk aan het gegeven aantal minuten.
	 *     | getMinuten() == minuten
	 */
	public void setMinuten(int minuten) {
		this.minuten = minuten;
	}
	
	
}
