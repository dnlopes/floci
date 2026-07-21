package io.github.hectorvent.floci.services.rds.model;

public enum DatabaseEngine {
    POSTGRES, AURORA_POSTGRESQL, MYSQL, AURORA_MYSQL, MARIADB;

    public int defaultPort() {
        return switch (this) {
            case POSTGRES, AURORA_POSTGRESQL -> 5432;
            case MYSQL, AURORA_MYSQL, MARIADB -> 3306;
        };
    }

    public DatabaseEngine baseEngine() {
        return switch (this) {
            case POSTGRES, AURORA_POSTGRESQL -> POSTGRES;
            case MYSQL, AURORA_MYSQL -> MYSQL;
            case MARIADB -> MARIADB;
        };
    }
}
