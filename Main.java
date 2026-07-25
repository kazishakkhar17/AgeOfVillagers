package aov;

import aov.factories.ThemeType;
import aov.village.Village;

/**
 * CLIENT CODE.
 * No "new House(...)", "new Rectangle(...)", "new BrickHouseBuilder(...)",
 * "new ModernVillageFactory()", or even "new Village(...)" appears here.
 * The client only picks a ThemeType enum value — every object in the
 * system is created by a Builder, a Factory, or the Provider registry.
 */
public class Main {
    public static void main(String[] args) {

        Village modernVillage = Village.of(ThemeType.MODERN);
        modernVillage.build();

        Village traditionalVillage = Village.of(ThemeType.TRADITIONAL);
        traditionalVillage.build();

        Village desertVillage = Village.of(ThemeType.DESERT);
        desertVillage.build();


        // Future scope: a "Forest Village" (Log Cabin, Pine Tree, Stream) can be
        // added the same way Desert was — 3 new builders + 1 new factory class +
        // one ThemeType/registry entry — with zero changes to any class above.
    }
}
