/**
 * 
 */
package com.biotech.inudstries.web.services.util;

import org.joda.time.DateTime;

/**
 * Created: Apr 21, 2014
 * 
 * @author Brian Holman
 *
 */
public interface IDateTimeFactory {
	DateTime create(long instant);

	DateTime create(Object instant);
}
