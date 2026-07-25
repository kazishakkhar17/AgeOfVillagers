package aov.factories.modern;

import aov.factories.VillageFactory;
import aov.builders.VillageObjectDirector;
import aov.builders.modern.*;
import aov.villageobjects.VillageObject;
/**
 * Produces the Modern family: Brick House, Mango Tree, Swimming Pool.
 * Internally uses Builder + Director to actually assemble each object
 * from simple shapes.
 */
public class ModernVillageFactory implements VillageFactory {

    @Override
    public VillageObject createHouse() {
        VillageObjectDirector director = new VillageObjectDirector(new BrickHouseBuilder());
        return director.construct();
    }

    @Override
    public VillageObject createTree() {
        VillageObjectDirector director = new VillageObjectDirector(new MangoTreeBuilder());
        return director.construct();
    }

    @Override
    public VillageObject createWaterSource() {
        VillageObjectDirector director = new VillageObjectDirector(new SwimmingPoolBuilder());
        return director.construct();
    }

    @Override
    public String getThemeName() {
        return "Modern";
    }
}
