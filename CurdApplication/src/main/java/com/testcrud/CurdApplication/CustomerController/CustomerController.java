package com.testcrud.CurdApplication.CustomerController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.testcrud.CurdApplication.CustomerDTO.CustomerDTO;
import com.testcrud.CurdApplication.CustomerDTO.CustomerSaveDTO;
import com.testcrud.CurdApplication.Service.CustomerService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/customer")
public class CustomerController {
    @Autowired
    private CustomerService customrService;
    @PostMapping(path = "/save")
    public String saveCustomer(@RequestBody CustomerSaveDTO customerSaveDTO){
        String id = customrService.addCustomer(customerSaveDTO);
        return id;
    }
    @GetMapping(path = "/getall")
    public List<CustomerDTO> getAllCustomer(){
        List<CustomerDTO> allCustomers = customrService.getAllCustomer();
        return allCustomers;
    }
}
