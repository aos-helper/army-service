package aoshelper.armyservice.controller;

import aoshelper.armyservice.service.ArmyService;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ArmyControllerTest {

    private final ArmyService armyService = mock();
    private final ArmyController diceRollController = new ArmyController(armyService);
}