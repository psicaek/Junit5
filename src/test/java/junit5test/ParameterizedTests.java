package junit5test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

public class ParamiterizedTests {


    @ParameterizedTest(name = "Run: {index} - value: {arguments}")
    @ValueSource(ints={1,5,6})
    void intValues(int theParam){
        System.out.println("theParam = " + theParam);

    }


    @ParameterizedTest(name = "Run: {index} - value: {arguments}")
    @NullAndEmptySource
    @ValueSource(strings = {"firstString", "SecondString"})
    void stringValues(String theParam){
        System.out.println("theParam = " + theParam);
    }

    @ParameterizedTest
    @CsvSource(value = {"Steve,Rogers","Clark,Kent","Captain,America"})
    void csvSource_StringString(String param1, String param2){
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
    }
    @ParameterizedTest(name = "Run: {index} - value: {arguments}")
    @CsvSource(value = {"Superman,1,true ","Batman,2,false","Antman,3,true"})
    void CsvSource_StringIntBoolean(String param1, int param2, Boolean param3){
        System.out.println("param1 = " + param1 + ", param2 = " + param2 + ", param3 = " + param3);
    }

    @ParameterizedTest
    @CsvSource(value = {"captain America,'Steve,rogers'","Winter Soldier,'Bucky,Barnes'"})
    void csvSourse_StringWithComa(String param1,String param2){
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
    }

    @ParameterizedTest
    @CsvSource(value = {"Steve?rogers","Bucky?burns"}, delimiter = '?')
    void csvSource_StringWithDiffDelimiter(String param1, String param2){
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
    }
}
