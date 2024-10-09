package com.gmarket.itemservice.controller;

import com.gmarket.itemservice.domain.Item;
import com.gmarket.itemservice.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ItemController {
  private final ItemService itemService;

  @GetMapping("/item")
  public Item getItem(String itemNo) {
    return new Item(itemNo, itemService.getName(), itemService.getPrice());
  }
}
