package junit5test;

import org.junit.jupiter.api.*;
//To mark up all methods as STATIC
@TestInstance(TestInstance.Lifecycle.PER_CLASS)


public class LifecycleMethods {

    @BeforeAll
    void beforeAll(){
        System.out.println("--This is the before all Method");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("---- This is the before Each methof");
    }

    @AfterAll
    void AfterAll(){
        System.out.println("-------This is the after all method");
    }
    @AfterEach
    void AfterEach(){
        System.out.println("------- This is the after each method");
    }

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
