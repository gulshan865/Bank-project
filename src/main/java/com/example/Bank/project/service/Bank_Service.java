package com.example.Bank.project.service;

import ch.qos.logback.core.net.server.Client;
import com.example.Bank.project.model.Bank;
import com.example.Bank.project.repositroy.Bank_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Bank_Service {

    @Autowired
    private Bank_Repository bankRepository;

    public void addclient(Bank bank){
        bankRepository.save(bank);
    }

    public List<Bank> getclient(){
        return bankRepository.findAll();
    }

    public  Bank getclientbyid(int id){
        Optional<Bank> bank=bankRepository.findById(id);
        if (bank.isPresent()){
            return bank.get();
        }
        return null;
    }

    public void deleteclient(int id){
        bankRepository.deleteById(id);
    }



}
