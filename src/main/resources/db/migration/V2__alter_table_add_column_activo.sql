ALTER TABLE medicos
ADD COLUMN IF NOT EXISTS activo boolean default true;

UPDATE medicos
SET activo = TRUE;