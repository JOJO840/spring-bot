package org.lexicon.springbot.repository;

import org.lexicon.springbot.entity.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface AppUserRepository extends CrudRepository<AppUser, Integer> {
    Optional<AppUser> findByUsername(String username);
    List<AppUser> findByRegistrationDateBetween(LocalDate start, LocalDate end);
    Optional<AppUser> findByDetails_Id(Integer detailsId);
    Optional<AppUser> findByDetails_EmailIgnoreCase(String email);

}
