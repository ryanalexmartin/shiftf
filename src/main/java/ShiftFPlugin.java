import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class ShiftFPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig(); // This saves the default config.yml from your resources to the plugin directory if it doesn't exist
        getServer().getPluginManager().registerEvents(new ShiftFListener(this), this); // Pass the plugin instance to your listener
    }

    public String getSwapCommand() {
        return getConfig().getString("swapCommand");
    }
}