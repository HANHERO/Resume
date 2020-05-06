package com.urise.solid.io;

public interface IData extends IReader, IPrinter{
    default int input(String text){
        print(text);
        return read();
    }
}
