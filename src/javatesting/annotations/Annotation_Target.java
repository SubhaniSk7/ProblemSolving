package javatesting.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)
@interface TypeAnnoDemo {

}

public class Annotation_Target {

	public static void main(String[] subhani) {

//		@Override
//		@Deprecated
//		@SuppressWarnings
//		@SafeVarargs
//		@FunctionalInterface

//		@Inherited
//		@Documented
//		@Target
//		@Retention
//		@Repeatable

		@TypeAnnoDemo
		String s = "subhani";
		System.out.println(s);
		System.out.print(abc().getClass());
	}

	public static @TypeAnnoDemo Integer abc() {
		System.out.println("in abc");
		return 123;
	}
}
