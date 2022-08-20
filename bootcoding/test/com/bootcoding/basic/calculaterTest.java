package com.bootcoding.basic;

import org.junit.Assert;
import org.junit.Test;

public class calculaterTest {



    @Test
    public  void  test1() {

        calculater calc = new calculater();


        int add = calc.calculater(10, 20, "ADD");
        Assert.assertTrue(add == 30);
    }
        @Test
        public  void  test2() {

            calculater calc = new calculater();


            int MUL = calc.calculater(10, 20, "MUL");
            Assert.assertTrue(MUL == 200);

        }
    @Test
    public  void  test3() {

        calculater calc = new calculater();


        int SUB = calc.calculater(10, 20, "SUB");
        Assert.assertTrue(SUB == -10);

    }

    @Test
    public  void  test4() {

        calculater calc = new calculater();


        int DIV = calc.calculater(20, 10, "DIV");
        Assert.assertTrue(DIV == 2);

    }

}
