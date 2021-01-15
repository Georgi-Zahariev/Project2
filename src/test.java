import java.util.Scanner;
import java.util.ArrayList;

public class test {

	static ArrayList<Student> Lst = new ArrayList<Student>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		double sum = 0;
		double count = 0;
		do {
			Student s = new Student(inp);
			if (s.getName().equals(""))
				break;
			if (s.correctMark())
				Lst.add(s);
			sum += s.getMark();
			count++;
		} while (true);

		maxToMin(Lst);

		for (Student t : Lst)
			System.out.println(t.toString());

		System.out.println("Average: " + Lst.get(1).average(sum, count));

		inp.close();

	}

	private static void maxToMin(ArrayList<Student> Lst) {

		int br;

		for (int i = 0; i < Lst.size() - 1; i++) {
			Student max = Lst.get(i);
			br = i + 1;

			while (br < Lst.size()) {
				if (max.getMark() < Lst.get(br).getMark()) {
					max.swap(Lst.get(br));
				} else {
					br++;
				}
			}
		}

	}

}