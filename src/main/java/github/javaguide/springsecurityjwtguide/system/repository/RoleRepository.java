package github.javaguide.springsecurityjwtguide.system.repository;

import github.javaguide.springsecurityjwtguide.system.entity.Role;
import github.javaguide.springsecurityjwtguide.system.enums.RoleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleType roleType);
}
