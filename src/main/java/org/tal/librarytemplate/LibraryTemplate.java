/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.tal.librarytemplate;

import org.tal.redstonechips.RedstoneChips;
import org.tal.redstonechips.circuit.CircuitLibrary;

/**
 *
 * @author Tal Eisenberg
 */
public class LibraryTemplate extends CircuitLibrary {
    private RedstoneChips redstoneChips;

    @Override
    public Class[] getCircuitClasses() {
        return new Class[] { test.class };
    }

    @Override
    public void onRedstoneChipsEnable(RedstoneChips instance) {

        // Called by the RedstoneChips plugin just before it starts loading circuit classes from every installed circuit library.
        // This is a good place to add circuit preferences keys and any other library-wide initialization code.

        this.redstoneChips = instance;
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
