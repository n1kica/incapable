# INCAPABLE MOD

Revamps block-breaking by enforcing proper tool use.

## MECHANIC
Blocks such as logs, stone, and ores require the correct tool. Materials like grass, sand, and dirt can still be broken by hand.

## DAMAGE
Attempting to break restricted blocks without a tool inflicts minor damage.

## CONFIG
Works out of the box with no extra setup.
```toml
[damage]
	# Amount of damage taken when unequipped
	# Default: 1.0
	# Range: 0.0 ~ 20.0
	damage_player = 1.0
```

## FUTURE
Planned expansions will build on this system.
