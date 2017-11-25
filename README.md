# Teleport2Lobby Plugin

Ever wished your Bungee Cord server came with a ```/lobby``` command that send the player back to a lobby? Well here's a minimal plugin that does just that.

## Compiling the source

### Prerequisites

* Java 8
* Apached Maven
* Eclipse Oxygen (not required, but helpfull if you whish to edit the source)

### Compiling

To compile issue the following commands

````
$ git clone git@github.com:frklan/Teleport2Lobby.git
$ cd Teleport2Lobby
$ mvn package
````
Copy the jar file from ```target``` to your bungee server's plugin folder.

## Running

### Prerequisites

* Java 8
* Bungee Coord proxy, see install guide [here](https://www.spigotmc.org/wiki/bungeecord-installation/)
* Two or more [SpigotMC servers](https://www.spigotmc.org/wiki/spigot/)

### Installing

Copy the jar file to your Bungee server's plugin folder and restart the server.

A default config file will be created in ```plugins/Teleport2Lobby```

```
#################################################
#                Teleport2Lobby                 #
#################################################

# DO NOT TOUCH THIS
version: '1.0'

# The name of the lobby server. Mus be listed in servers section in BungeeCord's config.yml
lobby-server: 'lobby'
```

The ```lobby-server``` must be present in the server section in your Bungee config.

### Permissions

A player need the ```teleport2lobby.lobby``` permission to be able to use the ```lobby``` command.

## Contributing

Contributions are always welcome!

When contributing to this repository, please first discuss the change you wish to make via issue, email, or any other method with the owner of this repository before making a change.

Please note that we have a code of conduct, you are required to follow it in all your interactions with the project.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/frklan/Teleport2Lobby/tags).

## Authors

* **Fredrik Andersson** - *Initial work* - [frklan](https://github.com/frklan)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* The creators of BungeeCord and SpigotMC
* Plugin structure from [AdvancedBungeeAnnouncer](https://github.com/minecrafter/AdvancedBungeeAnnouncer)
* README based on[PurpleBooth's](https://github.com/PurpleBooth) template
