create table loan
(
  id  uuid primary key default gen_random_uuid(),
  book_id uuid not null,
  user_id uuid not null
);


