package com.sonbear.model.services.exceptions;

/**
 *
 * @author Sonbear
 */
public class ServiceException extends Exception {

    /**
     * Creates a new instance of <code>ServiceException</code> without detail message.
     */
    public ServiceException() {
        this("There was a problem with the service");
    }

    /**
     * Constructs an instance of <code>ServiceException</code> with the specified detail message.
     *
     * @param msg the detail message.
     */
    public ServiceException(String msg) {
        super(msg);
    }
}
