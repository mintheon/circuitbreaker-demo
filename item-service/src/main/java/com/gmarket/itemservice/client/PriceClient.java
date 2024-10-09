package com.gmarket.itemservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "price-client", url = "http://localhost:9091")
public interface PriceClient {

  @GetMapping("/price")
  int getPrice();
}
