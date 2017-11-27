# Teleport2Lobby Plugin
[![Bungee Cord 1.12.2](https://img.shields.io/badge/BungeeCord-1.12.2-brightgreen.svg)](https://www.spigotmc.org/wiki/bungeecord/)
[![Build Status](https://travis-ci.org/frklan/Teleport2Lobby.svg?branch=master)](https://travis-ci.org/frklan/Teleport2Lobby) 
[![GitHub release](https://img.shields.io/github/release/frklan/Teleport2Lobby.svg)](https://github.com/frklan/Teleport2Lobby/releases)
[![contributions welcome](https://img.shields.io/badge/contributions-welcome-brightgreen.svg?style=flat)](https://github.com/frklan/Teleport2Lobby/issues) 
[![License](http://img.shields.io/:license-mit-blue.svg?style=flat-square)](https://github.com/frklan/Teleport2Lobby/blob/master/LICENSE)

Ever wished your Bungee Cord server came with a ```/lobby``` command that send the player back to a lobby? Well here's a minimal plugin that does just that.

## Compiling the source

### Prerequisites

* Java 8 SDK
* Apached Maven
* Eclipse Oxygen (not required, but helpfull if you whish to edit the source)

### Compiling

To compile issue the following commands

````
$ git clone git@github.com:frklan/Teleport2Lobby.git
$ cd Teleport2Lobby
$ mvn package
````
Copy the jar file from ```target``` to your bungee proxy server's plugin folder (N.B. the plugin will NOT work if installed on a SpigotMC server)

## Running

### Prerequisites

* Bungee Coord proxy, see install guide [here](https://www.spigotmc.org/wiki/bungeecord-installation/)
* Two or more [SpigotMC](https://www.spigotmc.org/wiki/spigot/) servers

### Installing

Copy the jar file to your Bungee server's plugin folder and restart the server.

A default config file will be created in ```plugins/Teleport2Lobby``` the first time the plugin is run. The ```lobby-server``` should be set to the server acting as the lobby.

### Permissions

Players need ```teleport2lobby.lobby``` permission to be able to use the ```/lobby``` command.

## Plugin Stats

The plugin is using the [bStat](https://github.com/BtoBastian/bStats-Metrics) metric classes by [Bastian Oppermann](https://github.com/BtoBastian) to gather a bunch of usage statistics. See this [link](https://bstats.org/plugin/bungeecord/Teleport2Lobby) for current up to date data.

## Contributing

Contributions are always welcome!

When contributing to this repository, please first discuss the change you wish to make via the issue tracker, email, or any other method with the owner of this repository before making a change.

Please note that we have a code of conduct, you are required to follow it in all your interactions with the project.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/frklan/Teleport2Lobby/tags).

## Authors

* **Fredrik Andersson** - *Initial work* - [frklan](https://github.com/frklan)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details

## Acknowledgments

* The creators of BungeeCord and SpigotMC
* Plugin structure from [AdvancedBungeeAnnouncer](https://github.com/minecrafter/AdvancedBungeeAnnouncer)
* README based on [PurpleBooth's](https://github.com/PurpleBooth) template
* [bStat](https://github.com/BtoBastian/bStats-Metrics) by [Bastian Oppermann](https://github.com/BtoBastian)




[![HitCount](http://hits.dwyl.io/frklan/Teleport2Lobby.svg)]()
