package me.past.api.cape;

import me.past.Past;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author Hoosiers
 */

public class CapesManager {
    public List<UUID> uuidList = new ArrayList<>();

    public CapesManager() {
        try {
            URL capesPaste = new URL("https://pastebin.com/raw/gS9rx92r");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(capesPaste.openStream()));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                uuidList.add(UUID.fromString(line));
            }
        } catch (Exception e) {
            Past.log("Cape reading from URL failed! Do you an internet connection?");
        }
    }

    public boolean hasCape(UUID uuid) {
        return uuidList.contains(uuid);
    }
}