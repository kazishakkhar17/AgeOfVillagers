package aov.factories;

public enum ThemeType {
    MODERN,
    TRADITIONAL,
    DESERT
    // DESERT, FOREST, ... future themes get added here + registered in
    // VillageFactoryProvider. No existing factory/builder/client code changes.
}
