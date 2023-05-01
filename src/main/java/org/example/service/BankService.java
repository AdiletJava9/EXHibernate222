package org.example.service;

import org.example.entity.Bank;
import org.example.entity.Region;

public interface BankService {
    Bank saveBank(Bank bank);

    String deleteBank(Long id);

    Bank getBanksByRegionName(Region region);

}
