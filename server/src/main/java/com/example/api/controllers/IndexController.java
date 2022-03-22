// クラスやインターフェイスをグループ化する
package com.example.api.controllers;

// クラスを使用できるようにする
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
  // @requestMapping：クライアントからのリクエストに対してメソッドやハンドラをマッピング
  @RequestMapping({ "/", "/index" })
  // ModelAndView: テンプレートで利用するデータと、Viewに関する情報を管理する。戻り値として使用する
  public ModelAndView get(ModelAndView mav) {
    // addObjectで変数に値を挿入
    mav.addObject("target", "Thymeleaf");
    // テンプレート名を設定
    mav.setViewName("index");
    return mav;
  }
}
