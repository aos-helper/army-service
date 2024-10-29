package aoshelper.armyservice.model.unit;

import aoshelper.armyservice.model.weapon.Weapon;

import java.util.List;

public record Unit(
        String name,
        int headCount,
        UnitStats stats,
        List<Weapon> weapons) {
}
