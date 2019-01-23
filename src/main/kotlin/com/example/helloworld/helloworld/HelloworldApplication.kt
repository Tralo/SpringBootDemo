package com.example.helloworld.helloworld

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloworldApplication

fun main(args: Array<String>) {
	println("Spring Boot2.0极简教程")
	runApplication<HelloworldApplication>(*args)
}

