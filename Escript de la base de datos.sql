
-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS finaltask DEFAULT CHARACTER SET utf8 ;
USE finaltask ;

-- -----------------------------------------------------
-- Table lobby
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS lobby (
  lob_id INT NOT NULL AUTO_INCREMENT,
  lob_actived TINYINT NULL,
  PRIMARY KEY (lob_id))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table game
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS game (
  gam_id INT NOT NULL AUTO_INCREMENT,
  gam_finished TINYINT NOT NULL DEFAULT 0,
  gam_winner_email VARCHAR(45) NULL,
  lobby_lob_id INT NOT NULL,
  PRIMARY KEY (gam_id),
  INDEX fk_game_lobby1_idx (lobby_lob_id ASC) VISIBLE,
  CONSTRAINT fk_game_lobby1
    FOREIGN KEY (lobby_lob_id)
    REFERENCES lobby (lob_id)
    ON DELETE RESCTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table gamer
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS gamer (
  gam_id INT NOT NULL AUTO_INCREMENT,
  gam_id_mongo VARCHAR(50) NOT NULL,
  gam_email VARCHAR(45) NOT NULL,
  lobby_lob_id INT NOT NULL,
  PRIMARY KEY (gam_id),
  INDEX fk_gamers_lobby_idx (lobby_lob_id ASC) VISIBLE,
  CONSTRAINT fk_gamers_lobby
    FOREIGN KEY (lobby_lob_id)
    REFERENCES lobby (lob_id)
    ON DELETE RESCTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table numberblackboard
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS numberblackboard (
  nbl_id INT NOT NULL AUTO_INCREMENT,
  nbl_letter VARCHAR(1) NOT NULL,
  nbl_number VARCHAR(2) NOT NULL,
  game_gam_id INT NOT NULL,
  PRIMARY KEY (nbl_id),
  INDEX fk_numberblackboard_game1_idx (game_gam_id ASC) VISIBLE,
  CONSTRAINT fk_numberblackboard_game1
    FOREIGN KEY (game_gam_id)
    REFERENCES game (gam_id)
    ON DELETE RESCTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table numberpaperboard
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS numberpaperboard (
  npa_id INT NOT NULL AUTO_INCREMENT,
  npa_location VARCHAR(2) NULL,
  npa_number VARCHAR(45) NULL,
  gamer_gam_id INT NOT NULL,
  PRIMARY KEY (npa_id),
  INDEX fk_numberpaperboard_gamer1_idx (gamer_gam_id ASC) VISIBLE,
  CONSTRAINT fk_numberpaperboard_gamer1
    FOREIGN KEY (gamer_gam_id)
    REFERENCES gamer (gam_id)
    ON DELETE RESCTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;

alter table numberblackboard
    drop column nbl_letter;

alter table numberblackboard
    modify nbl_number varchar(6) not null;

alter table numberpaperboard
    drop column npa_location;

create table barprogress
(
    lob_id  int not null,
    bar_var int not null
);

alter table barprogress
    add bar_id int;

alter table barprogress
    add constraint barprogress_pk
        primary key (bar_id);

alter table barprogress
    modify bar_id int auto_increment;

alter table game
    change gam_winner_email gam_winner_id varchar(45) null;

create unique index barprogress_lob_id_uindex
    on barprogress (lob_id);


