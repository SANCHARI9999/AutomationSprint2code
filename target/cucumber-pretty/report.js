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
  "name": "Verify whether the user can use trash functionality in posts section to retrieve the deleted posts",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@trash_functionality_in_posts_section"
    }
  ]
});
formatter.step({
  "name": "User clicks on trash option",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.user_clicks_on_trash_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects multiple checkboxes of trash posts items",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.user_selects_multiple_checkboxes_of_trash_posts_items()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on bulk actions of trash functionality",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_clicks_on_bulk_actions_of_trash_functionality()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects restore option in bulk functionality\"\u003crestore\u003e\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.user_selects_restore_option_in_bulk_functionality(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on apply button in trash section",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_clicks_on_apply_button_in_trash_section()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});