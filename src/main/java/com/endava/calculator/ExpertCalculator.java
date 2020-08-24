package com.endava.calculator;

public class ExpertCalculator extends BasicCalculator {

    private String[] operators = {"+", "-", "*","/", "%"};


    public Double pow(Integer number, Integer stepen) {

        Double result = 1.0;
//        if (number == 1)
//            return 1.0;
        if (stepen == 0)
            return result;

        for (int i = 1; i <= Math.abs(stepen); i++) {
            result *= number;
        }

        if (stepen < 0) {
            return 1 / result;

        } else
            return formatDouble(result);

    }

    public Long factorial(Integer number) {

        Long result = 1L;

        if (number < 0)
            throw new IllegalArgumentException("Number is less then 0. Can not calculate factorial with negative numbers");
        if (number == 0 || number == 1)
            return 1L;

        for (int i = 2; i <= number; i++) {

            result *= i;//1*2*3*...*i
        }
        return result;

    }
    // using revese if n! = n*(n-1)  -> (n-1)! = (n-1)(n-2)! rekurzija izlaz je 0! = 1;
    public Long factorialR(Integer n){
        if (n < 0)
            throw new IllegalArgumentException("Number is less then 0. Can not calculate factorial with negative numbers");
        if (n == 0)
            return 1L;
        return n*factorialR(n-1);//8*7*..*1
    }

    public Double root(Double number) {
        if (number < 0)
            throw new IllegalArgumentException("Number is less then 0. Can not calculate sqrt with negative numbers");

        return formatDouble(Math.sqrt(number));
        //ako budemo imali vremena
    }
    public Double root(Integer number) {
        if (number < 0)
            throw new IllegalArgumentException("Number is less then 0. Can not calculate sqrt with negative numbers");

        return formatDouble(Math.sqrt(number));// ovo radi jer je formatDouble protected
        //ako budemo imali vremena
    }

    public Double evaluate(String expression){

        // for ech sign in oerators da proveri da li postoji znak
        for(String sign: operators)
        if(expression.contains(sign)){
            int index = expression.lastIndexOf(sign);//1000+23*
            String left = expression.substring(0,index);//ova funkcija ne ukljucuje index, nego ide do indexa [0,4)
            String right = expression.substring(index +1);//prvu vrednost ukljucuje tako da moramo da +1, a krajnji ne mora jer zna da ide do kraja [5...)

            Double rightNumber = evaluate(right);//konvertujemo u brojeve

            Double leftNumber = 0.0;//smisli nesto za -
            if(!left.isEmpty()) {
                leftNumber = evaluate(left);
                //return leftNumber + rightNumber;
                //return add(leftNumber, rightNumber);

            }
            switch (sign) {
                case "+": return leftNumber + rightNumber;// return automacki radi break
                case "-": return leftNumber - rightNumber;
                case "*": return leftNumber * rightNumber;
                case "/": return leftNumber / rightNumber;
                case "%": return leftNumber % rightNumber;
               // case "^": return leftNumber ^ rightNumber; 2^3 + 4 - 7^2*3

                default: throw new IllegalArgumentException("Can't recognize sign" + sign);
            }
        }
       //throw new IllegalArgumentException("Can't solve expression!" + expression);
        return Double.parseDouble(expression);//obezbedjujemo izlaz iz rekuzrije

    }

}
