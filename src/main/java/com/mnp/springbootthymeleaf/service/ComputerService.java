package com.mnp.springbootthymeleaf.service;

import com.mnp.springbootthymeleaf.model.Computer;
import com.mnp.springbootthymeleaf.repository.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComputerService {

    private ComputerRepository computerRepository;

    @Autowired
    public ComputerService(ComputerRepository computerRepository) {
        this.computerRepository = computerRepository;
    }

    public List<Computer> getListComputers(){
        return computerRepository.findAll();
    }

    public Optional<Computer> getComputer(int id){
        return computerRepository.findById(id);
    }

    public Computer saveComputer(Computer computer){
        return computerRepository.save(computer);
    }

    public void deleteComputer(int id){
        computerRepository.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void dbInit(){
        computerRepository.save(new Computer(
                "Ryzen 5 3600",
                "2 x 8GB 3600 MHz CL16",
                "Gigabyte B550 GAMING X",
                "RX 5700 XT",
                "M.2 500GB, M.2 1TB",
                "SilentiumPC Supremo FM2 650W",
                "SilentiumPC Fortis 3",
                "SilentiumPC Regnum RG6 TG ARGB",
                1300));
        computerRepository.save(new Computer(
                "Intel i5 10600KF",
                "2 x 8GB 3600 MHz CL16",
                "MSI MPG Z490 GAMING PLUS",
                "RTX 2080 Super",
                "M.2 500GB, M.2 1TB",
                "SilentiumPC Supremo FM2 650W",
                "SilentiumPC Navis 240",
                "SilentiumPC Regnum RG6 TG ARGB",
                2000));
        computerRepository.save(new Computer(
                "Intel i7 10700KF",
                "2 x 8GB 4000 MHz CL17",
                "MSI MPG Z490 GAMING CARBON WIFI",
                "RTX 2080 Ti",
                "M.2 1TB, M.2 2TB",
                "Be Quiet! Straight Power 11 750W Platinum",
                "Fractal Design Celcius S36",
                "Be Quiet! Dark Base 700",
                3500));
    }
}
