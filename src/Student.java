import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	private String name;
	private byte mark;

	public Student(Scanner inp) {
		name = inp.nextLine();
		if (!name.equals(""))
			mark = inp.nextByte();
		inp.nextLine();
	}

	public String getName() {
		return name;
	}

	public byte getMark() {
		return mark;
	}

	private String convert() {
		switch (mark) {
		case 2:
			return "Poor";
		case 3:
			return "Satisfactury";
		case 4:
			return "Good";
		case 5:
			return "Very good";
		case 6:
			return "Exellant";

		}
		return "";
	}

	public boolean correctMark() {
		return mark >= 2 && mark <= 6;
	}

	public void setName(String n) {
		name = n;
	}

	public void setMark(byte m) {
		mark = m;
	}

	public double average(double sum, double count) {
		return sum / count;
	}

	public void swap(Student s) {
		String n;
		byte b;

		n = s.name;
		s.name = this.name;
		this.name = n;

		b = s.mark;
		s.mark = this.mark;
		this.mark = b;
	}
	// Realiziral MaxToMin v testoviq klas kato private metod

	public String toString() {
		return name + ": " + convert() + " (" + mark + ") ";
	}

}
