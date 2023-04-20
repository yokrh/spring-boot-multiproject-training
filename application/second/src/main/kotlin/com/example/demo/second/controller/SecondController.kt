package com.example.demo.second.controller

import com.example.demo.second.service.SecondService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SecondController(
    private val secondService: SecondService
) {

    @GetMapping("/v1/second/hello")
    fun hello(): ResponseEntity<String> {
        val body = secondService.hello()
        return ResponseEntity.ok().body(body)
    }
}