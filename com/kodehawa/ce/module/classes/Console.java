package com.kodehawa.ce.module.classes;

import org.lwjgl.input.Keyboard;

import com.kodehawa.ce.module.annotations.ModuleTechnical;
import com.kodehawa.ce.module.core.CheatingEssentialsModule;
import com.kodehawa.ce.module.enums.EnumGuiCategory;
import com.reeszrbteam.ce.console.GuiConsole;

@ModuleTechnical
public class Console extends CheatingEssentialsModule {

    private GuiConsole Console;

	public Console(){
		super("Console", "", "1.6.2", Keyboard.KEY_U, EnumGuiCategory.NONE, true);
	     Console = new GuiConsole();
	}
	
	public void onEnableModule(){
		displayGuiScreen(Console);
	}
}
