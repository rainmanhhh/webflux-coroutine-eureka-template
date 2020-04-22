package com.example.demo

import kotlinx.coroutines.delay
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/")
@ConfigurationPropertiesScan
@SpringBootApplication
class DemoApplication {
  @GetMapping
  suspend fun hello(): String {
    delay(100)
    return "hello world"
  }
}

fun main(args: Array<String>) {
  runApplication<DemoApplication>(*args)
}
