package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//스프링이 com.cos.blog 하위를 스캔해서 Controller를 메모리에 등록 하여준다.
@RestController
public class BlogControllerTest {

    @GetMapping("/test/hello")
    public String hello() {
        return "<h1>hello Spring boot</h1>";
    }
}
