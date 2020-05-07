package com.example.calculadoracientifica;

class Modelo {
    public Modelo(){

    }

    public double suma(double num, double num2) {
        return num + num2;
    }

    public double resta(double num, double num2) {
        return num - num2;
    }

    public double multiplicacion(double num, double num2) {
        return num * num2;
    }

    public double division(double num, double num2) {
        return num / num2;
    }

    public double factorial(double num) {
        int i, fact = 1;
        for (i = 1; i < (int) num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public double raiz(double num) {
        return Math.sqrt(num);
    }

    public double porcentaje(double num, double num2) {
        double porcentaje = (num * num2) / 100;
        return porcentaje;
    }

    public double sin(double num) {
        return Math.sin(num);
    }

    public double cos(double num) {
        return Math.cos(num);
    }

    public double tan(double num) {
        return Math.tan(num);
    }

    public double csc(double num) {
        return (1 / Math.sin(num));
    }

    public double sec(double num) {
        return (1 / Math.cos(num));
    }

    public double ctg(double num) {
        return (Math.cos(num) / Math.sin(num));
    }

    public double elevado(double num, double num2) {
        return Math.pow(num, num2);
    }
    public String btn0(String num){return num+"0";}
    public String btn1(String num){return num+"1";}
    public String btn2(String num){return num+"2";}
    public String btn3(String num){return num+"3";}
    public String btn4(String num){return num+"4";}
    public String btn5(String num){return num+"5";}
    public String btn6(String num){return num+"6";}
    public String btn7(String num){return num+"7";}
    public String btn8(String num){return num+"8";}
    public String btn9(String num){return num+"9";}
}
