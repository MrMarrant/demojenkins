package com.epsi.mycal;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Before
    public void setUp() throws Exception{

    }
    @After
    public void tearDown() {

    }
    @Test
    public void testAdd() throws Exception{
        int valueA = 2;
        int valueB = 3;
        Calculator calc = new Calculator();
        int actual = calc.add(valueA,valueB);

        assertEquals(5, actual);
    }
    @Test
    public void testSub() throws Exception{
        int valueA = 4;
        int valueB = 2;
        Calculator calc = new Calculator();
        int actual = calc.sub(valueA,valueB);

        assertEquals(2, actual);
    }

    @Test
    public void testMul() throws Exception{
        int valueA = 4;
        int valueB = 2;
        Calculator calc = new Calculator();
        int actual = calc.mul(valueA,valueB);

        assertEquals(8, actual);
    }

    @Test
    public void testDiv() throws Exception{
        int valueA = 6;
        int valueB = 2;
        Calculator calc = new Calculator();
        int actual = calc.div(valueA,valueB);

        assertEquals(3, actual);
    }

    @Test
    public void testPair() throws Exception{
        int valueA = 6;
        Calculator calc = new Calculator();
        boolean actual = calc.pair(valueA);

        assertEquals(true, actual);
    }

    @Test
    public void testPremier() throws Exception{
        int valueA = 17;
        Calculator calc = new Calculator();
        boolean actual = calc.premier(valueA);

        assertEquals(true, actual);
    }

    @Test
    public void testisFind() throws Exception{
        int valueA = 1;
        Calculator calc = new Calculator();
        boolean actual = calc.isFind(valueA);

        assertEquals(true, actual);
    }

}