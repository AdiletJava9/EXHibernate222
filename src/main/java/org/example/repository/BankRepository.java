package org.example.repository;

import org.example.entity.Bank;
import org.example.entity.Region;

public interface BankRepository {
    Bank saveBank(Bank bank);

    String deleteBank(Long id);

    Bank getBanksByRegionName(Region region);


}
