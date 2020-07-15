package com.mnp.springbootthymeleaf.controller;

import com.mnp.springbootthymeleaf.model.Computer;
import com.mnp.springbootthymeleaf.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("springboot-thymeleaf")
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
        model.addAttribute("newComputer", new Computer());

        return "list-computers";
    }

    @PostMapping("add-computer")
    public String addComputer(@ModelAttribute Computer computer){
        computerService.saveComputer(computer);
        System.out.println(computer);

        return "redirect:get-computers";
    }

    @GetMapping("delete-computer")
    public String deleteComputer(@RequestParam(name="id") int id){
        computerService.deleteComputer(id);

        return "redirect:get-computers";
    }
}
