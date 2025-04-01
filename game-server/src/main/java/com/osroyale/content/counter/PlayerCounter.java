package com.osroyale.content.counter;

import com.osroyale.game.world.entity.mob.player.Player;


public class PlayerCounter {
    private final Player player;

    public PlayerCounter(Player player) {
        this.player = player;
    }

    public void add(PlayerCount counter) {
        int current = player.playerCounters.computeIfAbsent(counter, a -> 0);
        player.playerCounters.put(counter, current + 1);
        System.out.println(STR."\{player.getName()} counter \{counter.name()}");
    }

    public int get(PlayerCount count) {
        if (!player.playerCounters.containsKey(count)) {
            player.playerCounters.put(count, 0);
        }
        return player.playerCounters.get(count);
    }
}
