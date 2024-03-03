alter table if exists address drop constraint if exists FK81ihijcn1kdfwffke0c0sjqeb;
alter table if exists combat_certificate drop constraint if exists FKjn7hw5eryalybhyedu4nc3mg2;
alter table if exists contract drop constraint if exists FKih9loscybtcycmwqwrohhjbhb;
alter table if exists driving_categories drop constraint if exists FKnyjth7gy643ywk3suq2lvgkf3;
alter table if exists driving_details drop constraint if exists FKmqgw4mqi61ag5if3fag77ruup;
alter table if exists driving_license drop constraint if exists FKk079qh64twltvdh12xqtnabds;
alter table if exists education drop constraint if exists FKkvbl6xk332o16kxhc8hp0pnhh;
alter table if exists jobs drop constraint if exists FKobv98o9lc93xw0ofs2dnvsl14;
alter table if exists mil_certificate drop constraint if exists FK74ihlfm08ssq48qk3kcnfgjaa;
alter table if exists military_details drop constraint if exists FK8q0wee0qttjyj300qholejy5;
alter table if exists passport drop constraint if exists FK6g8x932c2yca2nmyvmfh6i9g7;
alter table if exists phone_number drop constraint if exists FK4sjbpst35alcsan1qwbdb2nyu;
alter table if exists relatives drop constraint if exists FK6ysijdy2honj4fd5m8syb9s9e;
alter table if exists religion drop constraint if exists FKo6eqlgqcbyf9c3yywdgrybbph;
alter table if exists serviceman drop constraint if exists FK8iwnw17710yi4avtirx3ya3e7;
alter table if exists vehicles drop constraint if exists FKg9u68l7yyayt9pa8p7mxaai7u;
drop table if exists address cascade;
drop table if exists combat_certificate cascade;
drop table if exists contract cascade;
drop table if exists driving_categories cascade;
drop table if exists driving_details cascade;
drop table if exists driving_license cascade;
drop table if exists education cascade;
drop table if exists jobs cascade;
drop table if exists mil_certificate cascade;
drop table if exists military_details cascade;
drop table if exists passport cascade;
drop table if exists person cascade;
drop table if exists phone_number cascade;
drop table if exists relatives cascade;
drop table if exists religion cascade;
drop table if exists serviceman cascade;
drop table if exists vehicles cascade;

create table address
    (
    address_id bigserial not null,
    person_id bigint,
    address_label varchar(255),
    country varchar(255),
    region varchar(255),
    district varchar(255),
    settlement varchar(255),
    street varchar(255),
    building varchar(255),
    extension varchar(255),
    apartment varchar(255),
    post_code varchar(255),
    primary key (address_id)
    );

create table combat_certificate
    (
    combat_certificate_id bigserial not null,
    military_details_id bigint,
    combat_certificate_seria varchar(255),
    combat_certificate_number varchar(255),
    combat_certificate_issue_date date,
    primary key (combat_certificate_id)
    );

create table contract
    (
    contract_id bigserial not null,
    military_details_id bigint,
    contract_seria varchar(255),
    contract_number varchar(255),
    contract_issue_date date,
    contract_expiry_date date,
    primary key (contract_id)
    );

create table driving_categories
    (
    driving_categories_id bigserial not null,
    driving_license_id bigint unique,
    category_a boolean,
    category_b boolean,
    category_c boolean,
    category_d boolean,
    category_e boolean,
    primary key (driving_categories_id)
    );

create table driving_details
    (
    driving_details_id bigserial not null,
    person_id bigint,
    primary key (driving_details_id)
    );

create table driving_license
    (
    driving_license_id bigserial not null,
    driving_details_id bigint,
    driving_license_seria varchar(255),
    driving_license_number varchar(255),
    driving_license_issue_date date,
    driving_license_expiry_date date,
    primary key (driving_license_id)
    );

create table education
    (
    education_id bigserial not null,
    person_id bigint,
    education_level varchar(255) check (education_level in
        ('неповна_середня','середня','базова_вища','вища')),
    speciality varchar(255),
    primary key (education_id)
    );

create table jobs
    (
    job_id bigserial not null,
    person_id bigint,
    employer varchar(255),
    job_title varchar(255),
    primary key (job_id)
    );

