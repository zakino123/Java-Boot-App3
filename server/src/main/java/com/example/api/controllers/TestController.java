package com.example.api.controllers;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
// RestControllerはAPIサーバを用のコントローラーでjsonやXMLを返す
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
  @RequestMapping(path = "/test", method = RequestMethod.GET)
  public String test() {
    return "ok from test.";
  }

  @RequestMapping(path = "/test/json", method = RequestMethod.GET)
  public Example testJson() {
    var examplePOJO = new Example();
    examplePOJO.value1 = "foo";
    examplePOJO.value2 = "bar";
    return examplePOJO;
  }

  public class Example {
    public String value1;
    public String value2;
    
  }
}
