package com.example.vitbatch1;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
    Calculator calculator; //declaration
    //oncreate

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        calculator = new Calculator(); //initzn
    }


    public void testAdd() {
        int expected = 40;
        int actual = calculator.add(10,20);
        assertEquals(expected,actual);
    }

    public  void testMul(){
        int exp = 20;
        int act = calculator.multiply(5,4);
        assertEquals(exp,act);
    }


    //ondestroy

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}