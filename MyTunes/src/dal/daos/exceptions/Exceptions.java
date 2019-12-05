/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal.daos.exceptions;

/**
 *
 * @author chris
 */
public class Exceptions extends Exception
{

    public Exceptions()
    {
        super();
    }

    public Exceptions(String message)
    {
        super(message);
    }

    public Exceptions(String message, Throwable cause)
    {
        super(message, cause);
    }

    public Exceptions(String message, Exception ex)
    {
        super(message, ex);
    }

}
