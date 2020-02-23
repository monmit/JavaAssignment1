package com.techstack.monica.assignment1.service;

import com.techstack.monica.assignment1.domain.Item;

import java.util.Scanner;

public class ConsoleInputOutputServiceImpl implements InputOutputService {

    @Override
    public String getItemString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the details below for item -name, -price, -quantity and -type " +
                "(type =raw, manufactured or imported.)");
        return scanner.next();
    }

    @Override
    public boolean getReRunChoice() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (input.trim().equalsIgnoreCase("n")) {
            return false;
        } else {
            return true;

        }
    }

    @Override
    public void printRules() {

    }

    @Override
    public void printItem(Item item) {
        System.out.println(item.toString());
    }
}
