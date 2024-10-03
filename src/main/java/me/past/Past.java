package me.past;

import me.past.api.cape.CapesManager;
import me.past.api.module.ModuleManager;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static me.past.api.util.client.Util.mc;

public class Past implements ModInitializer, ClientModInitializer {
    public static final String NAME = "Past Utility Mod";
    public static final String MOD_ID = "past";
    public static final String VERSION = "1.6";
    public static final String APP_ID = "754509326902886411";
    public static String NAME_VERSION = NAME + " " + VERSION;

    public static final Logger LOGGER = LogManager.getLogger(NAME_VERSION);
/*
    public static CustomFontRenderer latoFont;
    public static CustomFontRenderer verdanaFont;
    public static CustomFontRenderer arialFont;
*/
    /*
    public static EventBus EVENT_BUS;
    public static ForgeEvents forgeEvents;
    public static SettingsManager settingsManager;

     */
    public static ModuleManager moduleManager;
    /*
    public static CommandManager commandManager;
    public static FriendsManager friendsManager;
    */
    public static CapesManager capesManager;
    /*
    public static HudComponentManager hudComponentManager;
    public static ClickGUIOne clickGUIOne;
    public static ClickGUITwo clickGUITwo;
    public static HudEditor hudEditor;
    public static ConfigUtil configUtil;

 */


    @Override
    public void onInitialize() {
        log("Starting Client Initialization!");

        mc.getWindow().setTitle(NAME_VERSION);
/*
        EVENT_BUS = new EventManager();
        log("Event System Initialized!");

        forgeEvents = new ForgeEvents();
        log("Forge Events Initialized!");

        settingsManager = new SettingsManager();
        log("Settings initialized!");

 */

        moduleManager = new ModuleManager();
        log("Modules Initialized!");
        /*
        commandManager = new CommandManager();
        log("Commands Initialized!");

        friendsManager = new FriendsManager();
        log("Friends Initialized!");

        latoFont = new CustomFontRenderer(new Font("Lato", 0, 18), true, false);
        verdanaFont = new CustomFontRenderer(new Font("Verdana", 0, 18), true, false);
        arialFont = new CustomFontRenderer(new Font("Arial", 0, 18), true, false);
        log("Custom Fonts Initialized! (Author 086)!");
*/
        capesManager = new CapesManager();
        log("Capes Initialized!");
/*
        hudComponentManager = new HudComponentManager();
        log("HUD Components Initialized!");

        clickGUIOne = new ClickGUIOne();
        log("ClickGUI One Initialized!");

        clickGUITwo = new ClickGUITwo();
        log("ClickGUI Two Initialized!");

        hudEditor = new HudEditor();
        log("HUD Editor Initialized!");

        configUtil = new ConfigUtil();
        log("Config Initialized!");
 */
        log("Client has finished initializing!");
    }
    @Override
    public void onInitializeClient() {

    }
    public static void log(String message) {
        LOGGER.info(message);
    }
}
