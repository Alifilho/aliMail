package com.alimail.aliMail.Repositories;

import com.alimail.aliMail.Interfaces.Repositories.IMailRepository;
import org.springframework.data.repository.CrudRepository;
import com.alimail.aliMail.Models.Mail;

import java.util.ArrayList;

public class MailRepository implements IMailRepository {

    private final CrudRepository _context;

    public MailRepository() {
        this._context = new CrudRepository<Mail, Integer>;
    }

    @Override
    public Mail saveMail(Mail mail) {
        return null;
    }

    @Override
    public Mail updateMail(Mail mail) {
        return null;
    }

    @Override
    public String deleteMail(int id) {
        return null;
    }

    @Override
    public ArrayList<Mail> indexMails() {
        return null;
    }

    @Override
    public Mail showMail(int id) {
        return null;
    }
}
