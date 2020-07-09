package com.mnp.springbootthymeleaf.controller;

import com.mnp.springbootthymeleaf.model.Computer;
import com.mnp.springbootthymeleaf.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("computers")
public class ComputerController {

    private ComputerService computerService;

    @Autowired
    public ComputerController(ComputerService computerService) {
        this.computerService = computerService;
    }

    @GetMapping("get-computers")
    public String getComputers(Model model){
        List<Computer> listComputers = computerService.getListComputers();

        model.addAttribute("listComputers", listComputers);

        return "list-computers";
    }
}
