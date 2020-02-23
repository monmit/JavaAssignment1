package com.techstack.monica.assignment1.service;

import com.techstack.monica.assignment1.domain.Item;
import com.techstack.monica.assignment1.domain.RawItem;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ParserTest {

    private Parser parser = new Parser();

    @Test
    public void testParseItem() {
        //Given
        String input = "-name   rice -type raw -price 7 -quantity 12";

        //When
        Item item = parser.parseItem(input);

        //Verify
        assertEquals("rice", item.getName());
        assertEquals(RawItem.RAW, item.getType());
        assertEquals(7, item.getPrice());
        assertEquals(12, item.getQuantity());
    }

    @Test
    public void testParseItem_withoutPriceAndQuantity() {
        //Given
        String input = "-name rice -type raw";

        //When
        Item item = parser.parseItem(input);

        //Verify
        assertEquals("rice", item.getName());
        assertEquals(RawItem.RAW, item.getType());
        assertEquals(0, item.getPrice());
        assertEquals(0, item.getQuantity());

    }

    @Test(expected = IOException.class)
    public void testParseItem_priceNonNumeric() {
        //Given
        String input = "-name rice -type raw -price fuckoff";

        //When
        Item item = parser.parseItem(input);

    }
}