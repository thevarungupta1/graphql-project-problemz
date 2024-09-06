package com.thevarungupta.problemz.security;

import com.thevarungupta.problemz.entity.Userz;
import com.thevarungupta.problemz.repository.UserzRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.Collection;


public class ProblemzAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private UserzRepository userzRepository;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        var user = userzRepository.findUserByToken(authentication.getCredentials().toString())
                .orElse(new Userz());
        return new UsernamePasswordAuthenticationToken(user, authentication.getCredentials().toString(),
                getAuthorities(user.getUserRole()));
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }

    private Collection<? extends GrantedAuthority> getAuthorities(String userRole){
        var authorities = new ArrayList<GrantedAuthority>();
        if(StringUtils.isNotBlank(userRole)){
            authorities.add(new SimpleGrantedAuthority(userRole));
        }
        return authorities;
    }
}
