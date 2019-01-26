create table currency (
  id bigserial not null primary key,
  code varchar (255) not null,
  description varchar (255) not null,
  constraint currency_code_unq unique (code)
);

insert into currency(code, description) values ('EUR', 'Евро');
insert into currency(code, description) values ('RUR', 'Рубли');
insert into currency(code, description) values ('USD', 'Доллары');

create table currency_history(
  id bigserial not null primary key,
  currency_id bigint not null references currency(id),
  value decimal not null,
  date timestamp not null
);