create table mil_certificate
    (
    mil_certificate_issue_date date,
    mil_certificate_id bigserial not null,
    military_details_id bigint,
    mil_certificate_issued_by varchar(255),
    mil_certificate_number varchar(255),
    mil_certificate_seria varchar(255),
    mil_certificate_type varchar(255) check (mil_certificate_type in
        ('приписне_посвідчення','тимчасове_посвідчення','військовий_квиток')),
    primary key (mil_certificate_id)
    );

create table military_details
    (
    military_details_id bigserial not null,
    person_id bigint unique,
    military_rank_group varchar(255) check (military_rank_group in
        ('солдати','сержанти','офіцери')),
    position varchar(255),

    military_rank varchar(255) check (military_rank in
        ('рекрут','курсант','солдат','старший_солдат',
        'молодший_сержант','сержант','старший_сержант','головний_сержант',
        'штаб_сержант','майстер_сержант','старший_майстер_сержант','головний_майстер_сержант',
        'молодший_лейтенант','лейтенант','старший_лейтенант','капітан',
        'майор','підполковник','полковник',
        'бригадний_генерал','генерал_майор','генерал_лейтенант','генерал')),
    contract_signed boolean,
    primary key (military_details_id)
    );

create table passport
    (
    passport_id bigserial not null,
    person_id bigint,
    passport_seria varchar(255),
    passport_number varchar(255),
    passport_issue_date date,
    passport_expiry_date date,
    primary key (passport_id)
    );

create table person
    (
    person_id bigserial not null,
    first_name varchar(255),
    last_name varchar(255),
    middle_name varchar(255),
    primary key (person_id)
    );

create table phone_number
    (
    phone_number_id bigserial not null,
    person_id bigint,
    phone_number varchar(255),
    primary key (phone_number_id)
    );

create table relatives
    (
    person_id bigint not null,
    label varchar(255),
    occupation varchar(255),
    primary key (person_id)
    );

create table religion
    (
    religion_id bigserial not null,
    person_id bigint,
    religious boolean,
    religion_type varchar(255),
    religion_confession varchar(255),
    church varchar(255),
    primary key (religion_id)
    );

create table serviceman
    (

    birth_date date,
    person_id bigint not null,
    blood_type varchar(255),
    tax_code varchar(255),
    primary key (person_id)
    );

create table vehicles
    (
    vehicle_id bigserial not null,
    driving_details_id bigint,
    vehicle_produce varchar(255),
    vehicle_model varchar(255),
    vehicle_number_plate varchar(255),
    vehicle_color varchar(255),
    primary key (vehicle_id)
    );


alter table if exists address add constraint FK81ihijcn1kdfwffke0c0sjqeb foreign key (person_id) references person;
alter table if exists combat_certificate add constraint FKjn7hw5eryalybhyedu4nc3mg2 foreign key (military_details_id) references military_details;
alter table if exists contract add constraint FKih9loscybtcycmwqwrohhjbhb foreign key (military_details_id) references military_details;
alter table if exists driving_categories add constraint FKnyjth7gy643ywk3suq2lvgkf3 foreign key (driving_license_id) references driving_license;
alter table if exists driving_details add constraint FKmqgw4mqi61ag5if3fag77ruup foreign key (person_id) references serviceman;
alter table if exists driving_license add constraint FKk079qh64twltvdh12xqtnabds foreign key (driving_details_id) references driving_details;
alter table if exists education add constraint FKkvbl6xk332o16kxhc8hp0pnhh foreign key (person_id) references serviceman;
alter table if exists jobs add constraint FKobv98o9lc93xw0ofs2dnvsl14 foreign key (person_id) references serviceman;
alter table if exists mil_certificate add constraint FK74ihlfm08ssq48qk3kcnfgjaa foreign key (military_details_id) references military_details;
alter table if exists military_details add constraint FK8q0wee0qttjyj300qholejy5 foreign key (person_id) references serviceman;
alter table if exists passport add constraint FK6g8x932c2yca2nmyvmfh6i9g7 foreign key (person_id) references serviceman;
alter table if exists phone_number add constraint FK4sjbpst35alcsan1qwbdb2nyu foreign key (person_id) references person;
alter table if exists relatives add constraint FK6ysijdy2honj4fd5m8syb9s9e foreign key (person_id) references serviceman;
alter table if exists religion add constraint FKo6eqlgqcbyf9c3yywdgrybbph foreign key (person_id) references serviceman;
alter table if exists serviceman add constraint FK8iwnw17710yi4avtirx3ya3e7 foreign key (person_id) references person;
alter table if exists vehicles add constraint FKg9u68l7yyayt9pa8p7mxaai7u foreign key (driving_details_id) references driving_details;