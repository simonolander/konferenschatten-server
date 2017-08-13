package se.olander.konferenschatten

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KonferenschattenApplication

fun main(args: Array<String>) {
    SpringApplication.run(KonferenschattenApplication::class.java, *args)
}
