package com.rmmcosta.Sample.Rest.War.service;

import com.rmmcosta.Sample.Rest.War.model.Item;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {
    public List<Item> getItems() {
        List<Item> items = new ArrayList<>();
        Item item1 = new Item();
        item1.setName("xpto");
        item1.setDescription("this item is very rare");
        item1.setPrice(BigDecimal.valueOf(500));
        Item item2 = new Item();
        item2.setName("top");
        item2.setDescription("this item is top");
        item2.setPrice(BigDecimal.valueOf(3333));
        items.add(item1);
        items.add(item2);
        return items;
    }
}
