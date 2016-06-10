# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table sample_table1 (
  sample_table1id           integer auto_increment not null,
  sample_table1value        varchar(255),
  constraint pk_sample_table1 primary key (sample_table1id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table sample_table1;

SET FOREIGN_KEY_CHECKS=1;

