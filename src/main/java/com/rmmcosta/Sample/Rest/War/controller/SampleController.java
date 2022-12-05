package com.rmmcosta.Sample.Rest.War.controller;

import com.rmmcosta.Sample.Rest.War.model.Item;
import com.rmmcosta.Sample.Rest.War.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sample")
public class SampleController {
    @Autowired
    ItemService itemService;

    @GetMapping("/item")
    public ResponseEntity<List<Item>> getItems() {
        return new ResponseEntity<>(itemService.getItems(), HttpStatus.OK);
    }

}
