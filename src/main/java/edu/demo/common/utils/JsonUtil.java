package edu.demo.common.utils;

import com.google.gson.Gson;

import edu.demo.common.entity.Login;

public class JsonUtil {
	public static String objectToJson(Object jsonObj) {
		Gson gson = new Gson();
		return gson.toJson(jsonObj);
	}

	public static <T> T jsonToObject(String json, Class<T> requiredClass) {
		Gson gson = new Gson();
		return gson.fromJson(json, requiredClass);
	}

	public static void main(String[] args) {
		Login login = new Login();
		login.setLoginName("123");
		login.setPassword("456");
		String result = JsonUtil.objectToJson(login);
		System.out.println(result);

		
		System.out.println(JsonUtil.jsonToObject(result, Login.class));
	}
}
