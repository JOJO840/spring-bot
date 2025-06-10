package org.lexicon.springbot.repository;

import org.lexicon.springbot.entity.Details;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DetailsRepository extends CrudRepository<Details, Integer> {
    Optional<Details> findByEmail(String email);
    List<Details> findByNameContainingIgnoreCase(String name);
    Optional<Details> findByNameIgnoreCase(String name);

}
