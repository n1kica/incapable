# Incapable Mod

Revamps block-breaking by enforcing proper tool use.

## Core Mechanic
- Certain blocks (logs, stone, ores) **require the correct tool**.
- Soft materials (grass, sand, dirt) remain **breakable by hand**.

## Penalty
- Breaking restricted blocks without a tool **inflicts minor damage** to the player.

## Configuration
Works out of the box. Optional tuning via config:
```toml
[damage]
	# Amount of damage taken when unequipped
	# Default: 1.0
	# Range: 0.0 ~ 20.0
	damage_player = 1.0
```

## Roadmap
Future updates will expand the system and add new interactions.
