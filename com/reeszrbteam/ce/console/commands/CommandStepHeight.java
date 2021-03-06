package com.reeszrbteam.ce.console.commands;

import com.kodehawa.ce.module.classes.Step;
import com.kodehawa.ce.module.handlers.ModuleManager;
import com.kodehawa.ce.util.Utils;
import com.reeszrbteam.ce.console.BaseCommand;

public class CommandStepHeight extends BaseCommand {

	public CommandStepHeight( ) {
		super("stepHeight", "Kodehawa", "1.6.2");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void runCommand(String s, String[] args) {
		// TODO Auto-generated method stub
		try{
			float result = Float.parseFloat(args[0]);
			if(result <= 100.0F){
			Step.setStepHeight(result);
			Utils.getInstance().addChatMessage("Step height changed to " + result + "!");
			/* If module is on, off and on it, else
			 * If module is off on and off it c: */
			ModuleManager.getInstance().getModuleByClass(Step.class).toggleModule();
			ModuleManager.getInstance().getModuleByClass(Step.class).toggleModule();
			}
			}
			
			catch (Exception e)
	        {
			  Utils.getInstance().addChatMessage("Usage: " + getSyntax());
	          e.printStackTrace();
	        }
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Modify the step height of blocks";
	}

	@Override
	public String getSyntax() {
		// TODO Auto-generated method stub
		return "stepHeight <float>";
	}

}
