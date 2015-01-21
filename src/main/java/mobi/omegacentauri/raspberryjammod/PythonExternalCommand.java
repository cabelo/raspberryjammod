package mobi.omegacentauri.raspberryjammod;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.BlockPos;

public class PythonExternalCommand extends ScriptExternalCommand {

	@Override
	public String getName() {
		return "python";
	}

	@Override
	public List getAliases() {
		List<String> aliases = new ArrayList<String>();
		aliases.add(getName());
		aliases.add("py");
		return aliases;
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "python script [arguments]: run script (omit script to stop previous script)";
	}

	@Override
	public boolean canCommandSenderUse(ICommandSender sender) {
		return true;
	}

	@Override
	public List addTabCompletionOptions(ICommandSender sender, String[] args,
			BlockPos pos) {
		return null;
	}

	@Override
	public boolean isUsernameIndex(String[] args, int index) {
		return false;
	}

	@Override
	public int compareTo(Object o) {
		return 0;
	}

	@Override
	protected String getScriptProcessorBase() {
		return "python";
	}

	@Override
	protected String[] getExtensions() {
		return new String[] { ".py", ".python" };
	}

	@Override
	protected String[] getScriptPaths() {
		return new String[] { "mcpipy/" , "mcpimods/python/"};
	}
}
