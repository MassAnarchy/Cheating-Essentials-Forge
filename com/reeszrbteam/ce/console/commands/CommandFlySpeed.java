package com.reeszrbteam.ce.console.commands;

import net.minecraft.client.Minecraft;

import com.kodehawa.ce.util.Utils;
import com.reeszrbteam.ce.console.BaseCommand;

public class CommandFlySpeed extends BaseCommand {

    /**
     * Main constructor. Defines all things that a command needs
     */
    public CommandFlySpeed( ) {
        super("flyspeed", "Kodehawa", "1.6.2");
    }

    @Override
    public void runCommand(String s, String[] args) {
        //To change body of implemented methods use File | Settings | File Templates.}
        try{
        Float result = Float.parseFloat(args[ 0 ]);
        if(result <= 0.7){
            Minecraft.getMinecraft().thePlayer.capabilities.setFlySpeed(result);
            Utils.getInstance().addChatMessage("Fly speed changed to: \"" +result+ " succefully");
        }
        }
            catch(Exception e){
              Utils.getInstance().addChatMessage("Usage: " + getSyntax());
            }
    }


    @Override
    public String getDescription() {
        return "Change the player fly speed when flying";  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getSyntax() {
        return "flyspeed <float> (Only use numbers since 0.05 to 0.7)";  //To change body of implemented methods use File | Settings | File Templates.
    }
}
