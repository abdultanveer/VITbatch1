package com.example.vitbatch1.javaexs.inheritance;

public class Gst extends IncomeTax{
//String mobilephoneno;
    @Override
    int calculateTax(int income) {
        int oldTax = super.calculateTax(income);
        int newTax = 1000;
        return  oldTax + newTax;
    }
}

//declaration  -- i will buy a car Student abdul;
//instantiation -- nano car        abdul = new Student();
//initialization  -- started ignition   abdul.name = "ansari"
