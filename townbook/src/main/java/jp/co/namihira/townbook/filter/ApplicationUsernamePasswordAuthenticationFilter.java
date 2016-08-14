/**
 * Copyright 2016 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.townbook.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class ApplicationUsernamePasswordAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        System.out.println("called attemptAuthentication");
        if (!request.getMethod().equals("POST")) {
            throw new AuthenticationServiceException("Authentication method not supported: " + request.getMethod());
        }

        final String username = super.obtainUsername(request);
        final String password = super.obtainPassword(request);

        // FIXME
        if (!username.equals("namihira") && !password.equals("namihira")) {
            throw new AuthenticationServiceException("Authentication Error");
        }
        
        final UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(username, password);
        
        return this.getAuthenticationManager().authenticate(authToken);
    }
    
}
