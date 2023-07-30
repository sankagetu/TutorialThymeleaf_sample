package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    @GetMapping("/form")
    public String getForm(Model model) {
        // 文字列をModelに登録
        model.addAttribute("msg", "値を入力してください。");
        // formに画面遷移
        return "form";
    }

    @PostMapping("/form")
    public String postForm(@RequestParam("val") String val, Model model) {
        model.addAttribute("msg", "入力された値は「" + val + "」です。");
        model.addAttribute("val", val);
        return "form";
    }
}