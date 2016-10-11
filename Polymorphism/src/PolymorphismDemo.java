import polymorphism.music.*;

public class PolymorphismDemo {
	public static void tune(Instrument in) {
		in.play(Note.MIDDLE_C);
	}
	public static void main(String[] args) {
		Instrument in = new Instrument();
		in.play(Note.C_SHARP);
		
		Wind win = new Wind();
		win.play(Note.B_FLAT);

		// Upcasting
		tune(win);
	}

}
