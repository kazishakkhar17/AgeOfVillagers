# Age of Villagers (AoV) — Village Creation System

## Overview

AoV builds a themed village from a small set of object types — **House**, **Tree**, and **Water Source** — each assembled from simple geometric shapes. Choosing a `ThemeType` (`MODERN`, `TRADITIONAL`, `DESERT`) automatically produces a matched, theme-consistent set of objects (e.g. Modern always yields a Brick House, Mango Tree, and Swimming Pool together — never a mismatched combination).

Client code never instantiates a builder, product, or factory directly. The only call in `Main.java` is:

```java
Village modernVillage = Village.of(ThemeType.MODERN);
modernVillage.build();
```

## Design Patterns Used

| Pattern | Applies to | Purpose |
|---|---|---|
| **Builder** | `VillageObjectBuilder` + `VillageObjectDirector` | Assembles a House/Tree/WaterSource step-by-step (`reset → buildBase → buildMiddle → buildTop`) from simple shapes |
| **Composite** | `VillageObject`, `Village` | Treats a group of shapes, and separately a group of village objects, as a single drawable unit |
| **Abstract Factory** | `VillageFactory` and its theme implementations | Guarantees a matched, theme-consistent family of objects |
| **Registry / Simple Factory** | `VillageFactoryProvider` | Resolves a `ThemeType` to the correct factory with zero `new` calls in client code |

## Project Structure

```
aov/
├── Main.java
├── shapes/
│   ├── Shape.java
│   ├── Rectangle.java
│   ├── Triangle.java
│   ├── Circle.java
│   └── Square.java
├── villageobjects/
│   ├── VillageObject.java
│   ├── House.java
│   ├── Tree.java
│   └── WaterSource.java
├── builders/
│   ├── VillageObjectBuilder.java
│   ├── VillageObjectDirector.java
│   ├── modern/
│   │   ├── BrickHouseBuilder.java
│   │   ├── MangoTreeBuilder.java
│   │   └── SwimmingPoolBuilder.java
│   ├── traditional/
│   │   ├── MudHouseBuilder.java
│   │   ├── BananaTreeBuilder.java
│   │   └── PondBuilder.java
│   └── desert/
│       ├── StoneHouseBuilder.java
│       ├── CactusBuilder.java
│       └── OasisBuilder.java
├── factories/
│   ├── VillageFactory.java
│   ├── ThemeType.java
│   ├── VillageFactoryProvider.java
│   ├── modern/
│   │   └── ModernVillageFactory.java
│   ├── traditional/
│   │   └── TraditionalVillageFactory.java
│   └── desert/
│       └── DesertVillageFactory.java
└── village/
    └── Village.java
```

## How to Run

Requires only a JDK — no external libraries or build tools.

**Windows:**
```
javac aov\shapes\*.java aov\villageobjects\*.java aov\village\*.java ^
aov\Main.java aov\builders\*.java aov\builders\modern\*.java ^
aov\builders\traditional\*.java aov\builders\desert\*.java ^
aov\factories\*.java aov\factories\modern\*.java ^
aov\factories\traditional\*.java aov\factories\desert\*.java

java aov.Main
```

**macOS / Linux:**
```
javac $(find aov -name "*.java")
java aov.Main
```

## Sample Output

```
=== Building Modern Village ===
Brick House is composed of:
 - Rectangle [6.0 x 0.5] made of Brick
 - Rectangle [6.0 x 4.0] made of Brick
 - Triangle [base 6.0, height 2.0] made of Clay Tile
...
```

## Extending with a New Theme

Adding a theme (e.g. Forest) requires only:
1. New builders for the theme's House/Tree/WaterSource
2. One new concrete `VillageFactory`
3. One new `ThemeType` enum constant
4. One `REGISTRY.put(...)` line in `VillageFactoryProvider`

No existing class needs to be modified — `Village.java`, `VillageFactory.java`, and all prior builders/factories stay untouched.