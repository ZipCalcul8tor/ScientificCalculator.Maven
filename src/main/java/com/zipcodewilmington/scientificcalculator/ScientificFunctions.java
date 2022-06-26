package com.zipcodewilmington.scientificcalculator;

public class ScientificFunctions {


//    this is the constructor
//    public ScientificFunctions(){
//
//    }

    public double square(double value){
        return value * value;
    }

    public double squareRoot(double value){
        return Math.sqrt(value);

    }

//    public double inverse(double value){
//        int n = scn.nextInt();
//        int temp = n;
//        int nod = 0;
//        int ans = 0;
//        while(temp > 0){
//            nod ++;
//            temp /= 10;
//        }
//
//        for(int i = 1; i = nod; i++){
//            int pians = n % 10;
//            ans += i * (int) Math.pow(10, pians - 1);
//            n = n/10;
//        }
//    }

    public double switchSign(double value){
        return -value;
    }

    public double sine(double value){
        return Math.sin(value);
    }

    public double cosine(double value){
        return  Math.cos(value);
    }

    public double tangent(double value){
        return Math.tan(value);
    }

    public double inverseSine(double value){
        return Math.asin(value) ;
    }

    public double inverseCosine(double value){
        return Math.acos(value);
    }

    public double inverseTangent(double value){
        return Math.atan(value);
    }

    public double factorial(double value){
        double newValue = value;
        for (int i = (int)value -1; i > 0; i--) {
            newValue *= i;
        }
        return newValue;
    }
    public double naturalLog(double value){
        return Math.log(value);
    }

    public double inverseLog(double value){
        return Math.log10(value);
    }

    public double inverseNatLog(){
        return 0.00;
    }
}
