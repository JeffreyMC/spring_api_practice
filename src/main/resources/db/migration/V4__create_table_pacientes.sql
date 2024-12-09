CREATE TABLE pacientes (
                           id BIGSERIAL PRIMARY KEY,
                           nombre VARCHAR(100) NOT NULL,
                           email VARCHAR(100) NOT NULL UNIQUE,
                           documento_identidad VARCHAR(14) NOT NULL UNIQUE,
                           telefono VARCHAR(20) NOT NULL,
                           calle VARCHAR(100) NOT NULL,
                           distrito VARCHAR(100) NOT NULL,
                           complemento VARCHAR(100),
                           numero VARCHAR(20),
                           ciudad VARCHAR(100) NOT NULL,
                           activo SMALLINT NOT NULL
);