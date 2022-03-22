package com.example.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// Request Mappingは、Spring MVC のコントローラに付与して、リクエスト URL に対して、どのメソッドが処理を実行するか定義するアノテーション。
import org.springframework.web.bind.annotation.RequestMapping;
// RestControllerは、JsonやXML等を返すWebAPI用のコントローラ
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiApplication {

	@RequestMapping("/")
	// Viewに渡したいオブジェクトを設定する。
	// homeメッドには、@RequestMapping アノテーションを付与し、クライアントからのリクエストを処理することを宣言している。
	public String home() {
		return "Hello World";
	}

	// public  :どこからでも参照可能
	// static  :インスタンス可しなくても外部から使用可能
	// void    :戻り値なし
	// String[]:引数をString型の配列で受け取る
	// args    :引数名
	public static void main(String[] args) {
		// SplingApplication.run(App名.class, args):Spring Bootアプリケーションを起動するメソッド
		SpringApplication.run(ApiApplication.class, args);
	}

}
