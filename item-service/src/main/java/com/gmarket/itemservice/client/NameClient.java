package com.gmarket.itemservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "name-client", url = "http://localhost:9090")
public interface NameClient {

  @GetMapping("/name")
  String getName(@RequestParam String itemNo);
}
