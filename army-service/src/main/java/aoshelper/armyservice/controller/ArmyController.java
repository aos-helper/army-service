package aoshelper.armyservice.controller;

import aoshelper.armyservice.ArmyServiceApi;
import aoshelper.armyservice.service.ArmyService;
import aoshelper.common.armyservice.model.Army;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/army")
public class ArmyController implements ArmyServiceApi {

    private final ArmyService armyService;

    @GetMapping("/names")
    public List<String> getNames() {
        return armyService.getArmyNames();
    }

    @GetMapping("/details")
    public Army getArmyDetails(@RequestParam String name) {
        return armyService.getArmy(name);
    }
}
