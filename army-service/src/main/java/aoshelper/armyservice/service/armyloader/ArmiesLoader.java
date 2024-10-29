package aoshelper.armyservice.service.armyloader;

import aoshelper.armyservice.service.ArmyService;
import aoshelper.armyservice.service.armyloader.armies.ArmyBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ArmiesLoader implements ApplicationRunner {

    private final ArmyService armyService;
    private final List<ArmyBuilder> armyBuilders;

    @Override
    public void run(ApplicationArguments args) {
        armyBuilders.forEach(armyBuilder -> armyService.save(armyBuilder.buildArmy()));
    }
}
