package com.example.helloworld.helloworld.controller

import com.example.helloworld.helloworld.service.MagicService
import com.example.helloworld.helloworld.utils.SpringContextUtil
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.lang.Exception

@RestController
class MagicController {

    @GetMapping("/magic")
    fun magic():String{
        try {
            val magicService = SpringContextUtil.getBean("magiceService") as MagicService

            return magicService.info()
        } catch (e: Exception) {
            e.printStackTrace()
        }


        return "null"

    }

}