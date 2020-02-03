# ui-test-automation
Example of UI Automation Test Project

- Java 11
- [Selenide](https://github.com/selenide/selenide) 
as a Selenium based framework
- [Zalenium](https://github.com/zalando/zalenium)
as a Selenum Grid server
- [TestNG](https://github.com/cbeust/testng)
as a test framework
- Maven
as a build tool
- [Allure Framework](https://github.com/allure-framework/allure2)
as a report tool
- [TypeSafe Config](https://lightbend.github.io/config/)
as a configuration tool

## Local run

- mvn clean test
- mvn allure:serve

## Remote run 

- mvn clean test -Dselenide.remote=https://ZALENIUM_URL/wd/hub

where ZALENIUM_URL - is the host with Zalenium
- Go to https://ZALENIUM_URL/dashboard/# and see the video with logs 
