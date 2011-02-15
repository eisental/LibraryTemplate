/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.tal.librarytemplate;

import java.io.File;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginLoader;
import org.tal.redstonechips.circuit.CircuitLibrary;

/**
 *
 * @author Tal Eisenberg
 */
public class LibraryTemplate extends CircuitLibrary {

    public LibraryTemplate(PluginLoader pluginLoader, Server instance, PluginDescriptionFile desc, File folder, File plugin, ClassLoader cLoader) {
        super(pluginLoader, instance, desc, folder, plugin, cLoader);
    }

    @Override
    public Class[] getCircuitClasses() {
        return new Class[] { test.class };
    }

    @Override
    public void onEnable() {
        // Called when the circuit library plugin is enabled.
        // No need to write anything to the console. RedstoneChips will list the loaded circuits.
    }

    @Override
    public void onDisable() {
        // Called when the circuit library plugin is disabled.

    }

    @Override
    public void onRedstoneChipsEnable() {

        // Called by the RedstoneChips plugin immediately after finishing loading circuit classes from every installed circuit library.
        // This is a good place to add circuit preferences keys and any other library-wide initialization code.

        // The next line adds a preference key, named "test.msg" with a default value of "TEST!"
        // The preference value can be changed from inside the game by using the /redchips-prefs test.msg <newvalue> command
        // or by directly editing the preferences.yml file.
        redstoneChips.getPrefsManager().registerCircuitPreference(test.class, "msg", "TEST!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

        // Using the usual bukkit java plugin method to handle chat commands
        if (cmd.getName().equalsIgnoreCase("redchips-test")) {
            
            // Find the current value of the preference key we added in onRedstoneChipsEnable().
            String msg = (String)redstoneChips.getPrefsManager().getPrefs().get("test.msg");

            sender.sendMessage(redstoneChips.getPrefsManager().getInfoColor() + msg);
            return true;

        } else
            return false;
    }
}
