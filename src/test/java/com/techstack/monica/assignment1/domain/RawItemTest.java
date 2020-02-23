package com.techstack.monica.assignment1.domain;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RawItemTest {

    @Test
    public void calculateTaxLiability() {
        Item item = new RawItem("rice", 10, 10);
        assertEquals(12.5d, item.getTax(), 0);
    }

    @Test
    public void calculateTaxLiability_whenPriceZero() {
        Item item = new RawItem("rice", 0, 10);
        assertEquals(0d, item.getTax(), 0);
    }
}