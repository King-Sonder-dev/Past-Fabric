package me.past.api.module;

import me.past.impl.modules.chat.*;
import me.past.impl.modules.combat.*;
import me.past.impl.modules.core.*;
import me.past.impl.modules.exploit.*;
import me.past.impl.modules.misc.*;
import me.past.impl.modules.movement.*;
import me.past.impl.modules.player.*;
import me.past.impl.modules.render.*;

import java.util.ArrayList;

public class ModuleManager {
    public ArrayList<Module> modules = new ArrayList<>();

    public ModuleManager() {
        /* Chat */

        /* Combat */

        /* Core */

        /* Exploit */

        /* Misc */

        /* Movement */

        /* Player */

        /* Render */
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public Module getModuleByName(String name) {
        return modules.stream().filter(module -> module.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
    }
}