$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Empoweringindiahome.feature");
formatter.feature({
  "line": 3,
  "name": "HomePage",
  "description": "",
  "id": "homepage",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@home"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "HomePage is Open and accessible",
  "description": "",
  "id": "homepage;homepage-is-open-and-accessible",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user open homepage",
  "keyword": "* "
});
formatter.step({
  "line": 6,
  "name": "verify if home page accessiable",
  "keyword": "* "
});
formatter.match({
  "location": "Homestep.user_open_homepage()"
});
formatter.result({
  "duration": 13813290473,
  "status": "passed"
});
formatter.match({
  "location": "Homestep.verify_if_home_page_accessiable()"
});
formatter.result({
  "duration": 6029918824,
  "status": "passed"
});
});