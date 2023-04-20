package com.example.demo.common.service

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class CommonService(
) {
    @Value("\${tmp.prop}")
    private val prop: String = ""

    fun hello(prefix: String): String {
        return "$prefix hello, " + prop
    }
}