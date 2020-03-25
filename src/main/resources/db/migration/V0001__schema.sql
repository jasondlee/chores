create table family
(
    id        UUID PRIMARY KEY NOT NULL,
    last_name varchar(255)     NOT NULL
);

create table member
(
    id        UUID PRIMARY KEY NOT NULL,
    family_id UUID             NOT NULL REFERENCES family (id),
    name      varchar(255)     NOT NULL,
    email     varchar(255)     NOT NULL,
    password  varchar(255)     NOT NULL,
    is_parent boolean default false

);

create table chores
(
    id          UUID PRIMARY KEY NOT NULL,
    name        varchar(255)     NOT NULL,
    description text,
    member_id   UUID REFERENCES member (id),
    frequency   int,
    start_date   timestamp with time zone,
    end_date     timestamp with time zone,
    completed   BOOLEAN DEFAULT false,
    deleted     BOOLEAN DEFAULT false
);

create table chore_assignment
(
    id         UUID PRIMARY KEY NOT NULL,
    fk_chore   UUID             NOT NULL REFERENCES chores (id),
    completed  boolean default false,
    start_date timestamp with time zone,
    end_date   timestamp with time zone
);
