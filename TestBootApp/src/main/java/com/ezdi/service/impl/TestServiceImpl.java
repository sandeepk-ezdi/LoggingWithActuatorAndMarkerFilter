/**
 * 
 */
package com.ezdi.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import org.springframework.stereotype.Service;

import com.ezdi.service.TestService;

/**
 * @author EZDI\sandeep.k On 27-Mar-2017
 *
 */

@Service
public class TestServiceImpl implements TestService {

	/*private static final Logger LOG = LoggerFactory.getLogger(TestController.class);*/
	private static Logger LOG = LogManager.getLogger(TestServiceImpl.class);
	private static final Marker FATAL = MarkerManager.getMarker("FATAL");
	
	@Override
	public String sayHeelo() {
		
		LOG.info("INFO---Inside---TestService-----sayHello()");
		LOG.error("ERROR---Inside---TestService-----sayHello()");
		LOG.error(FATAL,"@Service--This is Serious kind of error need to take Action");
		LOG.warn("WARN---Inside---TestService-----sayHello()");
		LOG.fatal("@Service---WTF!! NullPointerException---This is Serious kind of error need to take Action");
		String response="Hello form Test Service!!!!!!!!";
		
		LOG.info("INFO---Exit from---TestService-----sayHello()");
		LOG.error("ERROR---Exit from---TestService-----sayHello()");
		LOG.warn("WARN---Exit from---TestService-----sayHello()");
		return response;
	}

}
