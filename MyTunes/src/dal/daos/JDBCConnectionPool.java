/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal.daos;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import dal.DbConnectionProvider;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author chris
 */
public class JDBCConnectionPool extends ObjectPool<Connection>
{

    private static JDBCConnectionPool INSTANCE;
    private final DbConnectionProvider connectionProvider;

    public synchronized static JDBCConnectionPool getInstance() throws IOException //I make the JDBC Connection Pool a Singleton.
    {
        if(INSTANCE == null)
            INSTANCE = new JDBCConnectionPool();
        return INSTANCE;
    }
    
    private JDBCConnectionPool() throws IOException
    {
        connectionProvider = new DbConnectionProvider(); 
    }

    @Override
    protected Connection create()
    {
        try
        {
            return (Connection) connectionProvider.getConnection();
        } catch (SQLServerException ex)
        {
            ex.printStackTrace(); //Perfect exception handling... (NO!)
            return null;
        }
    }

    @Override
    public boolean validate(Connection o)
    {
        try
        {
            return (!((Connection) o).isClosed());
        } catch (SQLException e)
        {
            e.printStackTrace();
            return (false);
        }
    }

    @Override
    public void expire(Connection o)
    {
        try
        {
            ((Connection) o).close();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

}
