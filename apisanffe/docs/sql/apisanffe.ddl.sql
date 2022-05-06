
CREATE TABLE apisantracdb.apisan_ffe_t_log_chiamate (
	ffe_chiamate_id bigserial NOT NULL,
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
	request_uri varchar(200) NULL,
	CONSTRAINT apisan_ffe_t_log_chiamate_pk PRIMARY KEY (ffe_chiamate_id)
);



