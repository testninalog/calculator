package com.endava.calculator;

public class TestClass {
    public static void main(String[] args) {

        BasicCalculator basicCalculator = new BasicCalculator(5);//ispisace tacno 5 decimalnih mesta
        ExpertCalculator expertCalculator = new ExpertCalculator();
//        System.out.println(basicCalculator.add(1, 2 , 3, 4));
//        System.out.println(basicCalculator.add(1.65, 2.78 , -3.55, 4.1234));
//        System.out.println(basicCalculator.substract(1.65, 2.78 , -3.55, 4.1234));
//        System.out.println(basicCalculator.substract(1, 2 , 3, -4));
//        System.out.println(basicCalculator.divide(1.65, 2.78 , -3.55, 0.0));
//        System.out.println(basicCalculator.multiply(1, 2 , 3, 1000000000));//1000000000 ne moze br veci od ovoga jer ne prihvata int
//        System.out.println(basicCalculator.divide(1, 3));
//        System.out.println(basicCalculator.divide(1, 2 , 3, 0));//dobijamo poruku
//        System.out.println(expertCalculator.pow(2, 0));
//        System.out.println(expertCalculator.pow(1, 2020));
//        System.out.println(expertCalculator.pow(2, -3));// 1/2^3= 1/2*2*2=1/8
//        System.out.println(expertCalculator.pow(-3, 2));//-3*(-3)=9
//        System.out.println(expertCalculator.pow(-3, 3));

        //System.out.println(expertCalculator.root(-0.25));
//

//        System.out.println(expertCalculator.root(8));
//        System.out.println(expertCalculator.factorial(6));
//        System.out.println(expertCalculator.factorial(0));
//        System.out.println(expertCalculator.factorial(-6));
//        System.out.println(expertCalculator.factorialR(0));
//        System.out.println(basicCalculator.divide(20, 6 ));
        System.out.println(expertCalculator.evaluate("77.7-11.1*3+6.0/3.0"));
//        System.out.println(expertCalculator.evaluate("77.7-11.1"));
//        System.out.println(expertCalculator.evaluate("77.7*11.1"));
//        System.out.println(expertCalculator.evaluate("77.7/11.1"));
        System.out.println(expertCalculator.evaluate("8%3"));//ostatak pri deljenju

//        System.out.println(expertCalculator.evaluate("12-6*2-3*4"));
        //domaci uradi stepen i zagrade ^ ()

    }
}
