package aoshelper.armyservice.repository;

import aoshelper.armyservice.model.Army;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ArmyRepository {
    private final Map<String, Army> armies = new HashMap<>();

    public void save(Army army) {
        armies.put(army.name(), army);
    }

    public Army getArmy(String name) {
        return armies.get(name);
    }

    public List<Army> getAllArmies() {
        return List.copyOf(armies.values());
    }

    public List<String> getArmyNames() {
        return List.copyOf(armies.keySet());
    }
}
