package aov.village;

import aov.factories.ThemeType;
import aov.factories.VillageFactory;
import aov.factories.VillageFactoryProvider;
import aov.villageobjects.VillageObject;
import java.util.ArrayList;
import java.util.List;

/**
 * COMPOSITE PATTERN (village-level):
 * A Village "can have several types of objects" (House, Tree, WaterSource).
 * It holds them as a single collection and can operate on all of them
 * uniformly (e.g. buildAll()/drawAll()), without knowing their internals.
 *
 * NOTE: The constructor is private. Client code never writes
 * "new ModernVillageFactory()" or "new Village(factory)" directly — it
 * calls the static factory method Village.of(ThemeType), which resolves
 * the correct VillageFactory via VillageFactoryProvider. This keeps ALL
 * object creation out of client code.
 */
public class Village {

    private final String themeName;
    private final List<VillageObject> objects = new ArrayList<>();

    private Village(VillageFactory factory) {
        this.themeName = factory.getThemeName();
        objects.add(factory.createHouse());
        objects.add(factory.createTree());
        objects.add(factory.createWaterSource());
    }

    /** The only entry point client code uses to obtain a Village. */
    public static Village of(ThemeType theme) {
        VillageFactory factory = VillageFactoryProvider.getFactory(theme);
        return new Village(factory);
    }

    public void build() {
        System.out.println("\n=== Building " + themeName + " Village ===");
        for (VillageObject obj : objects) {
            obj.draw();
        }
    }
}
