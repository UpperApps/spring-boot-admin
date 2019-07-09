package com.upperapps.springbootadmin

import de.codecentric.boot.admin.server.config.EnableAdminServer
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableAdminServer
@SpringBootApplication
class SpringbootadminApplication

fun main(args: Array<String>) {
	runApplication<SpringbootadminApplication>(*args)
}
