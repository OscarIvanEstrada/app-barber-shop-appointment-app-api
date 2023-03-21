package com.test.repository;

import com.test.model.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import java.util.Optional;

public interface ClientRepository extends CrudRepository<ClientEntity, String> {
}
