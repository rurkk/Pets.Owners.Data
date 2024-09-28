package pets.cats.data.petsownersdatapersisrence.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.UUID;
import lombok.*;

@Data
@NoArgsConstructor
@Builder
@Entity
@Table(
        name = "owners",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"id"})})
public class Owner {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

    @Column(name = "user_id")
    private UUID userId;

    public Owner(UUID id, String name, LocalDate birthDate, UUID userId) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.userId = userId;
    }
}