package com.rmmcosta.Sample.Rest.War.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Item {
    private String name;
    private String description;
    private BigDecimal price;
}
