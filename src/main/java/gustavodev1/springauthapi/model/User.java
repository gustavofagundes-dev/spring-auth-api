package gustavodev1.springauthapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Username cannot be empty")
    @Column(unique = true, nullable = false)
    private String username;

    @NotBlank(message = "Username cannot be empty")
    @Column(unique = true, nullable = false)
    private String email;

    @NotBlank(message = "Username cannot be empty")
    @Column(unique = true, nullable = false)
    private String password;
}
