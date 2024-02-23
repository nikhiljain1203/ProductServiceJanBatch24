CREATE TABLE category
(
    id   BIGINT NOT NULL,
    name VARCHAR(255) NULL,
    CONSTRAINT PK_CATEGORY PRIMARY KEY (id)
);

CREATE TABLE jt_mentor
(
    id     BIGINT NOT NULL,
    rating INT    NOT NULL,
    CONSTRAINT PK_JT_MENTOR PRIMARY KEY (id)
);

CREATE TABLE jt_student
(
    id    BIGINT NOT NULL,
    psp   INT    NOT NULL,
    batch VARCHAR(255) NULL,
    CONSTRAINT PK_JT_STUDENT PRIMARY KEY (id)
);

CREATE TABLE jt_user
(
    id       BIGINT NOT NULL,
    email    VARCHAR(255) NULL,
    password VARCHAR(255) NULL,
    name     VARCHAR(255) NULL,
    CONSTRAINT PK_JT_USER PRIMARY KEY (id)
);

CREATE TABLE mentor
(
    id       BIGINT NOT NULL,
    email    VARCHAR(255) NULL,
    password VARCHAR(255) NULL,
    name     VARCHAR(255) NULL,
    rating   INT    NOT NULL,
    CONSTRAINT PK_MENTOR PRIMARY KEY (id)
);

CREATE TABLE product
(
    id            BIGINT NOT NULL,
    title         VARCHAR(255) NULL,
    `description` VARCHAR(255) NULL,
    price         BIGINT NULL,
    category_id   BIGINT NULL,
    quantity      INT    NOT NULL,
    CONSTRAINT PK_PRODUCT PRIMARY KEY (id)
);

CREATE TABLE st_user
(
    id        BIGINT NOT NULL,
    user_type INT NULL,
    email     VARCHAR(255) NULL,
    password  VARCHAR(255) NULL,
    name      VARCHAR(255) NULL,
    rating    INT    NOT NULL,
    psp       INT    NOT NULL,
    batch     VARCHAR(255) NULL,
    CONSTRAINT PK_ST_USER PRIMARY KEY (id)
);

CREATE TABLE student
(
    id       BIGINT NOT NULL,
    email    VARCHAR(255) NULL,
    password VARCHAR(255) NULL,
    name     VARCHAR(255) NULL,
    psp      INT    NOT NULL,
    batch    VARCHAR(255) NULL,
    CONSTRAINT PK_STUDENT PRIMARY KEY (id)
);

CREATE TABLE tpc_mentor
(
    id       BIGINT NOT NULL,
    email    VARCHAR(255) NULL,
    password VARCHAR(255) NULL,
    name     VARCHAR(255) NULL,
    rating   INT    NOT NULL,
    CONSTRAINT PK_TPC_MENTOR PRIMARY KEY (id)
);

CREATE TABLE tpc_student
(
    id       BIGINT NOT NULL,
    email    VARCHAR(255) NULL,
    password VARCHAR(255) NULL,
    name     VARCHAR(255) NULL,
    psp      INT    NOT NULL,
    batch    VARCHAR(255) NULL,
    CONSTRAINT PK_TPC_STUDENT PRIMARY KEY (id)
);

CREATE TABLE tpc_user
(
    id       BIGINT NOT NULL,
    email    VARCHAR(255) NULL,
    password VARCHAR(255) NULL,
    name     VARCHAR(255) NULL,
    CONSTRAINT PK_TPC_USER PRIMARY KEY (id)
);

CREATE INDEX FK_PRODUCT_ON_CATEGORY ON product (category_id);

ALTER TABLE jt_mentor
    ADD CONSTRAINT FK_JT_MENTOR_ON_ID FOREIGN KEY (id) REFERENCES jt_user (id) ON UPDATE RESTRICT ON DELETE RESTRICT;

ALTER TABLE jt_student
    ADD CONSTRAINT FK_JT_STUDENT_ON_ID FOREIGN KEY (id) REFERENCES jt_user (id) ON UPDATE RESTRICT ON DELETE RESTRICT;

ALTER TABLE product
    ADD CONSTRAINT FK_PRODUCT_ON_CATEGORY FOREIGN KEY (category_id) REFERENCES category (id) ON UPDATE RESTRICT ON DELETE RESTRICT;