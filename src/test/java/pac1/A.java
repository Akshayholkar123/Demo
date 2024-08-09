package pac1;

import java.util.HashMap;
import static io.restassured.RestAssured.*;

public class A 
{
	public static void main(String[] args) {
		
	System.out.println("git practice");
	System.out.println("git practice 2");
	System.out.println("git practice 3");

	
	/*{
		 "id": "0001",
		 "type": "donut",
		 "name": "Cake",
		 "ppu": 0.55,
		 "batters":
		  {
		   "batter":
		    [
		     { "id": "1001", "type": "Regular" },
		     { "id": "1002", "type": "Chocolate" },
		     { "id": "1003", "type": "Blueberry" },
		     { "id": "1004", "type": "Devil's Food" }
		    ]
		  },
		 "topping":
		  [
		   { "id": "5001", "type": "None" },
		   { "id": "5002", "type": "Glazed" },
		   { "id": "5005", "type": "Sugar" },
		   { "id": "5007", "type": "Powdered Sugar" },
		   { "id": "5006", "type": "Chocolate with Sprinkles" },
		   { "id": "5003", "type": "Chocolate" },
		   { "id": "5004", "type": "Maple" }
		  ]
		}*/
      HashMap<String, String> map = new HashMap();

        //HashMap<Object, String> map = new HashMap();

        // Put a key-value pair into the HashMap
        map.put("id", "0001");

        // Retrieve and print the value associated with the key "id"
        String idd=map.get("id");
        System.out.println(idd);
        }
	}
	
//	String str=response().jsonPath().(data.batter[0]);
//	response().jsonPath().(data.batter[0].type);
//	Assert.assertEquals(str,expected);
//	
	/*
	 * import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DonutHashMapExample {

    public static void main(String[] args) {
        // Your JSON data
        String json = "{ \"id\": \"0001\", \"type\": \"donut\", \"name\": \"Cake\", \"ppu\": 0.55, \"batters\": { \"batter\": [ { \"id\": \"1001\", \"type\": \"Regular\" }, { \"id\": \"1002\", \"type\": \"Chocolate\" }, { \"id\": \"1003\", \"type\": \"Blueberry\" }, { \"id\": \"1004\", \"type\": \"Devil's Food\" } ] }, \"topping\": [ { \"id\": \"5001\", \"type\": \"None\" }, { \"id\": \"5002\", \"type\": \"Glazed\" }, { \"id\": \"5005\", \"type\": \"Sugar\" }, { \"id\": \"5007\", \"type\": \"Powdered Sugar\" }, { \"id\": \"5006\", \"type\": \"Chocolate with Sprinkles\" }, { \"id\": \"5003\", \"type\": \"Chocolate\" }, { \"id\": \"5004\", \"type\": \"Maple\" } ] }";

        // Create an ObjectMapper instance to parse the JSON
        ObjectMapper objectMapper = new ObjectMapper();

        // Create a HashMap to store the extracted data
        Map<String, String> donutMap = new HashMap<>();

        try {
            // Parse the JSON string into a JsonNode
            JsonNode rootNode = objectMapper.readTree(json);

            // Extract and put basic fields into the HashMap
            donutMap.put("id", rootNode.get("id").asText());
            donutMap.put("type", rootNode.get("type").asText());
            donutMap.put("name", rootNode.get("name").asText());
            donutMap.put("ppu", rootNode.get("ppu").asText());

            // Extract batter types and put them into the HashMap
            JsonNode battersNode = rootNode.get("batters").get("batter");
            int batterIndex = 1;
            for (JsonNode batterNode : battersNode) {
                donutMap.put("batter" + batterIndex, batterNode.get("type").asText());
                batterIndex++;
            }

            // Extract topping types and put them into the HashMap
            JsonNode toppingsNode = rootNode.get("topping");
            int toppingIndex = 1;
            for (JsonNode toppingNode : toppingsNode) {
                donutMap.put("topping" + toppingIndex, toppingNode.get("type").asText());
                toppingIndex++;
            }

            // Print the contents of the HashMap
            System.out.println("Donut Details in HashMap:");
            for (Map.Entry<String, String> entry : donutMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

	 
	 */
	
	
	
	
