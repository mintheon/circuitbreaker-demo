package com.gmarket.itemservice.exception;

import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import java.util.concurrent.CompletionException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {
  @org.springframework.web.bind.annotation.ExceptionHandler(CallNotPermittedException.class)
  public ResponseEntity<String> handleCircuitBreakerException1(Throwable t) {
    return ResponseEntity.internalServerError()
        .body( "fallback invoked! exception type : " + t.getClass());
  }

  @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
  public ResponseEntity<String> handleCircuitBreakerException4(Throwable t) {
    return ResponseEntity.internalServerError()
        .body( "fallback invoked! exception type : " + t.getClass());
  }
}
