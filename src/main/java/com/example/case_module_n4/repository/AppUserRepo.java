package com.example.case_module_n4.repository;

import com.example.case_module_n4.model.Account;
import org.springframework.data.repository.CrudRepository;

public interface AppUserRepo extends CrudRepository<Account, Long> {
    Account findByUserName(String userName);
}
