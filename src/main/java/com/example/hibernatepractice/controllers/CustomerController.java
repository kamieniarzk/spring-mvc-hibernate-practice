package com.example.hibernatepractice.controllers;


import com.example.hibernatepractice.model.Customer;
import com.example.hibernatepractice.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("customers", customerService.getCustomers());
        return "customer-list";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "customer-form";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute("customer") Customer customer) {
        customerService.saveCustomer(customer);
        return "redirect:/customer/list";
    }

    @RequestMapping("/{id}")
    public String update(@PathVariable("id") String id, Model model) {
        Customer customer = new Customer();
        customer = customerService.getCustomer(Integer.valueOf(id));
        model.addAttribute("customer", customer);
        return "customer-form";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id, Model model) {
        customerService.deleteCustomer(id);
        return "redirect:/customer/list";
    }
}
