/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.tal.librarytemplate;

import java.io.File;
import org.bukkit.DyeColor;
import org.bukkit.Server;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginLoader;
import org.tal.redstonechips.CircuitLibrary;

/**
 *
 * @author Tal Eisenberg
 */
public class LibraryTemplate extends CircuitLibrary {

    public LibraryTemplate(PluginLoader pluginLoader, Server instance, PluginDescriptionFile desc, File folder, File plugin, ClassLoader cLoader) {
        super(pluginLoader, instance, desc, folder, plugin, cLoader);

        // Any library-wide initialization code should go here.
    }

    public Class[] getCircuitClasses() {
        return new Class[] { test.class };
    }

    public void onEnable() {
        // Called when the plugin is enabled.
        // No need to write anything to the console. RedstoneChips will list the loaded circuits.
    }

    public void onDisable() {
        // Called when the plugin is disabled.

    }

}
