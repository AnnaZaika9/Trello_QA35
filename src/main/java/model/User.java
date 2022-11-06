package model;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
public class User {
    private String email;
    private String password;

}
