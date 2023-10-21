import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;

public class ShiftFListener implements Listener {
    private final ShiftFPlugin plugin;

    public ShiftFListener(ShiftFPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onSwapHandItems(PlayerSwapHandItemsEvent event) {
        if (event.getPlayer().isSneaking()) {
            String command = plugin.getSwapCommand();
            event.getPlayer().performCommand(command);
        }
    }
}
