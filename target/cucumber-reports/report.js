$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/login.feature");
formatter.feature({
  "name": "Login with forum",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Show home screen after login with forum account",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "The login screen is showed",
  "keyword": "Given "
});
formatter.match({
  "location": "stepsDefinition.LoginSteps.the_login_screen_is_showed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The user try to login with \"tester123\" and \"12345Aa@\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepsDefinition.LoginSteps.the_user_try_to_login_with_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The home screen will be showed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepsDefinition.LoginSteps.the_home_screen_will_be_showed()"
});
formatter.result({
  "status": "skipped"
});
});