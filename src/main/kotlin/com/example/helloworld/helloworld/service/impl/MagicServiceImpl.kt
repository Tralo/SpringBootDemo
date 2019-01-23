package com.example.helloworld.helloworld.service.impl

import com.example.helloworld.helloworld.service.MagicService

class MagicServiceImpl: MagicService {
    override fun info(): String {
        return "This is magic"
    }
}