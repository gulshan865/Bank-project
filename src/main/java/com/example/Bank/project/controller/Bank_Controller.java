package com.example.Bank.project.controller;

import ch.qos.logback.core.net.server.Client;
import com.example.Bank.project.model.Bank;
import com.example.Bank.project.repositroy.Bank_Repository;
import com.example.Bank.project.service.Bank_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class Bank_Controller<user> {

    @Autowired
    private Bank_Service service;


    @GetMapping("/")
    public String your_account_details(Model model){

        List<Bank> clientlist = service.getclient();
            model.addAttribute("clientlist",clientlist);

            return "index";
    }
    @GetMapping("addclient")
    public String addclient(){
        return "addclient";
    }

    @PostMapping("/register")
    public String clientregister(@ModelAttribute Bank bank, HttpSession session){
        System.out.println(bank);
        service.addclient(bank);
        session.setAttribute("message","client data added successfully");
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model){
        Bank bank= service.getclientbyid(id);
        model.addAttribute("client",bank);
        return "edit";
    }
    @GetMapping("/delete/{id}")
    public String deleteclient(@PathVariable int id,HttpSession session){
        service.deleteclient(id);
        session.setAttribute("message","Client data deleted successfully");
        return "redirect:/";
    }

}
