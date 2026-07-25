package aov.factories;

import aov.villageobjects.VillageObject;

/**
 * ABSTRACT FACTORY PATTERN:
 * Declares creation methods for a FAMILY of related VillageObjects that must
 * stay consistent with one theme. A "Modern" factory only ever produces
 * modern-styled objects; a "Traditional" factory only ever produces
 * traditional-styled objects. Client code depends only on this interface.
 */
public interface VillageFactory {
    VillageObject createHouse();
    VillageObject createTree();
    VillageObject createWaterSource();
    String getThemeName();
}
