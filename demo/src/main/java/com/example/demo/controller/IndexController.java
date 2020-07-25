package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(Form form, Model model) {

        List<Person> lists = new ArrayList<Person>();

        Person person = new Person();
        person.setId(1);
        person.setName("りさん11");
        lists.add(person);

        Person person2 = new Person();
        person2.setId(2);
        person2.setName("ちょうさん");
        lists.add(person2);

        Person person3 = new Person();
        person3.setId(3);
        person3.setName("ばさん");
        lists.add(person3);

        form.setPersons(lists);

        model.addAttribute("form", form);
        return "index";
    }

    @RequestMapping(value = "/confirm", method = RequestMethod.POST)
    public String confirm(@Validated Form form, BindingResult result, Model model) {
        if (result.hasErrors()) {
            System.out.println("ConfirmController.doPost().haserrors");
        }
        System.out.println(form.getName());

        return index(form, model);
    }

    private void toExcel(){

    }
}

