package org.example.service;

import org.example.entity.Passport;

public interface PassportService {
    Passport savePassport(Passport passport);

    String deleteAllPassport();

    String assignPassportToClient();
}
