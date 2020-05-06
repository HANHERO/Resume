package com.urise.solid;

import com.urise.solid.io.*;
import com.urise.solid.model.Model;
import com.urise.solid.service.IService;
import com.urise.solid.service.ServiceSum;

import java.util.Scanner;

public class Program {
    public static void main(String ... args){
        Scanner scanner = new Scanner(System.in);
        IReader reader = new ReaderConsole(scanner);
        IPrinter printer = new PrinterConsole();
        IData data = new Data(reader,printer);
        IService service = new ServiceSum();
        Model model = new Model();
        model.init(data);
        model.calc(service);
        model.done(printer);
    }
}
