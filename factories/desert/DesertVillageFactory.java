package aov.factories.desert;

import aov.factories.VillageFactory;
import aov.builders.VillageObjectDirector;
import aov.builders.desert.*;
import aov.villageobjects.VillageObject;
public class DesertVillageFactory implements VillageFactory {

    @Override
    public VillageObject createHouse() {
        VillageObjectDirector director = new VillageObjectDirector(new StoneHouseBuilder());
        return director.construct();
    }

    @Override
    public VillageObject createTree() {
        VillageObjectDirector director = new VillageObjectDirector(new CactusBuilder());
        return director.construct();
    }

    @Override
    public VillageObject createWaterSource() {
        VillageObjectDirector director = new VillageObjectDirector(new OasisBuilder());
        return director.construct();
    }

    @Override
    public String getThemeName() {
        return "Desert";
    }
}