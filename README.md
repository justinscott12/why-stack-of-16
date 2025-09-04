# Why Stack of 16?

Minecraft Fabric mod that makes items that stack to 16 now stack to 64

## Features

- Makes all items that normally stack to 16 now stack to 64
- Compatible with Minecraft 1.21.8
- Affects items like: snowballs, ender pearls, eggs, honey bottles, potions, signs, and more!

![example.png](src/main/resources/assets/why-stack-of-16/example.png)

## Download
- If you just want the mod itself and you don't care about the source code, just download the jar file for the corresponding Minecraft version from the releases folder

## Installation

1. Install [Fabric Loader](https://fabricmc.net/use/installer/)
2. Install [Fabric API](https://www.curseforge.com/minecraft/mc-mods/fabric-api)
3. Download the latest release of this mod
4. Place the mod file in your `mods` folder

## Building

To build the mod yourself:

1. Clone this repository
2. Run `./gradlew build`
3. The built mod will be in `build/libs/`

## Testing

### Development Testing

1. Run the mod in development environment:
   ```bash
   ./gradlew runClient
   ```

      **Note**: If you encounter mixin errors during startup, check that:
      - All package names in your mixin configuration files match your actual package structure
      - Mixin classes exist in the specified locations
      - The mod ID in `fabric.mod.json` matches your mixin configuration


## Usage

Simply install the mod and all items that normally stack to 16 will automatically stack to 64 instead. This includes:

- Snowballs
- Ender Pearls
- Eggs
- Honey Bottles
- Potions and Splash Potions
- Lingering Potions
- And many more!

No configuration needed - it works automatically when installed.

## Compatibility

- Minecraft: 1.21.8
- Fabric Loader: 0.16.13+
- Fabric API: 0.132.0+1.21.8

## License

This mod is licensed under the MIT License. See [LICENSE](LICENSE) for details.
