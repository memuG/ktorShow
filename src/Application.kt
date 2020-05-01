package com.example

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.features.*
import org.slf4j.event.*
import io.ktor.client.*
import io.ktor.client.features.logging.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {

    // Przemkowy kraszkurs w Kotlinie
    var name: String = "Przemo"; // String może być, ale nie musi
    var d = 3.34; // średnik nie musi tu być
    var c = 'g'
    val f = 3.14F
    val l = 353L
    val i = 353
    val list = ArrayList<Any>(); // val jest immutable
    list.add(name)
    list.add(d)
    list.add(l)
    println(list.toString())
    println("Siema $name, czy wiesz, że PI to $f, a liczba longowa to $l; lista: $list")

    install(CallLogging) {
        level = Level.INFO
        filter { call -> call.request.path().startsWith("/") }
    }


    val client = HttpClient() {
        install(Logging) {
            level = LogLevel.HEADERS
        }
    }

}

