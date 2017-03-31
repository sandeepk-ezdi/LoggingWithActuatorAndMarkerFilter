/**
 * 
 */
package com.ezdi.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ezdi.service.TestService;


/**
 * @author EZDI\sandeep.k On 08-Mar-2017
 *
 */

@RestController
public class TestController {
	/*private static final Logger LOG = LoggerFactory.getLogger(TestController.class);
*/
	private static Logger LOG = LogManager.getLogger(TestController.class);
	private static final Marker FATAL = MarkerManager.getMarker("FATAL");
	@Autowired
	TestService service;

	@RequestMapping(method=RequestMethod.GET, path="/test", produces="application/json")
	public String sayHello() throws Exception{
		
		LOG.info("INFO---Inside---TestController-----sayHello()");
		LOG.error("ERROR---Inside---TestController-----sayHello()");
		LOG.error(FATAL,"@Controller---This is Serious kind of error need to take Action");
		LOG.warn("WARN---Inside---TestController-----sayHello()");
		 
		
		
		String response=service.sayHeelo();

		LOG.info("INFO---Exit from---TestController-----sayHello()");
		LOG.error("ERROR---Exit from---TestController-----sayHello()");
		LOG.warn("WARN---Exit from---TestController-----sayHello()");
		return response;
	}
	
	
}
