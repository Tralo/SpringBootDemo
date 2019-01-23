package com.example.helloworld.helloworld.condition

import org.springframework.context.annotation.Condition
import org.springframework.context.annotation.ConditionContext
import org.springframework.core.env.get
import org.springframework.core.type.AnnotatedTypeMetadata

class MagicCondition :Condition {
    override fun matches(context: ConditionContext, metadata: AnnotatedTypeMetadata): Boolean {
        val env = context.environment
        if (env.containsProperty("magic")){
            val b = env["magic"]
            println("b的值为: " + b)
            return b == "true"
        }

        return false
    }

}