\c jaegers

CREATE TABLE robots (
    id SERIAL PRIMARY KEY,
    mark TEXT,
    height REAL,
    weight REAL,
    status TEXT,
    origin TEXT,
    launch DATE,
    kaijuKill INTEGER
);

INSERT INTO robots (mark, height, weight, status, origin, launch, kaijuKill) VALUES
    ('Mark-1', '90.2', '2', 'Destroyed', 'USA', '2015-01-30', '2'),
    ('Mark-1', '85.34', '2.312', 'Destroyed', 'Japan', '2015-12-30', '2'),
    ('Mark-6', '81.77', '2.004', 'Runs', 'USA', '2034-01-12', '1'),
    ('Mark-5', '76.2', '1.850', 'Runs', 'Australia', '2019-11-02', '11'),
    ('Mark-1', '85.34', '2.412', 'Destroyed', 'Russia', '2015-01-01', '6'),
    ('Mark-7', '76.91', '1.628', 'Destroyed', 'Russia', '2033-12-20', '1'),
    ('Mark-1', '87.56', '1.898', 'Runs', 'USA', '2015-01-30', '2'),
    ('Mark-3', '79.25', '1.980', 'Destroyed', 'USA', '2017-07-30', '9'),
    ('Mark-4', '76.2', '1.722', 'Runs', 'China', '2018-08-22', '7'),
    ('Mark-9', '78.26', '1.365', 'Runs', 'Russia', '2022-06-19', '4');