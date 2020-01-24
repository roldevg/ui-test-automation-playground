package com.roldukhin.ui.automation;


import com.roldukhin.ui.automation.pages.GooglePage;
import com.roldukhin.ui.automation.pages.SearchResultsPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {

  @Test
  public void userCanSearch() {
    open("https://google.com/");

    new GooglePage().searchFor("UI Test Automation projects");
    new SearchResultsPage().getResults().shouldHave(sizeGreaterThan(1));
  }

}
