package shedulewater.green.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import shedulewater.green.model.Plant;
import shedulewater.green.repository.PlantRepository;

//le service c'est une classe qui est charge de nous forunir les donnees metiers (ici les donnes de la plante) 
@Service
public class GreenService {

    private PlantRepository plantRepo;

    // static private ArrayList<Plant> plants = new ArrayList<>(Arrays.asList(
    // new Plant(1, "banzai", 3, Plant.Pot.plastic),
    // new Plant(2, "banzai", 3, Plant.Pot.plastic),
    // new Plant(3, "banzai", 3, Plant.Pot.plastic),
    // new Plant(4, "banzai", 3, Plant.Pot.plastic),
    // new Plant(5, "banzais", 3, Plant.Pot.earth)));

    public List<Plant> getMultiplePlant() {
        List<Plant> plants = new ArrayList<>();

        return plants;
    }

    // le stream recupere l objet resolu afin de recuper le stream pour la
    // prohchaine methode
    // L’API Stream est introduite dans Java 8, et est utilisée pour traiter des
    // collections d’objets. Un flux(stream) est une séquence d’objets qui prend en
    // charge diverses méthodes qui peuvent être enchaînées pour produire le
    // résultat souhaité.
    public Plant getPlant(int id) {
        return plantRepo.findById(id).orElse(null);
    }

    public void delete(int id) {
        plantRepo.delete

    }

    public void createPlant(Plant plant) {
        plants.add(plant);

    }

    public void update(Plant plant, int id) {

        plants.forEach(plant1 -> {
            if (plant1.getId() == id) {
                plants.set(plants.indexOf(plant1), plant);
            }
        });
    }

}
