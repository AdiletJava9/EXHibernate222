package org.example.service.impl;

import org.example.entity.Bank;
import org.example.entity.Region;
import org.example.repository.BankRepository;
import org.example.repository.impl.BankRepositoryImpl;
import org.example.service.BankService;

public class BankServiceImpl implements BankService {
    BankRepository bankRepository = new BankRepositoryImpl();

    public Bank saveBank(Bank bank) {
        return bankRepository.saveBank(bank);
    }

    public String deleteBank(Long id) {
        return bankRepository.deleteBank(id);
    }

    public Bank getBanksByRegionName(Region region) {
        return bankRepository.getBanksByRegionName(region);
    }
}
