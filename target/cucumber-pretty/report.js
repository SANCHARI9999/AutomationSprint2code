$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/feature/signup.feature");
formatter.feature({
  "name": "Posts feature in RealEstate Application",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Login Functionality",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter username and password",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.user_enter_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is redirected to dashboard",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.user_is_redirected_to_dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to posts section",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.user_navigates_to_posts_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is redirected to Posts section",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_is_redirected_to_Posts_section()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify whether the user can use edit functionality to edit dates",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@edit_functionality_taking_previous_dates"
    }
  ]
});
formatter.step({
  "name": "User clicks on the post\"\u003cgood\u003e\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.user_clicks_on_the_post(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on publish immediately\"\u003cedit\u003e\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.user_clicks_on_publish_immediately(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on date dropdown",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_clicks_on_date_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects 06-June option\"\u003c06-June\u003e\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.user_selects_June_option(Integer,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on publish button in edit functionality to update date",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_clicks_on_publish_button_in_edit_functionality_to_update_date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on update button in edit functionality to update the changes",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_clicks_on_update_button_in_edit_functionality_to_update_the_changes()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});