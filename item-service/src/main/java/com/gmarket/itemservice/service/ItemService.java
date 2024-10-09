package com.gmarket.itemservice.service;

import com.gmarket.itemservice.client.NameClient;
import com.gmarket.itemservice.client.PriceClient;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemService {
  private final NameClient nameClient;
  private final PriceClient priceClient;

  @CircuitBreaker(name = "nameClient")
  public String getName() {
    return nameClient.getName();
  }

  @CircuitBreaker(name = "priceClient")
  public int getPrice() {
    return priceClient.getPrice();
  }

  private String fallbackType(Throwable t) {
    return "fallback invoked! exception type : " + t.getClass();
  }
}
