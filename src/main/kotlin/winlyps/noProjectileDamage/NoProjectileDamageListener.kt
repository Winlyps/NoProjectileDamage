package winlyps.noProjectileDamage

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityDamageByEntityEvent
import org.bukkit.entity.Projectile

class NoProjectileDamageListener : Listener {

    @EventHandler
    fun onEntityDamageByEntity(event: EntityDamageByEntityEvent) {
        // Check if the damager is a projectile
        if (event.damager is Projectile) {
            // Cancel the event to prevent damage
            event.isCancelled = true
        }
    }
}