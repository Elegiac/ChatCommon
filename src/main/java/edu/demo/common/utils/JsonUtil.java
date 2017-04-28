package edu.demo.common.utils;

import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import edu.demo.common.entity.action.Login;

public class JsonUtil {
	public static String objectToJson(Object jsonObj) {
		Gson gson = new Gson();
		return gson.toJson(jsonObj);
	}

	public static <T> T jsonToObject(String json, Class<T> requiredClass) {
		Gson gson = new Gson();
		return gson.fromJson(json, requiredClass);
	}

	public static Map<String, Object> jsonToMap(String json) {
		Gson gson = new Gson();
		return gson.fromJson(json, new TypeToken<Map<String, Object>>() {
		}.getType());
	}

	public static void main(String[] args) {
		Login login = new Login("123", "456");
		String result = JsonUtil.objectToJson(login);
		System.out.println(result);

		System.out.println(JsonUtil.jsonToObject(result, Login.class));
		System.out.println(JsonUtil.jsonToMap(result));
	}
}
