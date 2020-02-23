package com.techstack.monica.assignment1;

import com.techstack.monica.assignment1.service.ConsoleInputOutputServiceImpl;
import com.techstack.monica.assignment1.service.ItemService;
import com.techstack.monica.assignment1.service.Parser;

public class Main {
    public static void main(String[] args) {
        new ItemService(new ConsoleInputOutputServiceImpl(), new Parser()).run();
    }
}
