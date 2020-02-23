package com.techstack.monica.assignment1.service;

import com.techstack.monica.assignment1.domain.Item;

public interface InputOutputService {

    String getItemString();

    boolean getReRunChoice();

    void printRules();

    void printItem(Item item);
}
