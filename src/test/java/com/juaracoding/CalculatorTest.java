package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test// untuk melakukan unit testing
    public void testAdd(){
        Calculator calculator = new Calculator(); // instance object
        double actual = calculator.add(10,5);
        double expected = 15;

        // report parameter expected dan actuall(output)
        // verifikasi / validasi menggunakan Assert


        Assert.assertEquals(actual, expected);



    }

//    @Test
//    public void testSubstract(){
//        Calculator calculator = new Calculator();// intance object
//        double actual =calculator.substract(10,5);
//        double expected = 5;
//
//        Assert.assertEquals(actual, expected); // codingan ini masih redundan
//    }


    @Test
    public void testSubstract(){
        Calculator calculator = new Calculator();// intance object
        Assert.assertEquals(calculator.substract(10,5),5);
    }




}
