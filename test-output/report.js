$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/color.feature");
formatter.feature({
  "line": 2,
  "name": "I am on techfios site to change the color of page background",
  "description": "",
  "id": "i-am-on-techfios-site-to-change-the-color-of-page-background",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Blue"
    }
  ]
});
formatter.before({
  "duration": 11501223300,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Sky Blue Background",
  "description": "",
  "id": "i-am-on-techfios-site-to-change-the-color-of-page-background;sky-blue-background",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I see Set SkyBlue Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on the button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_color.i_see_Set_SkyBlue_Background_button_exists()"
});
formatter.result({
  "duration": 149876300,
  "status": "passed"
});
formatter.match({
  "location": "Test_color.i_click_on_the_button()"
});
formatter.result({
  "duration": 2134824200,
  "status": "passed"
});
formatter.match({
  "location": "Test_color.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 112600,
  "status": "passed"
});
});