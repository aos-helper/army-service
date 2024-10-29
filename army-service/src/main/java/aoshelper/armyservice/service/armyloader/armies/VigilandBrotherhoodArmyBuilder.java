package aoshelper.armyservice.service.armyloader.armies;

import aoshelper.common.armyservice.model.Army;
import aoshelper.common.armyservice.model.unit.Unit;
import aoshelper.common.armyservice.model.unit.UnitStats;
import aoshelper.common.armyservice.model.weapon.Attack;
import aoshelper.common.armyservice.model.weapon.Damage;
import aoshelper.common.armyservice.model.weapon.Hit;
import aoshelper.common.armyservice.model.weapon.Range;
import aoshelper.common.armyservice.model.weapon.Rend;
import aoshelper.common.armyservice.model.weapon.Weapon;
import aoshelper.common.armyservice.model.weapon.WeaponType;
import aoshelper.common.armyservice.model.weapon.Wound;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VigilandBrotherhoodArmyBuilder implements ArmyBuilder {
    @Override
    public Army buildArmy() {
        return new Army(
                "Vigiland Brotherhood",
                List.of(
                        new Unit("Lord-Vigilant On Gryph-Stalker", 1,
                                new UnitStats(12, 3),
                                List.of(
                                        new Weapon(
                                                "Hallowed Greataxe",
                                                WeaponType.MELEE,
                                                new Range(1),
                                                new Attack(5),
                                                new Hit(3),
                                                new Wound(3),
                                                new Rend(2),
                                                new Damage(2)),
                                        new Weapon(
                                                "Gryph-stalker’s Beak and Talons",
                                                WeaponType.MELEE,
                                                new Range(1),
                                                new Attack(3),
                                                new Hit(4),
                                                new Wound(3),
                                                new Rend(1),
                                                new Damage(2))
                                )),
                        new Unit("Lord-Veritant", 1,
                                new UnitStats(6, 3),
                                List.of(
                                        new Weapon(
                                                "Staff of Abjurationf",
                                                WeaponType.MELEE,
                                                new Range(1),
                                                new Attack(1),
                                                new Hit(3),
                                                new Wound(3),
                                                new Rend(1),
                                                new Damage(3)),
                                        new Weapon(
                                                "Judgement Blade",
                                                WeaponType.MELEE,
                                                new Range(1),
                                                new Attack(3),
                                                new Hit(3),
                                                new Wound(3),
                                                new Rend(1),
                                                new Damage("D3"))
                                )),
                        new Unit("Prosecutors", 3,
                                new UnitStats(2, 3),
                                List.of(
                                        new Weapon(
                                                "Stormcall Javelin",
                                                WeaponType.RANGED,
                                                new Range(10),
                                                new Attack(1),
                                                new Hit(3),
                                                new Wound(3),
                                                new Rend(1),
                                                new Damage("D3")),
                                        new Weapon(
                                                "Stormcall Javelin",
                                                WeaponType.MELEE,
                                                new Range(1),
                                                new Attack(3),
                                                new Hit(3),
                                                new Wound(3),
                                                new Rend(1),
                                                new Damage(1))
                                )),
                        new Unit("Liberators", 5,
                                new UnitStats(2, 3),
                                List.of(
                                        new Weapon(
                                                "Warhammer",
                                                WeaponType.MELEE,
                                                new Range(1),
                                                new Attack(2),
                                                new Hit(3),
                                                new Wound(3),
                                                new Rend(1),
                                                new Damage(1)),
                                        new Weapon(
                                                "Grandhammer",
                                                WeaponType.MELEE,
                                                new Range(1),
                                                new Attack(2),
                                                new Hit(3),
                                                new Wound(3),
                                                new Rend(1),
                                                new Damage(2))
                                ))
                ));
    }

}
