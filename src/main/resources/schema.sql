CREATE TABLE IF NOT EXISTS REPOSITORIES (
    id BIGINT PRIMARY KEY,
    name VARCHAR(255),
    description TEXT,
    owner VARCHAR(255),
    language VARCHAR(100),
    stars INT,
    forks INT,
    last_updated TIMESTAMP now()
);
