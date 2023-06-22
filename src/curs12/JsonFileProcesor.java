package curs12;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class JsonFileProcesor {

	@SuppressWarnings("unchecked")
	public void writeJsonFile() {
		
		JSONObject obj = new JSONObject();
		obj.put("name", "TestUser");
		obj.put("email", "email@testuser.com");
		
		
		try(FileWriter file =  new FileWriter("test.json")){
			
			file.write(obj.toJSONString());
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	

}
