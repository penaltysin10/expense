$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/expense.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "As a user\r\nI can add and view income and expense\r\nso that I know how much money I have",
  "id": "",
  "keyword": "Feature"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "a user with balance is 1000 exists",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 9,
  "name": "Add income amount to balance",
  "description": "",
  "id": ";add-income-amount-to-balance",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "a user add income is 100 to balance",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user with balance is 1100",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user with total income is 100",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "a user with balance is 1000 exists",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 14,
  "name": "Add expense amount less than balance",
  "description": "",
  "id": ";add-expense-amount-less-than-balance",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "a user add expense is 300 from balance",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user with balance is 700",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user with total expense is 300",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "a user with balance is 1000 exists",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 19,
  "name": "Add expense amount more than balance",
  "description": "",
  "id": ";add-expense-amount-more-than-balance",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "a user add over expense is 2000 from balance",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user with balance is 1000",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});