package org.example.repository;

import org.example.entity.Passport;

public interface PassportRepository {
    Passport savePassport(Passport passport);

    String deleteAllPassport();

    String assignPassportToClient();


}
