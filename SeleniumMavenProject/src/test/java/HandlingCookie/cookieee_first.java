package HandlingCookie;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookieee_first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://onlinefeestechnocrats.in/");

		Set<Cookie> cookies = driver.manage().getCookies();

		for (Cookie cookie : cookies) {
		    System.out.println(cookie.getName() + " : " + cookie.getValue());
		}

		
		
		
		int count = driver.manage().getCookies().size();
		System.out.println("Total cookies = " + count);
		
		
		
		
		
		
		Cookie cookie = driver.manage().getCookieNamed("ASP.NET_SessionId");

		System.out.println(cookie.getName());
		System.out.println(cookie.getValue());
		
		
		for (Cookie cookie1 : driver.manage().getCookies()) {

		    System.out.println("Name    : " + cookie1.getName());
		    System.out.println("Value   : " + cookie1.getValue());
		    System.out.println("Domain  : " + cookie1.getDomain());
		    System.out.println("Path    : " + cookie1.getPath());
		    System.out.println("Expiry  : " + cookie1.getExpiry());
		    System.out.println("Secure  : " + cookie1.isSecure());
		    System.out.println("----------------------------");
		}
		
		Cookie cookie1 = driver.manage().getCookieNamed("sessionid");

		if (cookie1 != null) {
		    System.out.println("Cookie exists");
		} else {
		    System.out.println("Cookie not found");
		}
		
		
		if (driver.manage().getCookies().size() > 0) {
		    System.out.println("✅ Cookies are present");
		} else {
		    System.out.println("❌ No cookies found");
		}
		
		
	}

}
