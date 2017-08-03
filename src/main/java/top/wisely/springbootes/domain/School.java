package top.wisely.springbootes.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
public class School {
    private String name;
    private String address;
}
