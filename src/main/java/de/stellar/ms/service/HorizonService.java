package de.stellar.ms.service;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.offbytwo.jenkins.JenkinsServer;
import com.offbytwo.jenkins.model.Job;
import com.offbytwo.jenkins.model.JobWithDetails;

@Service
public class HorizonService {
	
	  private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(HorizonService.class);

	@Value("${jenkins.username}")
	String username;
	
	@Value("${jenkins.password}")
	String password;
	
	@Value("${jenkins.server-url}")
	String url;
	
	
}
