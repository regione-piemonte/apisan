CREATE TABLE apisan_farm_t_log_chiamate (
	farm_chiamate_id bigserial NOT NULL,
	x_request_id varchar(200) NULL,
	cf_chiamante varchar(16) NULL,
	x_codice_servizio varchar(50) NULL,
	ip_chiamante varchar(200) NULL,
	cf_richiedente varchar(16) NULL,
	componente varchar(20) NULL,
	esito_chiamata int4 NULL,
	request_payload bytea NULL,
	response_payload bytea NULL,
	request_date timestamp NULL,
	response_date timestamp NULL,
	millis_response int8 NULL,
	metodo varchar(20) NULL,
	request_uri varchar(400) NULL,
	CONSTRAINT apisan_farm_t_log_chiamate_pk PRIMARY KEY (farm_chiamate_id)
);


CREATE TABLE apisan_farm_d_errore_presentation (
	id int4 NOT NULL,
	code varchar(30) NOT NULL,
	status int4 NOT NULL,
	title varchar(100) NOT NULL,
	CONSTRAINT apisan_farm_d_errore_presentation_pkey PRIMARY KEY (id)
);



CREATE TABLE apisan_farm_d_errore_business (
	farm_d_errore_business_id bigserial NOT NULL,
	cod_err varchar(20) NOT NULL,
	farm_d_presentation_id int4 NOT NULL,
	desc_err varchar NULL,
	CONSTRAINT apisan_farm_d_errore_business_pk PRIMARY KEY (farm_d_errore_business_id)
);



ALTER TABLE apisan_farm_d_errore_business ADD CONSTRAINT apisan_farm_d_errore_business_apisan_farm_d_errore_pr FOREIGN KEY (farm_d_presentation_id) REFERENCES apisan_farm_d_errore_presentation(id);