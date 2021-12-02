package com.example.Bank.project.repositroy;

import ch.qos.logback.core.net.server.Client;
import com.example.Bank.project.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Bank_Repository extends JpaRepository<Bank,Integer> {
    static void save(Client user) {
    }
}
