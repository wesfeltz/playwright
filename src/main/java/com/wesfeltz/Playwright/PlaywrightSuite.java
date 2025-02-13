package com.wesfeltz.Playwright;

import com.microsoft.playwright.*;

public class PlaywrightSuite {
    public static void main(String[] args) {
    	try (Playwright play = Playwright.create()) {
    		Browser browser = play.chromium().launch();
    		Page page = browser.newPage();
    		page.navigate("http://playwright.dev");
    		System.out.println("Page Title: " + page.title());
    		page.close();
    		browser.close();
    	}
    }
}
