package com.techstack.monica.assignment1.service;

import com.techstack.monica.assignment1.domain.Item;

public class ItemService {

    private InputOutputService inputOutputService;
    private Parser parser;

    public ItemService(InputOutputService inputOutputService, Parser parser) {
        this.inputOutputService = inputOutputService;
        this.parser = parser;
    }

    public void run() {
        inputOutputService.printRules();
        boolean run = true;
        while (run) {
            String input = inputOutputService.getItemString();
            Item item = parser.parseItem(input);
            inputOutputService.printItem(item);
            run = inputOutputService.getReRunChoice();
        }
    }
}