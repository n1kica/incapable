# Incapable Mod

Revamps block-breaking mechanic by enforcing proper tool use.

## Mechanic
Blocks such as logs, stone, and ores require the correct tool. Materials like grass, sand, and dirt can still be broken by hand.

## Damage
Attempting to break restricted blocks without a tool inflicts minor damage.

## Config
Works out of the box with no extra setup, but can be configured:
```toml
[damage]
	# Amount of damage taken when unequipped
	# Default: 1.0
	# Range: 0.0 ~ 20.0
	damage_player = 1.0
```

## Future
Planned expansions will build on this system.
