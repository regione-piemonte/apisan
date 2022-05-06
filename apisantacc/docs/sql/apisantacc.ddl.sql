-- Script di creazione delle tabelle necessarie al Taccuino
-- Versione 0.1.0 
-- ultima modifica 17/02/2021


-- Table: apisan_tacc_t_log_chiamate

-- DROP TABLE apisan_tacc_t_log_chiamate;

CREATE TABLE apisan_tacc_t_log_chiamate
(
    tacc_chiamate_id bigint NOT NULL DEFAULT nextval('apisan_t_tacc_log_chiamate_tacc_chiamate_id_seq'::regclass),
    x_request_id character varying(200) COLLATE pg_catalog."default",
    cf_chiamante character varying(16) COLLATE pg_catalog."default",
    x_codice_servizio character varying(50) COLLATE pg_catalog."default",
    ip_chiamante character varying(200) COLLATE pg_catalog."default",
    cf_richiedente character varying(16) COLLATE pg_catalog."default",
    componente character varying(20) COLLATE pg_catalog."default",
    esito_chiamata integer,
    request_payload bytea,
    response_payload bytea,
    request_date timestamp without time zone,
    response_date timestamp without time zone,
    millis_response bigint,
    metodo character varying(20) COLLATE pg_catalog."default",
    request_uri character varying(200) COLLATE pg_catalog."default",
    CONSTRAINT apisan_t_tacc_log_chiamate_pk PRIMARY KEY (tacc_chiamate_id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE apisan_tacc_t_log_chiamate
    OWNER to apisantracdb;

GRANT ALL ON TABLE apisan_tacc_t_log_chiamate TO apisantracdb;

GRANT DELETE, UPDATE, INSERT, SELECT ON TABLE apisan_tacc_t_log_chiamate TO apisantracdb_rw;


-- Aggiungere qui nuove modifiche e cambiare versione al documento