# ⚔️ Dungeon Crawler

*A turn-based roguelike written in 100% pure Java — no game engines, no libraries.*

![Java](https://img.shields.io/badge/Java-17+-orange?logo=openjdk)
![Maven](https://img.shields.io/badge/Build-Maven-C71A36?logo=apachemaven)
![License](https://img.shields.io/badge/License-MIT-blue)
![Status](https://img.shields.io/badge/Status-In%20Development-yellow)

---

## 📖 About

**Dungeon Crawler** is a classic turn-based roguelike — explore procedurally generated dungeons, fight monsters, collect loot, and survive as deep as you can.

The entire game is built **from scratch in plain Java**: the game loop, renderer, AI, and everything else. No LibGDX, no game frameworks.

The goal of this project is as much about *education* as it is about *game development* — it is a real, growing codebase that demonstrates core OOP design principles in action.

---

## 🎮 Preview — Console v0.1

> Screenshot / GIF coming with the first release. For now, imagine this:

```text
#############..........##..@....g..##..........##...####...##...#
#...........#..........##.........##..........##...........##...#
#...........#.....................##..........##...........##...#
#############..........#############..........##############...#
```

| Symbol | Meaning |
|---|---|
| `@` | You / Player |
| `g` | Goblin |
| `#` | Wall |

---

## 🗺️ Roadmap

- [ ] Initial project structure
- [ ] Player movement on a grid (console)
- [ ] Turn-based combat with monsters
- [ ] Items & inventory (`Inventory<T extends Item>`)
- [ ] Custom exception hierarchy
- [ ] Save / load (file I/O, try-with-resources)
- [ ] Monster AI with BFS pathfinding
- [ ] Procedural dungeon generation
- [ ] JUnit 5 test coverage
- [ ] Swing GUI
- [ ] v1.0 release 🚀

---

## 🚀 Getting Started

### Prerequisites

- **JDK 17+** — [Adoptium](https://adoptium.net/)
- **Maven 3.8+** — or any IDE with bundled Maven  
  *(IntelliJ IDEA Community works out of the box.)*

Check your Java installation:

```bash
java -version
```

Check your Maven installation:

```bash
mvn -version
```

### Build & Run

Clone the repository:

```bash
git clone https://github.com/YOURUSERNAME/roguelike.git
cd roguelike
```

Compile the project:

```bash
mvn compile
```

Run the game:

```bash
mvn exec:java
```

---

## 🎮 Controls — Planned

| Key | Action |
|---|---|
| `W` | Move up |
| `A` | Move left |
| `S` | Move down |
| `D` | Move right |
| `E` | Pick up item |
| `Enter` | Wait a turn |
| `Q` | Quit to menu |

---

## 🧠 OOP Concepts in Action

This project is deliberately designed so that every major OOP concept has a real job.

| Concept | Where it lives | Status |
|---|---|---|
| **Classes & Objects** | `Player`, `Goblin`, `Grid`, `GameLoop` | 🚧 |
| **Encapsulation** | `Entity.takeDamage()` — health can never go negative | 🚧 |
| **Inheritance** | `Entity` → `Player`, `Monster` → `Goblin`, `Dragon` | 🚧 |
| **Polymorphism** | Game loop iterates `List<Entity>` and calls `update()` | 🚧 |
| **Abstract Classes** | `AbstractEntity`, `AbstractItem` | 🚧 |
| **Interfaces** | `Damageable`, `Lootable`, `Behavior` | 🚧 |
| **Method Overriding** | Every monster's `takeTurn()`, every item's `use()` | 🚧 |
| **Generics** | `Inventory<T extends Item>`, `EventBus<E extends GameEvent>` | 🚧 |
| **Exception Handling** | Custom `GameException` hierarchy, save/load recovery | 🚧 |

---

## 📂 Project Structure

```text
src/
└── main/
    └── java/
        └── io/
            └── github/
                └── YOURUSERNAME/
                    └── roguelike/
                        ├── core/
                        │   ├── GameLoop
                        │   ├── Input
                        │   └── ConsoleRenderer
                        │
                        ├── entities/
                        │   ├── Player
                        │   ├── Monster
                        │   ├── Goblin
                        │   └── Dragon
                        │
                        ├── items/
                        │   ├── Item
                        │   ├── AbstractItem
                        │   └── Inventory
                        │
                        ├── world/
                        │   ├── Grid
                        │   ├── Room
                        │   └── LevelGenerator
                        │
                        ├── ai/
                        │   ├── Behavior
                        │   └── BFSPathfinder
                        │
                        ├── systems/
                        │   ├── Combat
                        │   └── EventBus
                        │
                        ├── persistence/
                        │   ├── SaveManager
                        │   └── LoadManager
                        │
                        └── exceptions/
                            ├── GameException
                            └── ...
```

---

## 🛠️ Tech Stack

- **Java 17** — the entire game, with no game engines
- **Maven** — build and dependency management
- **JUnit 5** — testing
- **Swing** — GUI *(planned)*

---

## 🤝 Contributing

This is a learning project, but ideas, suggestions, and constructive code reviews are very welcome!

Open an [**Issue**](https://github.com/YOURUSERNAME/roguelike/issues) to discuss anything — including:

- 🐛 Bug reports
- 💡 Feature ideas
- 🧠 Design suggestions
- 🔍 Code reviews
- 📚 OOP learning opportunities

---

## 📜 License

Distributed under the **MIT License**.

See [`LICENSE`](LICENSE) for details.

---

## 🙏 Inspired By

*Rogue* (1980), *NetHack*, and *ADOM* — the originals that defined the roguelike genre.

---

<p align="center">
  <i>Built from scratch in Java. One dungeon at a time. ⚔️</i>
</p>