package framework.utils;

public class FrameworkException extends RuntimeException {

	String ErrorName = "ERROR !!";


/**
 * Constructor to initialize the exception from the framework
 * @param errorDescription The Exception message to be thrown
 */
public FrameworkException(String errorDescription) {
	super(errorDescription);
}

/**
 * Constructor to initialize the exception from the framework
 * @param errorName The step name for the error
 * @param errorDescription The Exception message to be thrown
 */
public FrameworkException(String errorName, String errorDescription) {
	super(errorDescription);
	this.ErrorName = errorName;
}

/**
 * @return the errorName
 */
public String getErrorName() {
	return ErrorName;
}

/**
 * @param errorName the errorName to set
 */
public void setErrorName(String errorName) {
	ErrorName = errorName;
}


}
