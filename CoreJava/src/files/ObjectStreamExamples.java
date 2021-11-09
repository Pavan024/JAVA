package files;

import java.io.ObjectStreamClass;

import java.util.ArrayList;

public class ObjectStreamExamples {

	public static void main(String[] args) {

		ObjectStreamClass objStream = ObjectStreamClass.lookup(Number.class);
		ObjectStreamClass objStream1 = ObjectStreamClass.lookupAny(ArrayList.class);

		System.out.println(objStream.forClass());
		System.out.println(objStream1.forClass());
	}
}