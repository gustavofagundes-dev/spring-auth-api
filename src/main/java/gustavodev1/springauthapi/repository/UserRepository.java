package gustavodev1.springauthapi.repository;

import gustavodev1.springauthapi.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
