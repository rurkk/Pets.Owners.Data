/*
    Owner table
*/
create table if not exists cats_db.public.owners
(
    id         uuid not null
        constraint owners_pkey
            primary key,
    name       text not null,
    birth_date date not null,
    user_id   uuid unique references users on delete set null
);

alter table cats_db.public.owners
    owner to catapi_user;