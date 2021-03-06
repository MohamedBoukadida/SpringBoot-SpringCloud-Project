package com.soa.book_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
public class BookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookServiceApplication.class, args);
	}

	// @Bean
	// public CorsFilter corsFilter() {
	// 	CorsConfiguration corsConfiguration = new CorsConfiguration();
	// 	corsConfiguration.setAllowCredentials(true);
	// 	corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
	// 	corsConfiguration.setAllowedHeaders(
	// 			Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type", "Accept", "Authorization",
	// 					"Origin, Accept", "X-Requested-With", "Access-Control-Request-Method",
	// 					"Access-Control-Request-Headers"));

	// 	corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization",
	// 			"Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));

	// 	corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
	// 	UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
	// 	urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
	// 	return new CorsFilter(urlBasedCorsConfigurationSource);
	// }

	

}
