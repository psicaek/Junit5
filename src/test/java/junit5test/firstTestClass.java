package junit5test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class firstTestClass {

    @Test
    //accessModifier(we dont need-not private) returnType nameOfMethod(parameters)
    void firstMethod(){
        System.out.println("This is the first test");
    }

    @Test
    @DisplayName("Test case 123- user case - this method is the second one")
    void secondMethod(){
        System.out.println("This is the second method");
    }

}
