package com.testcrud.CurdApplication.Service;

import java.util.List;

import com.testcrud.CurdApplication.CustomerDTO.CustomerDTO;
import com.testcrud.CurdApplication.CustomerDTO.CustomerSaveDTO;


public interface CustomerService {
    String addCustomer(CustomerSaveDTO customerSaveDTO);

    List<CustomerDTO> getAllCustomer();
}

