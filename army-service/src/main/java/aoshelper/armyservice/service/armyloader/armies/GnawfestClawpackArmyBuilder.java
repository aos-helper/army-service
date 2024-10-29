package aoshelper.armyservice.service.armyloader.armies;

import aoshelper.armyservice.model.Army;
import aoshelper.armyservice.model.unit.Unit;
import aoshelper.armyservice.model.unit.UnitStats;
import aoshelper.armyservice.model.weapon.Attack;
import aoshelper.armyservice.model.weapon.Damage;
import aoshelper.armyservice.model.weapon.Hit;
import aoshelper.armyservice.model.weapon.Range;
import aoshelper.armyservice.model.weapon.Rend;
import aoshelper.armyservice.model.weapon.Weapon;
import aoshelper.armyservice.model.weapon.WeaponType;
import aoshelper.armyservice.model.weapon.Wound;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GnawfestClawpackArmyBuilder implements ArmyBuilder {
    @Override
    public Army buildArmy() {
        return new Army(
                "Gnawfest Clawpack",
                List.of(
                        new Unit("Clawlord on Gwant-Beast", 1,
                                new UnitStats(7, 4),
                                List.of(
                                        new Weapon(
                                                "Ratling Pistol",
                                                WeaponType.RANGED,
                                                new Range(10),
                                                new Attack("D6"),
                                                new Hit(3),
                                                new Wound(3),
                                                new Rend(1),
                                                new Damage(1)),
                                        new Weapon(
                                                "Warpforged Halberd",
                                                WeaponType.MELEE,
                                                new Range(1),
                                                new Attack(5),
                                                new Hit(3),
                                                new Wound(4),
                                                new Rend(1),
                                                new Damage(2)),
                                        new Weapon(
                                                "Gnaw-beast’s Chisel Fangs",
                                                WeaponType.MELEE,
                                                new Range(1),
                                                new Attack(4),
                                                new Hit(4),
                                                new Wound(3),
                                                new Rend(1),
                                                new Damage("D3"))
                                )),
                        new Unit("Gray Seer", 1,
                                new UnitStats(5, 6),
                                List.of(
                                        new Weapon(
                                                "Warpstone Staff",
                                                WeaponType.MELEE,
                                                new Range(1),
                                                new Attack(3),
                                                new Hit(4),
                                                new Wound(4),
                                                new Rend(1),
                                                new Damage("D3"))
                                )),
                        new Unit("Warlock Engineer ", 1,
                                new UnitStats(5, 5),
                                List.of(
                                        new Weapon(
                                                "Warplock Musket",
                                                WeaponType.RANGED,
                                                new Range(24),
                                                new Attack(2),
                                                new Hit(3),
                                                new Wound(3),
                                                new Rend(2),
                                                new Damage("D3"))
                                )),
                        new Unit("Clanrats I", 10,
                                new UnitStats(1, 5),
                                List.of(
                                        new Weapon(
                                                "Rusty Blade",
                                                WeaponType.MELEE,
                                                new Range(1),
                                                new Attack(2),
                                                new Hit(4),
                                                new Wound(5),
                                                new Rend(0),
                                                new Damage(1))
                                )),
                        new Unit("Clanrats II", 10,
                                new UnitStats(1, 5),
                                List.of(
                                        new Weapon(
                                                "Rusty Blade",
                                                WeaponType.MELEE,
                                                new Range(1),
                                                new Attack(2),
                                                new Hit(4),
                                                new Wound(5),
                                                new Rend(0),
                                                new Damage(1))
                                )),
                        new Unit("Rat Ogors", 3,
                                new UnitStats(4, 5),
                                List.of(
                                        new Weapon(
                                                "Warpfire Gun",
                                                WeaponType.RANGED,
                                                new Range(10),
                                                new Attack("2D6"),
                                                new Hit(2),
                                                new Wound(4),
                                                new Rend(2),
                                                new Damage(1)),
                                        new Weapon(
                                                "Claws, Blades and Fangs",
                                                WeaponType.MELEE,
                                                new Range(1),
                                                new Attack(5),
                                                new Hit(4),
                                                new Wound(3),
                                                new Rend(1),
                                                new Damage(2)
                                        ))
                        )));
    }

}
