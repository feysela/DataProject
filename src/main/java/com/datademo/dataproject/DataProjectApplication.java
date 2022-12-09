package com.datademo.dataproject;

import com.datademo.dataproject.domain.UnitOfMeasure;
import com.datademo.dataproject.repositories.UnitOfMeasureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DataProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataProjectApplication.class, args);
    }




    private void insertEmployees(EmployeeRepository employeeRepository,UnitOfMeasureRepository unitOfMeasureRepository){
     unitOfMeasureRepository.save(new UnitOfMeasure("foot"));

        employeeRepository.save(new Employee("Feysel","Suleman"));
    employeeRepository.save(new Employee("Anwar","Ahmed"));
    employeeRepository.save(new Employee("Atif","Hyder"));

}
}
