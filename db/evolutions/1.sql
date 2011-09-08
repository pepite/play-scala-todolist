# Item schema
 
# --- !Ups
 
CREATE TABLE Item (
    id bigint(20) NOT NULL AUTO_INCREMENT,
    name varchar(255) NOT NULL,
    isDone boolean NOT NULL,
    PRIMARY KEY (id)
);
 
# --- !Downs
 
DROP TABLE Item;
