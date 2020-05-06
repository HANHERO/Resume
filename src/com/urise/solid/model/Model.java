package com.urise.solid.model;

import com.urise.solid.io.IData;
import com.urise.solid.io.IPrinter;
import com.urise.solid.service.IService;

class Model {

    private int a, b, sum;

    void init(IData data) {
        a = data.input("Enter a: ");
        b = data.input("Enter b: ");
    }

    void calc(IService service) {
        sum = service.calculate(a, b);
    }

    void done(IPrinter printer) {
        printer.print("Result: ");
        printer.print(sum);
    }

}
