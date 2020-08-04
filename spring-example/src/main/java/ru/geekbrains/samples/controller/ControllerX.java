package ru.geekbrains.samples.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.geekbrains.samples.dao.Juggler;

@Controller
public class ControllerX {

    @Autowired
    private Juggler juggler;

    @RequestMapping(value = "/juggler", method = RequestMethod.GET)
    public String getInfo(Model model) {
        model.addAttribute("juggler", juggler.perform());
        return "juggler";
    }

}