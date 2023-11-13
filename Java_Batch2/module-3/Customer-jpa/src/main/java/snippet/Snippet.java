package snippet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class Snippet {
	// Helper Method for converting a Java Object to JSON String
		private String asJsonString(Object object) throws Exception {
	        ObjectMapper objectMapper = new ObjectMapper();
	        objectMapper.registerModule(new JavaTimeModule());
	        return objectMapper.writeValueAsString(object);
		}	
}

