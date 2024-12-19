package com.testcrud.CurdApplication.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testcrud.CurdApplication.CustomerDTO.CustomerDTO;
import com.testcrud.CurdApplication.CustomerDTO.CustomerSaveDTO;
import com.testcrud.CurdApplication.Entity.Customer;
import com.testcrud.CurdApplication.Repo.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerRepo customerRepo;
    @Override
    public String addCustomer(CustomerSaveDTO customerSaveDTO) {
        Customer customer = new Customer(
                customerSaveDTO.getName(),
                customerSaveDTO.getContact()
        );
        customerRepo.save(customer);
        return customer.getContact();
    }

    @Override
    public List<CustomerDTO> getAllCustomer() {
        List<Customer>  getCustomers =customerRepo.findAll();
        List<CustomerDTO> customerDTOList =new ArrayList<>();
        for (Customer a:getCustomers){
            CustomerDTO customerDTO = new CustomerDTO(a.getId(), a.getName(), a.getContact());
            customerDTOList.add(customerDTO);
        }
                return customerDTOList;
    }
}
