## Dmitrik Notebook – simple Fabric mod

**Dmitrik Notebook** is a very small but handy Minecraft mod for **Fabric 1.20.1**.  
It adds a single decorative block – a **notebook** – with a custom model and texture, created from scratch.

- **Mod loader**: Fabric
- **Minecraft**: 1.20.1
- **Java**: 17+
- **Mod ID**: `dmitrik.notebook`

The mod was made as a **first complete modding project**:  
own models, textures, block/item registration and even setting up GitHub and Gradle.

---

## Features

- **New decorative block**: `notebook`
  - custom block model and item model
  - custom texture
  - appears in the **Building Blocks** creative tab

Technical details (for other developers):
- main entrypoint: `com.dmitrik.notebook.DmitrikNotebookMod`
- block & item registered under id `dmitrik.notebook:notebook`

---

## Download

You can get the built mod JAR from the repository:

- `build/libs/dmitrik-notebook-0.0.1.jar` – main mod file
- `build/libs/dmitrik-notebook-0.0.1-sources.jar` – sources (optional)

Later this jar can also be attached to GitHub Releases (for example, to tag `v0.1`).

---

## Installation (Fabric)

1. Install **Fabric Loader** for Minecraft **1.20.1**.
2. Install **Fabric API** (put its jar into `mods` as well).
3. Download `dmitrik-notebook-0.0.1.jar`.
4. Put the jar into your Minecraft `mods` folder:
   - Windows: `%APPDATA%\.minecraft\mods`
5. Launch Minecraft with the Fabric 1.20.1 profile.

The notebook block should appear in the **Building Blocks** tab in creative.

---

## Building from source

Requirements:
- Java 17+
- Gradle wrapper (already included in the project)

Commands (from the project root):

```bash
./gradlew build
```

On Windows (PowerShell or cmd):

```powershell
gradlew build
```

After a successful build you will find:
- the mod jar in `build/libs/`
- sources jar in `build/libs/`

---

## Project structure (short)

- `src/main/java/com/dmitrik/notebook/DmitrikNotebookMod.java` – main mod class
- `src/main/resources/fabric.mod.json` – mod metadata (id, name, dependencies)
- `src/main/resources/assets/dmitrik.notebook/` – models, blockstates, textures, icon
- `build.gradle`, `gradle.properties` – Gradle & Fabric Loom configuration

---

## Немного по‑русски

Это **первый мод автора**, сделанный полностью с нуля:
- настроен Gradle‑проект под Fabric;
- написан простой Java‑код мода;
- сделаны **свои модели и текстуры** блоков;
- создан и настроен репозиторий на GitHub;
- настроена сборка мода и добавлен собранный `.jar`.

Если вы нашли этот репозиторий и у вас есть советы по улучшению (код, структура, Gradle, ресурсы) — pull‑request'ы и issue приветствуются 🙂

