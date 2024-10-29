package aoshelper.armyservice.service;

import aoshelper.armyservice.model.Army;
import aoshelper.armyservice.repository.ArmyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArmyService {
    private final ArmyRepository armyRepository;

    public void save(Army army) {
        armyRepository.save(army);
    }

    public Army getArmy(String name) {
        return armyRepository.getArmy(name);
    }

    public List<Army> getAllArmies() {
        return armyRepository.getAllArmies();
    }

    public List<String> getArmyNames() {
        return armyRepository.getArmyNames();
    }
}
