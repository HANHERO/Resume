package com.urise.solid;

import com.urise.solid.io.IPrinter;
import com.urise.solid.io.IReader;
import com.urise.solid.io.PrinterConsole;
import com.urise.solid.io.ReaderConsole;
import com.urise.solid.model.Module;
import com.urise.solid.service.IService;
import com.urise.solid.service.ServiceSum;

import java.util.Scanner;

public class ProgramSOLID {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        IReader reader = new ReaderConsole(scanner);
        IPrinter printer = new PrinterConsole();
        IService service = new ServiceSum();
        Module module = new Module(reader, printer, service);
        module.execute();
    }
}