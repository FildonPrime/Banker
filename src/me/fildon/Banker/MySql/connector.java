package me.fildon.Banker.MySql;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connector {

    private static connector instance;

    public static synchronized connector getInstance() {
        if(instance == null) {
            instance = new connector();
        }
        return instance;
    }

    private Connection connection;
    public String host, database, username,password;
    public int port;



    public void mySqlSetup() {
        /*
        host = //TODO
        port =  //TODO
        database =  //TODO
        username =  //TODO
        password =  //TODO
        */

        try{
            synchronized (this){
                if(getConnection() != null && !getConnection().isClosed()) {
                    return;
                }
                Class.forName("com.mysql.jdbc.Driver");
                setConnection(DriverManager.getConnection("jdbc:mysql://" + this.host + ":" + this.port + "/"
                        + this.database, this.username, this.password));
                Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Plugin MySQL connected");
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }










}
