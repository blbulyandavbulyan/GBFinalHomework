CREATE TABLE animal_commands
(
    animal_id BIGINT NOT NULL,
    commands  VARCHAR(255) NULL
);

CREATE TABLE animals
(
    id            BIGINT AUTO_INCREMENT NOT NULL,
    animal_type   VARCHAR(31) NULL,
    name          VARCHAR(255) NULL,
    date_of_birth date NULL,
    CONSTRAINT pk_animals PRIMARY KEY (id)
);

ALTER TABLE animal_commands
    ADD CONSTRAINT fk_animal_commands_on_animal FOREIGN KEY (animal_id) REFERENCES animals (id);