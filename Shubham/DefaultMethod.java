import java.util.*;
import java.util.lang;

@FunctionalInterface
interface Drawing {
	void Draw();

	default void draw1() {
		System.out.println("draw1");
	}

	default void draw2() {
		System.out.println("draw2");
	}

	default void draw3() {
		System.out.println("draw3");
	}
	static void StaticMethod()
	{
		System.out.println("static mathod Called");
		
	}

}

public class DefaultMethodExample implements Drawing {

	public static void main(String[] args) {
		DefaultMethodExample methodExample = new DefaultMethodExample();

		methodExample.Draw();
		methodExample.draw1();
		Drawing.StaticMethod();

	}

	@Override
	public void Draw() {
		System.out.println("Draw Method");

	}

}