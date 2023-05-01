package org.example.service.impl;

import org.example.entity.Passport;
import org.example.repository.PassportRepository;
import org.example.repository.impl.PassportRepositoryImpl;
import org.example.service.PassportService;

public class PassportServiceImpl implements PassportService {
     PassportRepository passportRepository = new PassportRepositoryImpl();

    public Passport savePassport(Passport passport) {
        return passportRepository.savePassport(passport);
    }

    public String deleteAllPassport() {
        return passportRepository.deleteAllPassport();
    }

    public String assignPassportToClient() {
        return passportRepository.assignPassportToClient();
    }
}
