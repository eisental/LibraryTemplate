/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.tal.librarytemplate;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.tal.redstonechips.RedstoneChips;
import org.tal.redstonechips.circuit.CircuitLibrary;

/**
 *
 * @author Tal Eisenberg
 */
public class LibraryTemplate extends CircuitLibrary {
    CircuitLibrary lib;
    private RedstoneChips redstoneChips;

    @Override
    public Class[] getCircuitClasses() {
        return new Class[] { test.class };
    }

    @Override
    public void onRedstoneChipsEnable(RedstoneChips instance) {

        // Called by the RedstoneChips plugin immediately before it starts loading circuit classes from every installed circuit library.
        // This is a good place to add circuit preferences keys and any other library-wide initialization code.

        // The next line adds a preference key, named "test.msg" with a default value of "TEST!"
        // The preference value can be changed from inside the game by using the /rc-prefs test.msg <newvalue> command
        // or by directly editing the preferences.yml file.
        instance.getPrefsManager().registerCircuitPreference(test.class, "msg", "TEST!");
        this.redstoneChips = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

        // Using the usual bukkit java plugin method to handle chat commands
        if (cmd.getName().equalsIgnoreCase("rc-test")) {
            
            // Find the current value of the preference key we added in onRedstoneChipsEnable().
            String msg = (String)redstoneChips.getPrefsManager().getPrefs().get("test.msg");

            sender.sendMessage(redstoneChips.getPrefsManager().getInfoColor() + msg);
            return true;

        } else
            return false;
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

}
