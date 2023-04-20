package com.example.carrental.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class Auth extends WebSecurityConfigurerAdapter {

    @Bean
protected PasswordEncoder passwordEncoder(){
    return new BCryptPasswordEncoder();
}
    //zmienic na baze danych
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin").password(passwordEncoder().encode("admin")).roles("Admin")
                .and()
                .withUser("user").password(passwordEncoder().encode("user")).roles("User");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
      http.authorizeRequests()


//              .antMatchers("/", "/index").permitAll() // allow access to home page for everyone
//              .antMatchers("/admin/**").hasRole("ADMIN") // require "ADMIN" role for all "/admin/**" URLs
//              .anyRequest().authenticated() // require authentication for all other URLs
//              .and()
//              .formLogin()
//              .loginPage("/login") // specify the custom login page URL
//              .permitAll() // allow access to the login page for everyone
//              .and()
//              .logout()
//              .permitAll(); // allow access to the logout URL for everyone

              .antMatchers("/","/index")
              .permitAll()
              .antMatchers("/statistics")
              .hasAnyAuthority("ROLE_Admin")
              .and()
              .csrf().disable()
              .headers().frameOptions().disable()
              .and()
              .formLogin()
              .loginPage("/login")
              .usernameParameter("username")
              .passwordParameter("password")
              .loginProcessingUrl("/login")
              .failureForwardUrl("/login?error")
              .defaultSuccessUrl("/")
              .and()
              .logout()
              .logoutSuccessUrl("/");

//            .antMatchers("/") // dostęp będą mieli wszyscy
//        .permitAll()
//        .antMach

    }
}