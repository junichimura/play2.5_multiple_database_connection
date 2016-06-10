# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table sample_table2 (
  sample_table2id           integer auto_increment not null,
  sample_table2value        varchar(255),
  constraint pk_sample_table2 primary key (sample_table2id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table sample_table2;

SET FOREIGN_KEY_CHECKS=1;

