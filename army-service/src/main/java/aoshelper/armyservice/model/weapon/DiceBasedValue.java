package aoshelper.armyservice.model.weapon;

public interface DiceBasedValue {
    default boolean isDiceBased() {
        return getValue().contains("D");
    }

    default int getDiceCount() {
        if (isDiceBased()) {
            return Integer.parseInt(getValue().split("D")[0]);
        }
        return 0;
    }

    default int getDiceSides() {
        if (isDiceBased()) {
            return Integer.parseInt(getValue().split("D")[1]);
        }
        return 0;
    }

    default int getFixedValue() {
        if (!isDiceBased()) {
            return Integer.parseInt(getValue());
        }
        return 0;
    }

    String getValue();
}
