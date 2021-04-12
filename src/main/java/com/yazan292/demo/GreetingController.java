package com.yazan292.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	//Greeting greeting(@RequestParam(required = false) String name) {
    Greeting greeting(@RequestParam(defaultValue = "yazan") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));

    }
	
}