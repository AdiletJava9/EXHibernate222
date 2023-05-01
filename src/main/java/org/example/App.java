package org.example;

import org.example.config.HibernateConfig;
import org.example.entity.Bank;
import org.example.entity.Client;
import org.example.entity.Passport;
import org.example.entity.Region;
import org.example.service.RegionService;
import org.example.service.impl.BankServiceImpl;
import org.example.service.impl.ClientServiceImpl;
import org.example.service.impl.PassportServiceImpl;
import org.example.service.impl.RegionServiceImpl;
import org.hibernate.Hibernate;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        HibernateConfig.getEntityManager();
        Client client = new Client("Adilet Islambek uulu", "+996708819031");
        Client client1 = new Client("Adilet Islambek uulu1", "+996708819032");
        Client client2 = new Client("Adilet Islambek uulu2", "+996708819033");
        Client client3 = new Client("Adilet Islambek uulu3", "+9967088190314");
        ClientServiceImpl clientService = new ClientServiceImpl();
//        clientService.saveClient(client);
//        clientService.saveClient(client3);
//        System.out.println(clientService.deleteById(2L));
//        System.out.println(clientService.findById(3L));
//--------------------------------------------------------------------------------------------------------
        Bank bank = new Bank("SberBank", "Moscow");
        Bank bank1 = new Bank("MBank", "Bishkek");
        Bank bank2 = new Bank("OptimaBank", "Tashkent");
        BankServiceImpl bankService = new BankServiceImpl();
//        bankService.saveBank(bank1);
//        bankService.saveBank(bank2);
//        System.out.println(bankService.deleteBank(1L));
//----------------------------------------------------------------------------------------------------------
        Passport passport = new Passport("7879879");
        Passport passport1 = new Passport("7879879");
        Passport passport2 = new Passport("7879879");
        PassportServiceImpl passportService = new PassportServiceImpl();
//        System.out.println(passportService.savePassport(passport));
//        System.out.println(passportService.savePassport(passport1));
//        System.out.println(passportService.savePassport(passport2));
//-----------------------------------------------------------------------------------------------------------
        Region region = new Region("Vostok-5");
        RegionService regionService = new RegionServiceImpl();
//        regionService.saveRegion(region);
//        System.out.println(regionService.getAll());
//        System.out.println(regionService.updateById(1L));
    }
}
