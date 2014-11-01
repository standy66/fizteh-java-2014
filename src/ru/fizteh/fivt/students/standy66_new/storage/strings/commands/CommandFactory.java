package ru.fizteh.fivt.students.standy66_new.storage.strings.commands;

import ru.fizteh.fivt.storage.strings.TableProvider;
import ru.fizteh.fivt.students.standy66_new.commands.Command;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by astepanov on 20.10.14.
 */
public class CommandFactory {
    private Context context;

    public CommandFactory(TableProvider provider) throws NullPointerException {
        if (provider == null) {
            throw new NullPointerException("database must not be null");
        }
        this.context = new Context(provider);
    }

    public PutCommand putCommand() {
        return new PutCommand(context);
    }

    public CreateCommand createCommand() {
        return new CreateCommand(context);
    }

    public DropCommand dropCommand() {
        return new DropCommand(context);
    }

    public GetCommand getCommand() {
        return new GetCommand(context);
    }

    public ListCommand listCommand() {
        return new ListCommand(context);
    }

    public RemoveCommand removeCommand() {
        return new RemoveCommand(context);
    }

    public ShowTablesCommand showTablesCommand() {
        return new ShowTablesCommand(context);
    }

    public UseCommand useCommand() {
        return new UseCommand(context);
    }

    public SizeCommand sizeCommand() {
        return new SizeCommand(context);
    }

    public CommitCommand commitCommand() {
        return new CommitCommand(context);
    }

    public RollbackCommand rollbackCommand() {
        return new RollbackCommand(context);
    }

    public Map<String, Command> getCommandsMap(String locale) {
        Map<String, Command> map = new HashMap<>();
        map.put("put", putCommand());
        map.put("get", getCommand());
        map.put("list", listCommand());
        map.put("remove", removeCommand());
        map.put("show", showTablesCommand());
        map.put("create", createCommand());
        map.put("drop", dropCommand());
        map.put("use", useCommand());
        map.put("size", sizeCommand());
        map.put("commit", commitCommand());
        map.put("rollback", rollbackCommand());
        return map;
    }

}