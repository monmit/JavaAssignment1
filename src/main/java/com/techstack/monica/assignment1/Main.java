package main.java.com.techstack.monica.assignment1;

import main.java.com.techstack.monica.assignment1.service.FileInputOutputServiceImpl;
import main.java.com.techstack.monica.assignment1.service.ItemService;
import main.java.com.techstack.monica.assignment1.service.Parser;

public class Main {
    public static void main(String[] args) {
        new ItemService(new FileInputOutputServiceImpl(), new Parser()).run();
    }
}
