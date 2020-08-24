package com.endava.calculator;

import java.text.DecimalFormat;

public class BasicCalculator {

    private Integer floatingPoint;

    //konstruktor za inicijalizaciju ulaznog podatka
    public BasicCalculator() {
        floatingPoint = 10;//ovo je osnovni konstruktor
    }

    //ovo je konstruktor koji overloduje konstruktor koji prihvata argument za broj floating point od korisnika
    public BasicCalculator(Integer floatingPoint){
        this.floatingPoint = floatingPoint;
    }

    //sa ... mozemo pozvati koliko god brojeva da saberemo
    public Integer add(Integer... numbers ){//probamo sa dva inta i radi, unapredimo sa nizom Array

        Integer sum = 0;
        //for each numb in the numb in the array
        for(Integer n: numbers) {
            sum += n;// sum + old value of sum + n
        }
        return sum;
        }

    public Double add(Double... numbers ){

        Double sum = 0D;

        for(Double n: numbers) {
            sum += n;
        }
        return sum;
    }
    public Long add(Long... numbers ){

        Long sum = 0L;

        for(Long n: numbers) {
            sum += n;
        }
        return sum;
    }

    //oduzimanje
    public Integer substract(Integer... numbers){
        Integer result = numbers[0];//uzimamo prvi broj i od njega oduzimamo

        for(int i = 1; i<numbers.length; i++){
            result -= numbers[i];
        }
        return result;
    }

    public Double substract(Double... numbers){
        Double result = numbers[0];//uzimamo prvi broj i od njega oduzimamo

        for(int i = 1; i<numbers.length; i++){
            result -= numbers[i];
        }
        return result;
    }

    //mnozenje
    public Long multiply(Integer... numbers){//Integer zamenimo sa Long

        Long result = 1L;

        for(Integer n: numbers){
            result *= n;
        }
        return result;

    }

    //deljenje
    // upotrebicemo konstruktor jer imamo double tip
    public Double divide (Integer... numbers){// double jer pri deljenju dobijamo decimalne br, moze i float
        Double result = numbers[0].doubleValue();

        for(int i = 1; i<numbers.length; i++){
            if(numbers[i]== 0){//moze da se iskljuci 0 sto zavisi od zahteva klijenta- drugi nacin
                throw new IllegalArgumentException("Number list contains0. Can't divide by 0");
            }
            result /= numbers[i];
        }

        return formatDouble(result);
    }

    public Double divide (Double... numbers){
        Double result = numbers[0].doubleValue();

        for(int i = 1; i<numbers.length; i++){
            if(numbers[i]== 0){
                throw new IllegalArgumentException("Number list contains0. Can't divide by 0");
            }
            result /= numbers[i];
        }
        return formatDouble(result);
    }

    //private nece videti naslednica, pa zamenimo sa protected da bi videle klase naslednice
    protected Double formatDouble(Double number) {


        String pattern ="#.";// sa ovim dodajemo 0 u pattern, jer dodajemo bar 1 0 onda krecemo od 1
        for(int i = 1; i<= floatingPoint; i++){
            //pattern = pattern + "0";
            pattern += "0";
        }

        DecimalFormat numberFormat = new DecimalFormat(pattern);
        String formatResult = numberFormat.format(number);//konvertuje iz double to string
        return Double.parseDouble(formatResult);//posle mi vraamo iz stringa u double
    }
}


