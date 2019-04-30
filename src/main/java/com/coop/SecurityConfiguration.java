package com.coop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.coop.web.Constantes;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests().antMatchers("/dologin*").permitAll().anyRequest().authenticated();
		http.formLogin().loginPage(Constantes.URL_DENY).loginProcessingUrl("/dologin")
				.defaultSuccessUrl(Constantes.URL_LOGINOK, true).failureForwardUrl(Constantes.URL_DENY);
		http.logout().deleteCookies("JSESSIONID", "rm", "SESSION");

		http.rememberMe().alwaysRemember(true).rememberMeParameter("rm").tokenValiditySeconds(3600);

		http.httpBasic();

	}

	@Bean
	public static PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("admin").password(passwordEncoder().encode("123")).roles("ADMINS").and()
				.withUser("user").password(passwordEncoder().encode("123")).roles("USERS");

	}

}
