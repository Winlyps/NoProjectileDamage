package winlyps.noProjectileDamage

import org.bukkit.plugin.java.JavaPlugin

class NoProjectileDamage : JavaPlugin() {

    override fun onEnable() {
        // Register the event listener
        server.pluginManager.registerEvents(NoProjectileDamageListener(), this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}