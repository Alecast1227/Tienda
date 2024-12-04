/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 *
 * @author casti
 */
public class ProjectConfig {
    

@Bean
public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	http
			.authorizeHttpRequests((request) -> request
			.requestMatchers("/", "/index", "/errores/**",
					"/carrito/**", "/reportes/**",
					"/registro/**", "/js/**", "/webjars/**", "/error", "/refrescarBoton")
			.permitAll()
			.requestMatchers(
					"/producto/nuevo", "/producto/guardar",
					"/producto/modificar/**", "/producto/eliminar/**",
					"/categoria/nuevo", "/categoria/guardar",
					"/categoria/modificar/**", "/categoria/eliminar/**",
					"/usuario/nuevo", "/usuario/guardar",
					"/usuario/modificar/**", "/usuario/eliminar/**",
					"/reportes/**", "/pruebas/**"
			).hasRole("ADMIN")
			.requestMatchers(
					"/producto/listado",
					"/categoria/listado",
					"/usuario/listado"
			).hasAnyRole("ADMIN", "VENDEDOR")
			.requestMatchers("/facturar/carrito")
			.hasRole("USER")
			)
			.formLogin((form) -> form
			.loginPage("/login").permitAll())
			.logout((logout) -> logout.permitAll());
	return http.build();
}

}
