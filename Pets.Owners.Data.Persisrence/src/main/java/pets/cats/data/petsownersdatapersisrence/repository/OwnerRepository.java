package pets.cats.data.petsownersdatapersisrence.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import pets.cats.data.petsownersdatapersisrence.entity.Owner;

public interface OwnerRepository extends JpaRepository<Owner, UUID> { }