package com.example.restaurant2.controllers;

import com.example.restaurant2.dao.RestaurantDAO;
import com.example.restaurant2.model.RestaurantTable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tables")
public class RestaurantTableController {

    private RestaurantDAO restaurantDAO;

    public RestaurantTableController(RestaurantDAO restaurantDAO) {
        this.restaurantDAO = restaurantDAO;
    }

    @GetMapping()
    public String tables(Model model) {
        model.addAttribute(new RestaurantTable());
        model.addAttribute("tables", restaurantDAO.findAll());
        return "tables";
    }
    @PostMapping()
    public String tables(@Validated RestaurantTable table, Errors errors, Model model) {
        if(errors.hasErrors()){
            model.addAttribute("tables",restaurantDAO.findAll());
            return "tables";
        }
        else{
            restaurantDAO.save(table);
            return " redirect :/ tables ";
        }
    }



}
