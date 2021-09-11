package StudentApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//Create arrayList of user-defined class object.
		
		List<Student> al = new ArrayList<Student>();
		System.out.println("Student List (ordered by name)");
		Student s1 = new Student(101, "ȫ�浿", 23);
		al.add(s1); // adding Student class object
		Student s2 = new Student(102, "�����", 20);
		al.add(s2);
		Student s3 = new Student(103, "ö��", 21);
		al.add(s3);
		Student s4 = new Student(104, "����", 25);
		al.add(s4);
		Student s5 = new Student(105, "����", 22);
		al.add(s5);
		Student s6 = new Student(106, "�ͱ�", 27);
		al.add(s6);
		Student s7 = new Student(107, "����ȿ", 26);
		al.add(s7);
		Student s8 = new Student(108, "������", 22);
		al.add(s8);
		Student s9 = new Student(109, "���ؿ�", 23);
		al.add(s9);
		Student s10 = new Student(110, "������", 20);
		al.add(s10);
		
		Collections.sort(al);
		//Traverse elements of arrayList (ordered)
		for(Student s : al) {
			System.out.println(s.toString());
		}
		System.out.println("Student List (reverse ordered by name)");
		
		Collections.sort(al, Collections.reverseOrder());
		//Traverse elements of arrayList (reverse ordered)
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i).toString());
		}
	}

}
