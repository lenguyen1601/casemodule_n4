package com.example.case_module_n4.service;

import com.example.case_module_n4.model.Account;
import com.example.case_module_n4.repository.AppUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AccountService implements UserDetailsService {
    @Autowired
    AppUserRepo appUserRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = appUserRepo.findByUserName(username);
        if (account != null) {
            return new User(account.getUsername(), account.getPassword(), (Collection<? extends GrantedAuthority>) account.getRoles());
        }
        return null;
    }
}
