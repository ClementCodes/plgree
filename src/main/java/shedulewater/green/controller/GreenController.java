package shedulewater.green.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import shedulewater.green.model.Plant;
import shedulewater.green.service.GreenService;

//ici on recupere les requetes http
@RestController
public class GreenController {

    @Autowired
    private GreenService greenServices;

    @RequestMapping(method = RequestMethod.GET, value = "/plants")
    public List<Plant> getPlants() {

        return greenServices.getMultiplePlant();
    }

    @RequestMapping("/plant/{id}")
    public Plant getPlant(@PathVariable int id) {

        return greenServices.getPlant(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/plant/{id}")
    public void deletePlant(@PathVariable int id) {

        greenServices.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/plants")
    public void createPlant(@RequestBody Plant plant) {

        greenServices.createPlant(plant);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/plant/{id}")
    public void updatePlant(@RequestBody Plant plant, @PathVariable int id) {

        greenServices.update(plant, id);
    }

}
