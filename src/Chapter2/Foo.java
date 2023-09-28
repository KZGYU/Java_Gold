package Chapter2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER })
@interface MyAnnot {

}

class Foo {
	@MyAnnot
	int num;

	public void method(@MyAnnot int a) {
	}

}
