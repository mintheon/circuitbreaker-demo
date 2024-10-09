package com.gmarket.itemservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "name-client", url = "http://localhost:9090")
public interface NameClient {

  @GetMapping("/name")
  String getName();
}
