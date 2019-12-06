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
public class DbConnectionProvider
{

    
    private SQLServerDataSource ds;
    
    public DbConnectionProvider() throws IOException
    {
        
        ds = new SQLServerDataSource();
        ds.setServerName("10.176.111.31");
        ds.setDatabaseName("ProjectMyTunesDB");
        ds.setUser("CSe19B_17");
        ds.setPassword("CSe19B_17");
    }
    
    public java.sql.Connection getConnection() throws SQLServerException
    {
        return ds.getConnection();
    }
    
}

