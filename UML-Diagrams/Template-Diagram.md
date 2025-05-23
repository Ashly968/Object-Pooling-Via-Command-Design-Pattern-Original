```mermaid

classDiagram
    class Character {
        - ArrayList<Character> characterArrayList
        - CommandManager commandManager
        - String name
        - int x
        - int y
        - int hp
        + Character(String name, int x, int y, int hp)
        + getCharacterArrayList()
        + getCommandManager()
        + getNextMove()
        + getName()
        + getX()
        + getY()
        + setPosition(int x, int y)
        + getHP()
        + setHP(int hp)
        + reset()
    }

    class Player {
        + Player(String name, int x, int y, int hp)
        + trade()
        + harvest()
    }

    class CityGuard {
        + CityGuard(String name, int x, int y, int hp)
        + patrol()
        + chase()
    }

    class Game {
        new Player(Henry, 0, 0, 100)
        new CityGuard(Geoff, 15, 15, 350)
    }

    Character <|-- Player
    Character <|-- CityGuard
    Game --> Character

```
