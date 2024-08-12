package properties;

import java.util.ResourceBundle;

public class Properties {
	public static String Apk_user_field;
	public static String Apk_pas_field;
	public static String Signin;
	public static String URL;
	public static void pro() {
//	public static void main(String[] args) {
	
		ResourceBundle rb = ResourceBundle.getBundle("FTA");
		Apk_user_field = rb.getString("apk_us_filed");
//		System.out.println(Apk_user_field);
		Apk_pas_field = rb.getString("apk_pas_filed");
		Signin = rb.getString("sign_in");
		URL=rb.getString("url");
	
	}
}
