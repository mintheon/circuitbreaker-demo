package com.gmarket.itemservice.domain;

public record Item  (
    String itemNo,
    String Name,
    int price
) {}