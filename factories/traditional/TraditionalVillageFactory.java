package aov.factories.traditional;

import aov.factories.VillageFactory;
import aov.builders.VillageObjectDirector;
import aov.builders.traditional.*;
import aov.villageobjects.VillageObject;
/**
 * Produces the Traditional family: Mud House, Banana Tree, Pond.
 */
public class TraditionalVillageFactory implements VillageFactory {

    @Override
    public VillageObject createHouse() {
        VillageObjectDirector director = new VillageObjectDirector(new MudHouseBuilder());
        return director.construct();
    }

    @Override
    public VillageObject createTree() {
        VillageObjectDirector director = new VillageObjectDirector(new BananaTreeBuilder());
        return director.construct();
    }

    @Override
    public VillageObject createWaterSource() {
        VillageObjectDirector director = new VillageObjectDirector(new PondBuilder());
        return director.construct();
    }

    @Override
    public String getThemeName() {
        return "Traditional";
    }
}
