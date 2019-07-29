create table member
(
	id bigint auto_increment,
	email varchar(255) null,
	name varchar(255) null,
	phone_number varchar(255) null,
	constraint member_pk
		primary key (id)
);