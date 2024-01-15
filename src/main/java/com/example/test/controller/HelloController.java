package com.example.test.controller;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@Tag(name = "예제 API", description = "swagger 테스트용 API")
@RestController
@RequestMapping("/")
public class HelloController {
    @Operation(summary = "문자열 반복", description = "파라미터로 받은 문자열을 2번 반복합니다.")
    @Parameter(name = "str", description = "반복할 문자열")
    @GetMapping("/returnStr/{test}")
    public String returnStr(@RequestParam String str, @PathVariable String test){
        return str + "\n" + str;
    }

    @GetMapping("/example/{member}")
    public String example(@PathVariable String member) {
        return member;
    }

    @GetMapping("/example")
    public String example() {
        return "example";
    }

    @Hidden
    @GetMapping("/ignore")
    public String ignore() {
        return "무시되는 API";
    }
}
