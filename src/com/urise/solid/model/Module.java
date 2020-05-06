package com.urise.solid.model;

import com.urise.solid.io.Data;
import com.urise.solid.io.IData;
import com.urise.solid.io.IPrinter;
import com.urise.solid.io.IReader;
import com.urise.solid.service.IService;

public class Module {

    private IPrinter printer;
    private IService service;
    private IData data;

    public Module(IReader reader, IPrinter printer, IService service) {
        this.printer = printer;
        this.service = service;
        this.data = new Data(reader, printer);
    }

    public void execute() {
        Model model = new Model();
        model.init(data);
        model.calc(service);
        model.done(printer);
    }
}
