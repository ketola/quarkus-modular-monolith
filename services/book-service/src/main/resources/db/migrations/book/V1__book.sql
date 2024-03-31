create table book
(
  id  uuid primary key default gen_random_uuid(),
  name varchar not null
);

-- insert two books
insert into book (name) values ('The Hobbit');
insert into book (name) values ('The Lord of the Rings');
