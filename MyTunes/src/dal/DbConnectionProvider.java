/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.sun.jdi.connect.spi.Connection;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * The {@code DbConnectionProvider} class is responsible for
 * establishing connection with a database.
 *
 * @author chris
 */
public class DbConnectionProvider {
    
    private static final String PROP_FILE = "data/connectionInfo.settings";
    private SQLServerDataSource ds;
    
    /**
     * creates a connection with the database.
     */
    
    public DbConnectionProvider() {
        
        try {
            
            Properties databaseProperties = new Properties();
            databaseProperties.load(new FileInputStream(PROP_FILE));
            ds = new SQLServerDataSource();
            ds.setServerName(databaseProperties.getProperty("10.176.111.31"));
            ds.setDatabaseName(databaseProperties.getProperty("ProjectMyTunesDB"));
            ds.setUser(databaseProperties.getProperty("CSe19B_17"));
            ds.setPassword(databaseProperties.getProperty("CSe19B_17"));
        }
        catch(IOException e) {
            
            // To Do
        }
    }
    
    /**
     * Returns Connection object which is able to
     * provide informations about database.
     * 
     * @return The Connection with database.
     * @throws SQLServerException if connection with database cannot be established.
     */
    
    public Connection getConnection() throws SQLServerException {
        
        return (Connection) ds.getConnection();
    }
}
