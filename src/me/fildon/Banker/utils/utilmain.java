package me.fildon.Banker.utils;

import me.fildon.Banker.banker;

public class utilmain {

    private static utilmain instance = new utilmain();

    public static utilmain getInstance() {
        return instance;
    }

    private String prefix = "[BANKER]";









    public void logger(Object object) {
        banker.getInstance().getServer().getConsoleSender().sendMessage(object.toString());
    }






}
