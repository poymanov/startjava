CREATE DATABASE jaegers;

\c jaegers

CREATE TABLE robots (
    id SERIAL PRIMARY KEY,
    mark char(6) NOT NULL,
    height REAL NOT NULL,
    weight REAL NOT NULL,
    status char(9) NOT NULL,
    origin TEXT NOT NULL,
    launch DATE NOT NULL,
    kaijuKill INTEGER
);