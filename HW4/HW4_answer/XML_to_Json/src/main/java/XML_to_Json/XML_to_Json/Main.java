package XML_to_Json.XML_to_Json;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.json.JSONObject;
import org.json.XML;

public class Main {
	private static final int PRETTY_PRINT_INDENT_FACTOR = 4;
	public static void main(String[] args) throws Exception {
		String xmlString = FileUtils.readFileToString(new File(args[0]));
		JSONObject jsonObject = XML.toJSONObject(xmlString);
		String jsonPrettyPrintString = jsonObject.toString(PRETTY_PRINT_INDENT_FACTOR);
		System.out.println(jsonPrettyPrintString);
	}
}
