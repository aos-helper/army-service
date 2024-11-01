package aoshelper.armyservice;

import aoshelper.common.armyservice.model.Army;

import java.util.List;

public interface ArmyServiceApi {

    List<String> getNames();

    Army getArmyDetails(String name);
}
