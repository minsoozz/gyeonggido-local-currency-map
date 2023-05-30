package com.github.minsoozz.map

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing
import org.springframework.boot.runApplication

@EnableBatchProcessing
class GyeonggidoLocalCurrencyMapApplication

fun main(args: Array<String>) {
	runApplication<GyeonggidoLocalCurrencyMapApplication>(*args)
}
