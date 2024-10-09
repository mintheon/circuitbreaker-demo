package com.gmarket.priceservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceController {

  @GetMapping("/price")
  public int getPrice() {
    return 52300;
  }
}