package com.roldukhin.ui.automation.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GooglePage {
  public void searchFor(String text) {
    $(By.name("q")).val(text).pressEnter();
  }
}
