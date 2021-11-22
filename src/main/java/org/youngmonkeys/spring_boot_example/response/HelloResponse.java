package org.youngmonkeys.spring_boot_example.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class HelloResponse {
    private String message;
}
