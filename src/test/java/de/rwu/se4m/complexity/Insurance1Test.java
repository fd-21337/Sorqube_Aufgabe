package de.rwu.se4m.complexity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Insurance1Test {

    private Insurance1 insurance1;
    private Insurance2 insurance2;

    @BeforeEach
    void setUp() {
        insurance1 = new Insurance1();
        insurance2 = new Insurance2();
    }

    @ParameterizedTest
    @CsvSource({
            "10,false,0,LOW,false",
            "30,false,0,LOW,true",
            "30,true,0,HIGH,false",
            "20,false,5,MEDIUM,true"
            })
    void getInsurance1(int age, boolean married, int numChildren, RISK1 risk, boolean expected) {
        assertEquals(expected,insurance1.getInsurance(age, married, numChildren, risk));
    }


    @ParameterizedTest
    @CsvSource({
            "10,false,0,HIGH,false",
            "30,false,0,LOW,true",
            "30,true,0,HIGH,false"
    })
    void getInsurance2(int age, boolean married, int numChildren, RISK2 risk, boolean expected) {
        assertEquals(expected,insurance2.getInsurance(age, married, numChildren, risk));
    }


}