/**
 * Copyright 2016 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.townbook.service.auth;

import java.util.Arrays;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import jp.co.namihira.townbook.integration.dto.UserDto;

/**
 * Authentication Provider for App
 */
public class ApplicationUsernamePasswordAuthenticationProvider implements AuthenticationProvider {

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        // Identify user
        final String username = authentication.getName();
        final String password = authentication.getCredentials().toString();
        final UserDto user = new UserDto();
        user.setUserId(username);
        user.setPassword(password);
        
        // Create authentication token
        return new UsernamePasswordAuthenticationToken(user, authentication.getCredentials(), 
                Arrays.asList(new SimpleGrantedAuthority("ROLE_USER")));
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken.class.equals(authentication);
    }

}
