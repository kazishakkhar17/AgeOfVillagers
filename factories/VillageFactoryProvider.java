package aov.factories;

import aov.factories.modern.ModernVillageFactory;
import aov.factories.traditional.TraditionalVillageFactory;
import aov.factories.desert.DesertVillageFactory;
import java.util.HashMap;
import java.util.Map;
/**
 * Registry that owns every "new XxxVillageFactory()" call in the whole
 * program. The client never instantiates a factory itself — it just asks
 * for a theme, and this class hands back the right VillageFactory.
 *
 * To add a new theme (e.g. Desert), we added ONE line to the static block
 * and register a ThemeType — no existing method or class is modified.
 */
public final class VillageFactoryProvider {

    private static final Map<ThemeType, VillageFactory> REGISTRY = new HashMap<>();

    static {
        REGISTRY.put(ThemeType.MODERN, new ModernVillageFactory());
        REGISTRY.put(ThemeType.TRADITIONAL, new TraditionalVillageFactory());
        REGISTRY.put(ThemeType.DESERT, new DesertVillageFactory());

    }

    private VillageFactoryProvider() {
        // utility class, not instantiable
    }

    public static VillageFactory getFactory(ThemeType theme) {
        VillageFactory factory = REGISTRY.get(theme);
        if (factory == null) {
            throw new IllegalArgumentException("No factory registered for theme: " + theme);
        }
        return factory;
    }
}
