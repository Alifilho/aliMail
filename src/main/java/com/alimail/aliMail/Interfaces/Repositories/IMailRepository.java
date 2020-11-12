package com.alimail.aliMail.Interfaces.Repositories;

import com.alimail.aliMail.Models.Mail;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface IMailRepository {
    Mail saveMail(Mail mail);
    Mail updateMail(Mail mail);
    String deleteMail(int id);
    ArrayList<Mail> indexMails();
    Mail showMail(int id);
}
