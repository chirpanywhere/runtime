package com.ca.communication.sender;

import com.ca.framework.errorhandling.CAException;
import com.ca.utils.data.IValueObject;

public interface ISender{
	
	IValueObject execute(IValueObject vo)  throws CAException;

}
