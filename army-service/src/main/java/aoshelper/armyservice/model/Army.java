package aoshelper.armyservice.model;

import aoshelper.armyservice.model.unit.Unit;

import java.util.List;

public record Army(String name, List<Unit> units) {
}
