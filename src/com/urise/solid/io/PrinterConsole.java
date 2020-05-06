package com.urise.solid.io;

public class PrinterConsole implements IPrinter {
    @Override
    public void print(String text) {
        System.out.print(text);
    }

    @Override
    public void print(int number) {
        System.out.println(number);
    }
}
