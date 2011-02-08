/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.tal.librarytemplate;

import org.bukkit.entity.Player;
import org.tal.redstonechips.circuit.Circuit;

/**
 *
 * @author Tal Eisenberg
 */
public class test extends Circuit {

    public void inputChange(int index, boolean state) {
        // This is where you handle changes in input state.
        // The index is the input's pin number and state is true when the input turns high and false when it turns low.

        // sets the lever position of the matching output pin according to the new state.
        sendOutput(index, state);
    }

    protected boolean init(Player player, String[] strings) {
        // This code executes when you right-click on the circuit's sign and again each
        // time the the server is restarted or the RedstoneChips plugin is enabled.

        info(player, "You have activated LibraryTemplate test circuit.");

        return true;
    }

}
